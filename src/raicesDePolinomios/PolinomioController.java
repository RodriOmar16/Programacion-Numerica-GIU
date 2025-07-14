package raicesDePolinomios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PolinomioController {
	private Polinomio polinomio;
	
	public PolinomioController() {
		polinomio = new Polinomio();
	}
	
	public void asignarPolinomio(List<Double> poli) {
		polinomio.setCoeficientes((ArrayList<Double>) poli);
	}
	
	public String divisionSintetica(double a) {
		Horner horner = new Horner(this.polinomio.getCoeficientes());
		ArrayList<Double> cocienteResto = horner.simpleCaso1(a);
		
		String expresionCocienteResto = expresionPolinomio(cocienteResto, 1);
		return expresionCocienteResto + ";" + cocienteResto.get(cocienteResto.size() - 1);
	}
	public String divisionSintetica(int metodo, double a, double b) {
		Horner horner = new Horner(this.polinomio.getCoeficientes());
		ArrayList<Double> cocienteResto;
		String expresionCocienteResto;
		int n;
		
		if(metodo == 2) {
			cocienteResto = horner.simpleCaso2(a, b);		
			expresionCocienteResto = expresionPolinomio(cocienteResto, 1);
			n = cocienteResto.size();
			expresionCocienteResto += (";" + cocienteResto.get(n - 1));
		}else {
			cocienteResto =  horner.dobleCaso1(a, b);
			n = cocienteResto.size();
			expresionCocienteResto = expresionPolinomio(cocienteResto, 2);
			expresionCocienteResto += (";"+ cocienteResto.get(n-2)+"x "+(cocienteResto.get(n-1) > 0? "+"+cocienteResto.get(n-1) : cocienteResto.get(n-1)));
		}
				
		return expresionCocienteResto;
	}
	public String divisionSintetica(double a, double b, double c) {
		
		Horner horner = new Horner(this.polinomio.getCoeficientes());
		ArrayList<Double> cocienteResto = horner.dobleCaso2(a, b, c);
		
		String expresionCocienteResto = expresionPolinomio(cocienteResto, 2);
		int n = cocienteResto.size();
		
		return expresionCocienteResto + ";"+ cocienteResto.get(n-2)+"x "+(cocienteResto.get(n-1) > 0? "+"+cocienteResto.get(n-1) : cocienteResto.get(n-1));
	}
	
	private String expresionPolinomio(ArrayList<Double> coef,int a){
		List<Double> c = new ArrayList<>(coef);
		Collections.reverse(c);
		
		String cad = "";
		int i, 
			n = c.size(),
			e = (n-1) - a;
		for(i=(n-1); i>=a ;i--){
			if(/*c[i]*/c.get(i) >= 0){
                if(i!=(n-1)){
                    cad += "+";
                }
            }
            if(e==0){
                cad = cad + " "+ /*c[i]*/c.get(i);
            }else{
                if(e==1){
                    if(/*c[i]*/c.get(i) == 1){
                        cad += " x ";
                    }else{
                        if(/*c[i]*/c.get(i) == -1){
                            cad += "- x ";
                        }
                        else {
                          cad = cad + " " + /*c[i]*/c.get(i) + "x ";
                        }
                    }
                }else{
                    if(/*c[i]*/c.get(i) == 1){
                        cad += " x^"+e+" ";
                    }else{
                        if(/*c[i]*/c.get(i) == -1){
                            cad += "- x^"+e+" ";
                        }
                        else cad = cad +" "+ /*c[i]*/c.get(i) + "x^"+e+" ";
                    }
                }
            }
            e--;
        }
        return cad;
    }
	public double newtonPolinomios(double xn1, double epsilon) {
    	double xn;
    	double[] dpP = new double[2];
    	do {
    		xn = xn1;
        	dpP = hornerNewton(xn);
        	xn1 = xn - (dpP[0]/dpP[1]);
        }while(Math.abs(xn1 - xn) > epsilon);
      
    	return xn1;
    }

    private double[] hornerNewton(double a) {
	    int i, n = this.polinomio.getCoeficientes().size();
	    double[] nh = new double[2];
	    double dp = 0, p = this.polinomio.getCoeficientes().get(0);/*coef[n-1]*/;
    
		for(i = 1; i<n ;i++) {
			dp = a*dp + p;
			p = p*a + this.polinomio.getCoeficientes().get(i);
		}
		nh[0] = p;
		nh[1] = dp; 
		
		return nh;
    }
	
	public String aproximarRaices(double epsilon, double inicial) {
		return String.valueOf(newtonPolinomios(inicial, epsilon));
	}
	
	private boolean detCoefEnteros() {
		int i=0, n = this.polinomio.getCoeficientes().size();
		while(i<n && this.polinomio.getCoeficientes().get(i)%1 == 0 ) {
			i++;
		}
		return (i>=n);
	}
	
	public String determinarRaices() {

		int n = this.polinomio.getCoeficientes().size();
		String raicesEnteras 	= "",
			   raicesRacionales = "";
		double terminoIndep = this.polinomio.getCoeficientes().get(n-1);
		
		if(!detCoefEnteros()) {
			raicesEnteras    = "No admite raices enteras";
			raicesRacionales = "No admite raices racionales";
		}else {
			if(terminoIndep == 0) {
				raicesEnteras = "No admite raices enteras";	
			}else raicesEnteras = this.polinomio.detRaicesEnteras();
			raicesRacionales = this.polinomio.detRaicesRacionales();
		}
		
		return raicesEnteras+ ";" +raicesRacionales;
	}
	public String detRaicesReales(double epsilon, double r, double s, int maxIter) {
		String raicesReales;
		raicesReales = this.polinomio.detRaicesReales(epsilon, r, s, maxIter);
		return raicesReales;
	}
	public boolean coefPrincipalPos(){
		return (this.polinomio.getCoeficientes().get(0) > 0);
	}
	public boolean detAlMenosUnNeg() {
		int n = this.polinomio.getCoeficientes().size(),
			i = 0;
		
		while( i<n && this.polinomio.getCoeficientes().get(i)>=0 ) {
			i++;
		}
		
		return (i<n);
	}
	
	private double lagrange(double a[], int n) {
		double cotas = 0;
		
		double a0 = a[0], m = maxNegativo(a, n), base = m/a0, expo;
		int k = primerNegativo(a, n);
		expo = 1/(double)k;

		cotas = 1 + Math.pow(base, expo);
		
		return cotas;
	}
	
	private double laguerre(double cota, double[] a, int n) {	
		int j=0;
    	double c[] = new double[n], x = 0, anterior = cota;  	
    	
    	boolean neg = false;
    	while(!neg && j < 10000) {
    		int i = n-2;
    		c[n-1] = a[n-1];
    		while(i >= 0 && !neg) {
        		x = cota*c[i+1] + a[i];      		
        		if(x <= 0) {
        			neg = true;
        		}
        		c[i] = x;
        		i--;
        	}
        	
        	if(i < 0) {
        		anterior = cota;
        	}
    		cota -= 0.01; //refinas
        	j++;
    	}
    	return anterior;
	}
	
	private double newton(double cota, double[] a, int n) {	
		int j = n-1, i, m = n, t= 0, max = 1000;
    	double aux[] = new double[n], c[] = new double[n], x = 0, anterior = 0;  	
    	boolean parar = false, refinar = true;
    	
    	for(i = n-1 ; i>=0 ; i--){
    		aux[i] = a[i];
    	}
    	   	
    	while(refinar && t < max) {
    		while(!parar && n!=0) {
        		x = evaluarPolinomio(aux, n, cota);
        		if(x <= 0) {
        			parar = true;
        		}else {
        	    	//Guarda copia de aux
        			for(i = n-1 ; i>=0 ; i--){
        	    		c[i] = aux[i];
        	    	}
        			//deriva a vez
        			for(i = n-1; i>=0 ;i--) {
            			if(i != 0) {
            				j = i-1;
            				aux[j] = c[i] * i;
            			}
                	}
        			//decrementa la cantidad (grado-1)
            		n--;
        		}
    		}
    		//System.out.println("refinar: "+refinar+"\tcota: "+cota+"\tparar: "+parar);
    		if(parar) {
    			refinar = false;
    		}else {
    			anterior = cota;
        		parar = false;
        		n = m;
        		for(i = n-1 ; i>=0 ; i--){
            		aux[i] = a[i];
            	}
        		cota -= 0.01; //refinas
    		}
    		t++;
    	}
    	if(t >= max) {
			System.out.println("Superó la cantidad máximas de iteraciones.!!!");
		}
    	return anterior;
	}
	
	private double[] detExpresionCotaInfPos(double[] c, int n) {
		double aux[] = new double[n];
		
		for(int i=0; i<n ;i++) {
			aux[n-i-1] = c[i];
		}
		return aux;
	}
	
	private double[] detExpresionCotaSupNeg(double[] c, int n) {
		double aux[] = new double[n];
		
		for(int i=0; i<n ;i++) {
			aux[n-i-1] = Math.pow(-1, (this.grado-i)) * c[i];
		}
				
		return aux;
	}
	
	private double[] detExpresionCotaInfNeg(double[] c, int n) {
		double aux[] = new double[n];
		
		for(int i=0; i<n ;i++) {
			aux[i] = Math.pow(-1, (this.grado-i)) * c[i];
		}
		return aux;
	}
	
	private double[] detExpresionCostas(int metodo, int cota) {
		int n = this.cantTerminos, j;
		double aux[] = new double[n], aux2[] = new double[n];

		//TRANSFORMA LOS COEF EN LAGRANGE
		if(metodo != 1) {
			j = 0;
			for(int i = (n-1); i>=0 ;i--) {
				aux[j] = coef[i];
				j++;					
			}
		}else {
			for(int i=0; i<n ;i++) {
				aux[i] = coef[i];					
			}
		}
		
		//DEPENDIENDO DEL CAMBIO DE VARIABLE QUE SE REQUIERE
		switch(cota) {
			case 1:
				aux = detExpresionCotaInfPos(aux,n);
				break;
			case 2:
				aux = detExpresionCotaSupNeg(aux,n);
				break;
			case 3:
				aux = detExpresionCotaInfNeg(aux,n);
				break;
		}
		
		//DADO QUE PARA ESTE PTO TODOS SIN LAGRANGE, SI ES NEGATIVO EL COEF. PRINCIPAL MULTIPLICA POR -1
		if(aux[0] < 0){
			for(int i=0; i<n ;i++) {
				aux[i] *= -1;
			}
			
		}
		
		//SI NO SE LLAMÓ A LAGRANGE VUELVE EL ORDEN
		if(metodo != 1) { //laguerre o newton
			j = n-1;
			for(int i = 0; i < n ;i++) {
				aux2[j] = aux[i];
				j--;					
			}
			//aux = aux2;
			for(int i=n-1; i>=0 ;i--) {
				aux[i] = aux2[i];
			}
			
		}
		
		return aux;
	}
	
	public String detCotas(int metodo) {
		double cotas[] 				  = new double[4],
				expresionCotaSupPos[] = detExpresionCostas(0),
				expresionCotaInfPos[] = detExpresionCostas(1), 
				expresionCotaSupNeg[] = detExpresionCostas(2), 
				expresionCotaInfNeg[] = detExpresionCostas(3);
		cotas[3] = lagrange(expresionCotaSupPos);
		cotas[2] = lagrange(expresionCotaInfPos); 
		cotas[1] = lagrange(expresionCotaSupNeg); 
		cotas[0] = lagrange(expresionCotaInfNeg);
		return "";
	}
	public String detCotas(int metodo, double valInicial, boolean refinar) {
		return "";
	}
}
