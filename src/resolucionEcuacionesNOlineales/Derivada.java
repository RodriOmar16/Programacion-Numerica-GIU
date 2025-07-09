package resolucionEcuacionesNOlineales;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class Derivada {
	//atributos
	private String expresion;
	private DJep djep;
	private Node nodoFuncion;
	private Node nodoDerivada;
	
	//Constructor
	public Derivada(String func) {
		derivar(func);
	}
	
	//Methods
	public void setFuncion(String func) { this.expresion = func; }
	public String getFuncion() { return this.expresion; }
	
	public void derivar(String func) {
		try {
			this.djep = new DJep();
            // agrega funciones estandares cos(x), sin(x)
            this.djep.addStandardFunctions();
            // agrega constantes estandares, pi, e, etc
            this.djep.addStandardConstants();
            // por si existe algun numero complejo
            this.djep.addComplex();
            // permite variables no declarables
            this.djep.setAllowUndeclared(true);
            // permite asignaciones
            this.djep.setAllowAssignment(true);
            // regla de multiplicacion o para sustraccion y sumas
            this.djep.setImplicitMul(true);
            // regla de multiplicacion o para sustraccion y sumas
            this.djep.addStandardDiffRules();
            // coloca el nodo con una funcion preestablecida
            this.nodoFuncion = this.djep.parse(func);
            // deriva la funcion con respecto a x
            Node diff = this.djep.differentiate(nodoFuncion, "x");
            // Simplificamos la funcion con respecto a x
            this.nodoDerivada = this.djep.simplify(diff);
            // Convertimos el valor simplificado en un String
            this.expresion = this.djep.toString(this.nodoDerivada);
		}catch(ParseException e) {
			this.expresion = "NaN";
            System.out.println("Error: " + e.getErrorInfo());
		}
	}
	public String toString() {
		String str = "";
		str += this.expresion + "\n";
		return str;
 	}
}
