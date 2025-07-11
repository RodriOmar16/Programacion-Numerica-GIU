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
	
	//Methods
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
}
