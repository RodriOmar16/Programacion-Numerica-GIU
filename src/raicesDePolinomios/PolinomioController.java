package raicesDePolinomios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PolinomioController {
	private Polinomio polinomio;
	private String errorCotaSupPos="", 
			       errorCotaInfPos="", 
			       errorCotaInfNeg="", 
			       errorCotaSupNeg="";
	
	public PolinomioController() {
		polinomio = new Polinomio();
	}
	
	public void asignarPolinomio(List<Double> poli) {
		polinomio.setCoeficientes((ArrayList<Double>) poli);
	}
	
	public String getErrorCotaSupPos() { return this.errorCotaSupPos; }
	public String getErrorCotaInfPos() { return this.errorCotaInfPos; }
	public String getErrorCotaSupNeg() { return this.errorCotaSupNeg; }
	public String getErrorCotaInfNeg() { return this.errorCotaInfNeg; }
	public void setErrores() {
		errorCotaSupPos="";
		errorCotaInfPos="";
		errorCotaInfNeg=""; 
		errorCotaSupNeg="";
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
			if(c.get(i) >= 0){
                if(i!=(n-1)){
                    cad += "+";
                }
            }
            if(e==0){
                cad = cad + " "+c.get(i);
            }else{
                if(e==1){
                    if(c.get(i) == 1){
                        cad += " x ";
                    }else{
                        if(c.get(i) == -1){
                            cad += "- x ";
                        }
                        else {
                          cad = cad + " " +c.get(i) + "x ";
                        }
                    }
                }else{
                    if(c.get(i) == 1){
                        cad += " x^"+e+" ";
                    }else{
                        if(c.get(i) == -1){
                            cad += "- x^"+e+" ";
                        }
                        else cad = cad +" "+c.get(i) + "x^"+e+" ";
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
		int k;
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
	
	private double laguerre(ArrayList<Double> p, double cotaInicial){
		ArrayList<Double> c = new ArrayList<Double>();
		int i,
			n = p.size();
    	double x = 0;  	
    	
    	boolean neg = false;
    		i = 1;
    		c.add(p.get(0));
    		while(i < n && !neg) {
    			x = cotaInicial*c.get(i-1) + p.get(i); 
        		if(x <= 0) {
        			neg = true;
        		}
        		c.add(x);
        		i++;
        	}
    		if(neg) {
    			return -1;
    		}else return cotaInicial;
	}
	private double laguerrePrincipal(ArrayList<Double> p, double cotaInicial, boolean refinar) {
		if(!refinar) {
			return laguerre(p, cotaInicial);
		}else {
			double cota = laguerre(p, cotaInicial);
			if(cota == -1) {
				return laguerrePrincipal(p, cotaInicial+0.1, refinar);
			}else return cota;
		}
	}
	
	private double newton(ArrayList<Double> p, double cotaInicial) {	
		int n;
    	double res;  
    	ArrayList<Double> aux = new ArrayList<Double>(),
    					  c   = new ArrayList<Double>(); 
    	boolean parar = false, error = false;
    	Horner horner = new Horner();
    	
    	c.addAll(p);
    	while(!parar) {
    		horner.setCoeficientes(c);
    		res = horner.evaluarPolinomio(cotaInicial);
    		if(res <= 0) {
    			parar = true;
    			error = true;
    		}else {
    			n = c.size();
    			if(n > 1) {
    				//aux = derivada de C;
        			aux.clear();
        			for(int i=0; i<n ;i++) {
        				if(i != n-1) aux.add(c.get(i) * (n-i-1));
        			}
        			c.clear();
        			c.addAll(aux);
    			}else {
    				parar = true;
    				error = false;
    			}
    		}
    	}
    	if(!error) return cotaInicial;
    	else return -1;
	}
	private double newtonPrincipal(ArrayList<Double> p, double cotaInicial, boolean refinar) {
		if(!refinar) {
			return newton(p, cotaInicial);
		}else {
			double cota = newton(p, cotaInicial);
			if(cota == -1) {
				return newtonPrincipal(p, cotaInicial+0.1, refinar);
			}else return cota;
		}
	}
	
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
	
	public String detCotas(int metodo, double valInicial, boolean refinar) {
		
		ArrayList<Double> cotas = new ArrayList<Double>(),
      		  			  expresionCotaInfPos = detExpresionCostas(1),
      		  			  expresionCotaSupNeg = detExpresionCostas(2),
      		  			  expresionCotaInfNeg = detExpresionCostas(3);
		double cotaInfNeg, cotaSupNeg, cotaInfPos, cotaSupPos;
		switch(metodo) {
			case 1 -> {
				cotaInfNeg = newtonPrincipal(expresionCotaInfNeg, valInicial, refinar);
				cotaSupNeg = newtonPrincipal(expresionCotaSupNeg, valInicial, refinar);
				cotaInfPos = newtonPrincipal(expresionCotaInfPos, valInicial, refinar);
				cotaSupPos = newtonPrincipal(this.polinomio.getCoeficientes(), valInicial, refinar);
				
				cotas.add(cotaInfNeg >=0 ? cotaInfNeg : -1);
				cotas.add(cotaSupNeg >=0 ? cotaSupNeg : -1);
				cotas.add(cotaInfPos >=0 ? cotaInfPos : -1);
				cotas.add(cotaSupPos >=0 ? cotaSupPos : -1);
			}
			case 2 -> {
				cotaInfNeg = laguerrePrincipal(expresionCotaInfNeg, valInicial, refinar);
				cotaSupNeg = laguerrePrincipal(expresionCotaSupNeg, valInicial, refinar);
				cotaInfPos = laguerrePrincipal(expresionCotaInfPos, valInicial, refinar);
				cotaSupPos = laguerrePrincipal(this.polinomio.getCoeficientes(), valInicial, refinar);
				
				cotas.add(cotaInfNeg >=0 ? cotaInfNeg : -1);
				cotas.add(cotaSupNeg >=0 ? cotaSupNeg : -1);
				cotas.add(cotaInfPos >=0 ? cotaInfPos : -1);
				cotas.add(cotaSupPos >=0 ? cotaSupPos : -1);
			}
			case 3 -> {
				cotas.add(lagrange(expresionCotaInfNeg));
				cotas.add(lagrange(expresionCotaSupNeg));
				cotas.add(lagrange(expresionCotaInfPos));
				cotas.add(lagrange(this.polinomio.getCoeficientes()));
			}
		}
		if(cotas.get(3) == -1) this.errorCotaSupPos = "El valor inicial no cumple las condiciones.";
		
		if(cotas.get(2) != -1) { cotas.set(2, 1/cotas.get(2)); }
		else this.errorCotaInfPos = "El valor inicial no cumple las condiciones.";
		
		if(cotas.get(1) != -1) { cotas.set(1, -1 * (1/cotas.get(1))); }
		else this.errorCotaSupNeg = "El valor inicial no cumple las condiciones.";
		
		if(cotas.get(0) != -1) { cotas.set(0, -1 * cotas.get(0)); }
		else this.errorCotaInfNeg = "El valor inicial no cumple las condiciones.";
		
		return cotas.get(0) +";"+cotas.get(1)+";"+cotas.get(2)+";"+cotas.get(3);
	}
}
