package raicesDePolinomios;

import java.util.ArrayList;

public class Polinomio {
	//Atributos
	private ArrayList<Double> coeficientes, raicesEnteras, raicesRacionales, raicesReales;
	
	//Constructor
	public Polinomio() {
		coeficientes 	 = new ArrayList<Double>();
		raicesEnteras    = new ArrayList<Double>();
		raicesRacionales = new ArrayList<Double>();
		raicesReales 	 = new ArrayList<Double>();
	}
	
	//Getters and Setters
	public ArrayList<Double> getCoeficientes(){ return this.coeficientes; }
	public void setCoeficientes(ArrayList<Double> coef) {
		coeficientes.clear();
		coeficientes.addAll(coef);
	}
	
	public ArrayList<Double> getRaicesEnteras(){ return this.raicesEnteras; }
	public void setRaicesEnteras(ArrayList<Double> enteras) {
		raicesEnteras.clear();
		raicesEnteras.addAll(enteras);
	}
	
	public ArrayList<Double> getRaicesRacionales(){ return this.raicesRacionales; }
	public void setRaicesRacionales(ArrayList<Double> racionales) {
		raicesRacionales.clear();
		raicesRacionales.addAll(racionales);
	}
	
	public ArrayList<Double> getRaicesReales(){ return this.raicesReales; }
	public void setRaicesReales(ArrayList<Double> reales) {
		raicesReales.clear();
		raicesReales.addAll(reales);
	}
	
	//Methods
	private ArrayList<Double> divisoresNro(double nro) {
    	//int c = 0;
        
    	ArrayList<Double> posiblesRaices = new ArrayList<Double>();
    	if(nro == 1) { 
        	posiblesRaices.add((double) 1);
        	//c = 1;
        }else{
            if(nro==2 || nro==3 || nro==5 || nro==7){
            	posiblesRaices.add((double) 1);
            	posiblesRaices.add((double) nro);
            }else{
                int d = 1;
                double max = nro/2;
            	//c = 0;
                while(d <= max){
                    if(nro%d == 0){
                    	//posiblesRaices[c] = (double)d;
                    	posiblesRaices.add((double) d);
                        //c++; 
                    }
                    d++;
                }
                //posiblesRaices[c] = (double)nro;
                posiblesRaices.add((double) nro);
                //c++;
            }
        }
    	return posiblesRaices;
    }
	private int mcd(int a, int b){
		if(b == 0){
			return a;
		}else
			return mcd(b, a%b);
	}
	private double mcd(double a, double b){
		if(a%1 == 0 && b%1 == 0) {
			if(b == 0){
				return a;
			}else
				return mcd(b, a%b);
		}else return -1;
	}
	public String detRaicesEnteras() {
		Horner horner 	 = new Horner(this.coeficientes);
		int    n  		 = this.coeficientes.size(), tam;
		double nro 		 = this.coeficientes.get(n-1);		
		ArrayList<Double> posiblesRaices = divisoresNro(Math.abs(nro)), 
				          auxHorner, 
				          raices         = new ArrayList<Double>();
		
		for(Double divisor : posiblesRaices) {
			//Positivas
			auxHorner = horner.simpleCaso1(-1*divisor);
			tam = auxHorner.size();
			if(auxHorner.get(tam - 1) == 0) { //resto == 0
				raices.add(divisor);
			}
			
			//Negativas
			auxHorner = horner.simpleCaso1(divisor);
			tam = auxHorner.size();
			if(auxHorner.get(tam - 1) == 0) { //resto == 0
				raices.add(-1 * divisor);
			}
		}
		
		setRaicesEnteras(raices);
		
		return raices.toString().length() > 0 ? raices.toString() : "No admite raices enteras.";
	}
	public String detRaicesRacioanles(){
		String str = "";
		
		Horner horner 		 = new Horner(this.coeficientes);
		int    n  			 = this.coeficientes.size(), tam;
		double terminoIndep  = this.coeficientes.get(n-1),
			   coefPrincipal = this.coeficientes.get(0);		
		ArrayList<Double> divisoresTerminoIndep  = divisoresNro(Math.abs(terminoIndep)),
						  divisoresCoefPrincipal = divisoresNro(Math.abs(coefPrincipal)),
				          posiblesRaices 		 = new ArrayList<Double>(),
						  auxHorner, 
				          raices         		 = new ArrayList<Double>();
		
		for(Double divTermIndep : divisoresTerminoIndep) {
			for(Double divCoefPrin : divisoresCoefPrincipal) {
				if(mcd(divTermIndep,divCoefPrin) == 1 && ( (divTermIndep/divCoefPrin) != (int)(divTermIndep/divCoefPrin) ) ) {
					posiblesRaices.add(divTermIndep/divCoefPrin);
				}
			}
		}
		
		for(Double posibleRaiz : posiblesRaices) {
			//Positivas
			auxHorner = horner.simpleCaso1(-1*posibleRaiz);
			tam = auxHorner.size();
			if(auxHorner.get(tam - 1) == 0) { //resto == 0
				raices.add(posibleRaiz);
			}
			
			//Negativas
			auxHorner = horner.simpleCaso1(posibleRaiz);
			tam = auxHorner.size();
			if(auxHorner.get(tam - 1) == 0) { //resto == 0
				raices.add(-1 * posibleRaiz);
			}
		}
		
		setRaicesRacionales(raices);
		
		return raices.toString().length() > 0 ? raices.toString() : "No admite raices enteras.";
		
		//return str;
	}
}
