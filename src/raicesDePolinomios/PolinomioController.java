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
		for(i=(n-1);i>=a;i--){
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
	
	public String aproximarRaices(double epsilon, double inicial) {
		
		return "";
	}
	
	public void determinarRaices() {
		//hace que su atributo polinomio calcula las raices de todo
		//debo tener los get de las 3 tipos de raices
	}
}
