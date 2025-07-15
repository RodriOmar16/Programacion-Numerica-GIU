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
	
	//Aproximar raices con newton
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
	
	//Det Raices
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
	
	//Cotas
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

	private double maxNegativo(ArrayList<Double> cx) {
		double max = 0;
		int n = cx.size();
		for(int i = 0 ; i<n ;i++) {
			if(cx.get(i) < 0){
				if(Math.abs(cx.get(i)) > max) {
					max = Math.abs(cx.get(i));
				}
			}
		}
		
		return  max;
	}
	
	private int primerNegativo(ArrayList<Double> cx) {
		int i = 0,
		    n = cx.size();
		
		while(i < n && cx.get(i) >= 0) {
			i++;
		}
		if(i < n){
			return i;
		}else return -1;
	}
	private double lagrange(ArrayList<Double> a) {
		int n = a.size(), k;
		double cotas = 0,
			   a0    = a.get(0), 
			   m     = maxNegativo(a), 
			   base  = m/a0, 
			   expo;
		
		k = primerNegativo(a);
		if(k == -1) { System.out.println("ALERTA: Error no encontó el negativo."); }
		expo = 1/(double)k;

		cotas = 1 + Math.pow(base, expo);
		
		return cotas;
	}
	
	/*private double laguerre(double cota, double[] a, int n) {	
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
	}*/
	private ArrayList<Double> detExpresionCotaInfPos(int n){
		ArrayList<Double> aux = new ArrayList<Double>();
		for(int i=n-1; i>=0 ;i--) {
			aux.add(this.polinomio.getCoeficientes().get(i));
		}	
		return aux;
	}	
	private ArrayList<Double> detExpresionCotaSupNeg(int n) {
		ArrayList<Double> aux = new ArrayList<Double>();
		int grado = n-1;
		for(int i=n-1; i>=0 ;i--) {
			aux.add(Math.pow(-1, (grado-i)) * this.polinomio.getCoeficientes().get(i));
		}
		return aux;
	}
	private ArrayList<Double> detExpresionCotaInfNeg(int n) {
		ArrayList<Double> aux = new ArrayList<Double>();
		int grado = n-1;
		
		for(int i=0; i<n ;i++) {
			aux.add(Math.pow(-1, (grado-i)) * this.polinomio.getCoeficientes().get(i));
		}
		return aux;
	}
	private ArrayList<Double> detExpresionCostas(int cota) {
		int n = this.polinomio.getCoeficientes().size(); 
		ArrayList<Double> auxExp = new ArrayList<Double>(); 
			
		//DEPENDIENDO DEL CAMBIO DE VARIABLE QUE SE REQUIERE
		switch(cota) {
			case 1:
				auxExp = detExpresionCotaInfPos(n); 
				break;
			case 2:
				auxExp = detExpresionCotaSupNeg(n);
				break;
			case 3:
				auxExp = detExpresionCotaInfNeg(n);
				break;
		}
		//Si el coeficiente principal es negativo multiplico por -1
		if(auxExp.get(0) < 0) {
			for(int i=0; i<n ;i++) {
				auxExp.set(i, -1*auxExp.get(i) );
			}
			
		}
		
		return auxExp;
	}
	
	/*public String detCotas(int metodo) {
		double cotas[] 				  = new double[4],
				expresionCotaSupPos[] = detExpresionCostas(0),
				expresionCotaInfPos[] = detExpresionCostas(1), 
				expresionCotaSupNeg[] = detExpresionCostas(2), 
				expresionCotaInfNeg[] = detExpresionCostas(3);
		ArrayList<Double> cotas = new ArrayList<Double>(),
		        		  expresionCotaInfPos = detExpresionCostas(1),
        				  expresionCotaSupNeg = detExpresionCostas(2),
						  expresionCotaInfNeg = detExpresionCostas(3);
		System.out.println("Sup Pos:_" + this.polinomio.getCoeficientes());
		System.out.println("Inf Pos:_" + expresionCotaInfPos);
		System.out.println("Sup Neg:_" + expresionCotaSupNeg);
		System.out.println("Inf Neg:_" + expresionCotaInfNeg);
		
		/*cotas[3] = lagrange(expresionCotaSupPos);
		cotas[2] = lagrange(expresionCotaInfPos); 
		cotas[1] = lagrange(expresionCotaSupNeg); 
		cotas[0] = lagrange(expresionCotaInfNeg);
		cotas.add(lagrange(expresionCotaInfNeg));
		cotas.add(lagrange(expresionCotaSupNeg));
		cotas.add(lagrange(expresionCotaInfPos));
		cotas.add(lagrange(this.polinomio.getCoeficientes()));
		
		/*cotas[2] = 1/cotas[2]; //t < cota => 1/t > 1/cota => 1/cota < x
		cotas[1] = (-1) * (1/cotas[1]);// t < cota => 1/t > 1/cota => -1/t < -1/cota => x < -1/cota
		cotas[0] *= -1;//  t < cota => -t > -cota => -cota < x
		cotas.set(2, 1/cotas.get(2));
		cotas.set(1, -1 * (1/cotas.get(1)));
		cotas.set(0, -1 * cotas.get(0));
		
		
		return cotas.get(0) +";"+cotas.get(1)+";"+cotas.get(2)+";"+cotas.get(3);
	}*/
	public String detCotas(int metodo, double valInicial, boolean refinar) {
		
		ArrayList<Double> cotas = new ArrayList<Double>(),
      		  			  expresionCotaInfPos = detExpresionCostas(1),
      		  			  expresionCotaSupNeg = detExpresionCostas(2),
      		  			  expresionCotaInfNeg = detExpresionCostas(3);
		
		switch(metodo) {
			case 1 -> {
				
			}
			case 2 -> {
				
			}
			case 3 -> {
				cotas.add(lagrange(expresionCotaInfNeg));
				cotas.add(lagrange(expresionCotaSupNeg));
				cotas.add(lagrange(expresionCotaInfPos));
				cotas.add(lagrange(this.polinomio.getCoeficientes()));
			}
		}
		cotas.set(2, 1/cotas.get(2));
		cotas.set(1, -1 * (1/cotas.get(1)));
		cotas.set(0, -1 * cotas.get(0));
		return cotas.get(0) +";"+cotas.get(1)+";"+cotas.get(2)+";"+cotas.get(3);
	}
}
