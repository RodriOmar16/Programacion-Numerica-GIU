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
		//hace que su atributo polinomio calcula las raices de todo
		//debo tener los get de las 3 tipos de raices

		int n = this.polinomio.getCoeficientes().size();
		String raicesEnteras 	= "",
			   raicesRacionales = "",
			   raicesReales     = "";
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
		
		raicesReales = this.polinomio.detRaicesReales();
		
		return raicesEnteras+ ";" +raicesRacionales+ ";" +raicesReales;
	}
}
