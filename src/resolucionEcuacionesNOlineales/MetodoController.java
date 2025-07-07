package resolucionEcuacionesNOlineales;

import java.util.ArrayList;
import java.util.List;

public class MetodoController {
	//Atributos
	private Funcion funcion;
	private List<String[]> matriz, matrizAitken;
	private String error;
	
	//Constructor
	public MetodoController(String func) {
		this.funcion = new Funcion(func);
		this.matriz  = new ArrayList<>();
	}
	
	//Getters
	public String getFuncion() { return this.funcion.getFuncion(); }
	public String getError() { return this.error; }
	public List<String[]> getMatriz(){ return this.matriz; }
	public List<String[]> getMatrizAitken(){ return this.matrizAitken; }
	
	//Methods
	public double calcular(int metodo, int inicial, int b, int epsilon) {
		double resultado = 0;
		switch(metodo) {
			//métodos cerrados
			case 1 -> resultado = biseccion(inicial, b, epsilon);
			case 2 -> resultado = regulaFalsi(inicial, b, epsilon);
			case 3 -> resultado = regulaFalsiModificada(inicial, b, epsilon);
			//métodos abiertos
			case 4 -> resultado = secante(inicial, b, epsilon);
			case 5 -> resultado = newtonRaphson(inicial,epsilon);
			case 6 -> resultado = puntoFijo(epsilon);
			case 7 -> resultado = convergenciaCubica(inicial,epsilon);
		}
		return resultado;
	}
	public double calcularAitken(int col, double epsilon) {
		this.matrizAitken = new ArrayList<>();
		
		int i = 0,j,k;
		double an=100, an1 = 0, x0, x1, x2;
		do {
			an = an1;
			j = i + 1;
			k = i + 2;
			x0 = Double.parseDouble(this.matriz.get(i)[col]);
			x1 = Double.parseDouble(this.matriz.get(j)[col]);
			x2 = Double.parseDouble(this.matriz.get(k)[col]);
			an1 = x0 - (Math.pow((x1 - x0),2) - (x2 - 2*x1 + x0));
			//System.out.println("an1: "+ an1);
			
			this.matriz.add(new String[] {String.valueOf(i),String.valueOf(x0), String.valueOf(x1),String.valueOf(x2),String.valueOf(an1)});
			
			i++;
		}while(i < (this.matriz.size()-2) && Math.abs(an1- an) > epsilon);
		//System.out.println("an1: "+ an1);
		this.matriz.add(new String[] {String.valueOf(i),String.valueOf(x0), String.valueOf(x1),String.valueOf(x2),String.valueOf(an1)});
		return an1;
	}
	private double biseccion(double a, double b, double epsilon) {
		//reseteo
		this.matriz.clear();

		int t = 14, i = 0;// n = 0; m = 0;
		
		double  fa = this.funcion.evaluar(a),
				c = (a+b)/2,
				fc = funcion.evaluar(c),
				fb = funcion.evaluar(b);
		
		this.matriz.add(new String[] {String.valueOf(i),String.valueOf(a), String.valueOf(fa),String.valueOf(b),String.valueOf(fb),String.valueOf(c), String.valueOf(fc)});
		
		while(Math.abs(fc)>epsilon && i<t) {
			if(fa * fc < 0) b = c;
			else a = c;
			
			c = (a+b)/2;
			fc = funcion.evaluar(c);
			
			fa = funcion.evaluar(a);
			fb = funcion.evaluar(b);
			
			i++;
			this.matriz.add(new String[] {String.valueOf(i),String.valueOf(a), String.valueOf(fa),String.valueOf(b),String.valueOf(fb),String.valueOf(c), String.valueOf(fc)});
		}
		if(i >= 14) {
			System.out.println("Se superó el límite de iteraciones.!!");
		}
		return c;
	}
	private double regulaFalsi(double a, double b, double epsilon) {
		//reseteo
		this.matriz.clear();
				
		int t = 15, i = 0;
			 
		double  fa = funcion.evaluar(a),
				fb = funcion.evaluar(b),
				c  = (a*fb - b*fa)/(fb - fa),
				fc = funcion.evaluar(c);
		
		this.matriz.add(new String[] {String.valueOf(i),String.valueOf(a), String.valueOf(fa),String.valueOf(b),String.valueOf(fb),String.valueOf(c), String.valueOf(fc)});
		
		while(Math.abs(fc)>epsilon && i<t) {
			if(fa * fc < 0) b = c;
			else a = c;
			 
			fa = funcion.evaluar(a);
			fb = funcion.evaluar(b);
			
			c = (a*fb - b*fa)/(fb - fa);
			fc = funcion.evaluar(c);
			
			i++;
			this.matriz.add(new String[] {String.valueOf(i),String.valueOf(a), String.valueOf(fa),String.valueOf(b),String.valueOf(fb),String.valueOf(c), String.valueOf(fc)});
		}
		return c;
	}
	private double regulaFalsiModificada(double a, double b, double epsilon) {
		//reseteo
		this.matriz.clear();
		
		int t = 9, i = 0;
			 
		double  fa = funcion.evaluar(a), 
				F  = fa, 
				w  = fa,
				fb = funcion.evaluar(b), 
				G  = fb,
				c  = (a*fb-b*fa)/(fb-fa),
				fc = funcion.evaluar(c);
		
		this.matriz.add(new String[] {String.valueOf(i),String.valueOf(a), String.valueOf(fa),String.valueOf(b),String.valueOf(fb),String.valueOf(c), String.valueOf(fc)});
		
		while(Math.abs(fc)>epsilon && i<t) {
			if(fa * fc < 0) {
				b = c;
				G = fc;
				if(w * G > 0) F = F/2; 
			}
			else {
				a = c;
				F = fc;
				if(w * F > 0) G = G/2;
			}
			w = fc;
			fa = funcion.evaluar(a);
						
			c = (a*G-b*F)/(G-F);
			fc = funcion.evaluar(c);
			
			i++;
			this.matriz.add(new String[] {String.valueOf(i),String.valueOf(a), String.valueOf(fa),String.valueOf(b),String.valueOf(fb),String.valueOf(c), String.valueOf(fc)});
		}
		mostrasTabla();
		return c;
	}
	private double secante(double a, double b, double epsilon) {
		//reseteo
		this.matriz.clear();
		
		int t = 6, i = 0;
		double x0 = a , x1 = b, xMas1 = b*2,
			   fx0 = funcion.evaluar(x0),
			   fx1 = funcion.evaluar(x1);
		
		this.matriz.add(new String[] {String.valueOf(i),String.valueOf(x0),String.valueOf(fx0),String.valueOf(x1), String.valueOf(fx1),String.valueOf(xMas1)});
		
		while(Math.abs(x1-x0) > epsilon/* && i<t*/) {
			xMas1 = (x0*fx1 - x1*fx0)/(fx1 - fx0);
			
			i++;
			this.matriz.add(new String[] {String.valueOf(i),String.valueOf(x0),String.valueOf(fx0),String.valueOf(x1), String.valueOf(fx1),String.valueOf(xMas1)});
			
			x0 = x1; 
			fx0 = funcion.evaluar(x0);
			
			x1 = xMas1; 
			fx1 = funcion.evaluar(x1);
		}
		mostrasTabla();
		return xMas1;
	}
	private double newtonRaphson(double valInicial, double epsilon) {
		//reseteo
		this.matriz.clear();
			
        double xn, 
        	   xMas1 = valInicial,
        	   fxn, 
        	   fDerivadaXn;
        boolean derivadaCero = false;
        int i = 0;
        
        this.funcion.derivar();
        Funcion derivada = new Funcion(this.funcion.getDerivada(1));
        
        do{
        	//System.out.println("i: "+i+"	"+xMas1);
    		xn = xMas1; 
        	
        	fxn = this.funcion.evaluar(xn);
        	fDerivadaXn = derivada.evaluar(xn);
        	
        	this.matriz.add(new String[] {String.valueOf(i),String.valueOf(xn),String.valueOf(xMas1), String.valueOf(fxn), String.valueOf(fDerivadaXn),String.valueOf(Math.abs(xMas1 - xn))});
    		i++;
        	
        	if(fDerivadaXn != 0.0) {
        		xMas1 = xn - (fxn/fDerivadaXn);
        	}else derivadaCero = true;
        }while(Math.abs(xMas1 - xn) > epsilon && !derivadaCero);
        
        if(!derivadaCero){
        	this.matriz.add(new String[] {String.valueOf(i),String.valueOf(xn),String.valueOf(xMas1), String.valueOf(fxn), String.valueOf(fDerivadaXn),String.valueOf(Math.abs(xMas1 - xn))});
        }else 
        	this.error = "NO se admite derivada = 0 en el algoritmo.";
        	
        return xMas1;
	}
	private double puntoFijo(double  epsilon) {
		//reseteo
		this.matriz.clear();
		
		double xi, xiMas1 = 1; //valor inicial
		int i = 0;
		do {
			xi = xiMas1;
			System.out.println("i: "+i+"	xi: "+xi);
			this.matriz.add(new String[] {String.valueOf(i),String.valueOf(xi),String.valueOf(xiMas1),String.valueOf(Math.abs(xiMas1 - xi))});
		
			xiMas1 = this.funcion.evaluar(xi);
			
			this.matriz.add(new String[] {String.valueOf(i),String.valueOf(xi),String.valueOf(xiMas1),String.valueOf(Math.abs(xiMas1 - xi))});
			i++;
		}while(Math.abs(xiMas1 - xi) > epsilon && i < 100);
		this.matriz.add(new String[] {String.valueOf(i),String.valueOf(xi),String.valueOf(xiMas1),String.valueOf(Math.abs(xiMas1 - xi))});
		return xiMas1;
	}
	
