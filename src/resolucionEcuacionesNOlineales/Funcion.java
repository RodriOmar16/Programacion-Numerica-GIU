package resolucionEcuacionesNOlineales;

import java.util.ArrayList;

import org.nfunk.jep.JEP;

public class Funcion {
	//Atributos
	private String funcion, error;
	private JEP jep;
	private double resultado;
	private ArrayList<Derivada> funcionesDerivadas;
	
	
	//Constructor
	public Funcion(String func) {
		this.funcion 	        = func;
		this.funcionesDerivadas = new ArrayList<Derivada>();
		this.resultado          = 0;
		this.error              = "";
		this.jep 		        = new JEP();
	}
	
	//Methods
	public String getFuncion(){ return this.funcion; }
    public void setFuncion(String funcion){ this.funcion = funcion; }
    
    public double getResultadoFuncion(){  return this.resultado; }
    
    public String getError(){ return this.error; }
    
    public String getDerivada(int orden) { 
    	String derivada = "";
    	derivada = this.funcionesDerivadas.get(orden - 1).getFuncion();
    	return derivada;
    }
    
    public double evaluar(double nro){
        
        /*this.jep.addStandardFunctions();
        this.jep.addStandardConstants();
        this.jep.addVariable("x", nro);
        this.jep.parseExpression(this.funcion);
        this.resultado = this.jep.getValue();
        this.error = (this.jep.hasError())? "Existe un error.":"No hay error.";*/
        
        return evaluar(nro, this.funcion);
    }
    public double evaluar(double nro, String funcionEvaluar){
        
        this.jep.addStandardFunctions();
        this.jep.addStandardConstants();
        this.jep.addVariable("x", nro);
        this.jep.parseExpression(funcionEvaluar);
        this.resultado = this.jep.getValue();
        this.error = (this.jep.hasError())? "Error: "+this.jep.getErrorInfo():"";
        
        return this.resultado;
    }
    public void derivar() {
    	if(this.funcionesDerivadas.size() == 0) {
    		this.funcionesDerivadas.add(new Derivada(this.funcion));
    	}else {
    		int pos = this.funcionesDerivadas.size()- 1;
    		this.funcionesDerivadas.add(new Derivada(this.funcionesDerivadas.get(pos).getFuncion()));
    	}
    }
    
    public String toString() {
    	String str = "";
    	str += "f(x) = "+this.funcion+"\n";
    	for(int i=0; i<this.funcionesDerivadas.size() ;i++ ) {
    		str += "derivada de orden "+(i+1)+": "+this.funcionesDerivadas.get(i).toString()+"\n";
    	}
    	return str;
    }
}