	private double convergenciaCubica(double a, double epsilon) {
		//reseteo
		this.matriz.clear();
		
		//derivamos 2 veces
		this.funcion.derivar();
        Funcion derivada = new Funcion(this.funcion.getDerivada(1));
		this.funcion.derivar();
        Funcion derivada2da = new Funcion(this.funcion.getDerivada(2));
        
        double xn, xn1=a, fxn, fpxn, fpsxn;
        int i=0;
        
        do {
        	xn = xn1;
        	
        	fxn   = this.funcion.evaluar(xn);
        	fpxn  = derivada.evaluar(xn);
        	fpsxn = derivada2da.evaluar(xn);
 
        	xn1 = xn - (2*fxn*fpxn)/((2*Math.pow(fpxn, 2))-(fxn * fpsxn));

        	this.matriz.add(new String[] {String.valueOf(i),String.valueOf(xn),String.valueOf(fxn), String.valueOf(fpxn), String.valueOf(fpsxn),String.valueOf(Math.abs(xn1 - xn))});
        	i++;
        }while(Math.abs(xn1 - xn) > epsilon);
        
		return xn1;
	}
	
	private void mostrasTabla() {
		for (String[] fila : matriz) {
		    for (String valor : fila) {
		        System.out.print(valor + " ");
		    }
		    System.out.println();
		}
	}
}
