package raicesDePolinomios;

import java.util.ArrayList;

public class Horner {
	//Atributos
	private ArrayList<Double> coeficientes;
	
	//Constructor
	public Horner() {
		coeficientes = new ArrayList<Double>();
	}
	public Horner(ArrayList<Double> coef) {
		coeficientes = new ArrayList<Double>();
		setCoeficientes(coef);
	}
	
	//Getters and Setters
	public void setCoeficientes(ArrayList<Double> coef) {
		coeficientes.clear();
		coeficientes.addAll(coef);
	}
	
	//Métodos
	public ArrayList<Double> dobleCaso2(double a, double b, double c) {
    	int n = this.coeficientes.size();
    	b/=a;
    	c/=a;
    	ArrayList<Double> cx = dobleCaso1(b, c);
		for(int i = 0; i<(n-1) ;i++){
			cx.set(i, cx.get(i)/a);
		}
		return cx;
	}
    public ArrayList<Double> dobleCaso1(double a, double b) {
    	int n = this.coeficientes.size();
    	ArrayList<Double> c = new ArrayList<Double>();
    	a *=-1;      b *=-1;
    	c.add(coeficientes.get(0));
    	c.add(a * c.get(0) + coeficientes.get(1));
    	for(int i=2; i<(n-1) ;i++) {
    		c.add(coeficientes.get(i) + a * c.get(i-1) + b * c.get(i-2));
    	}
    	c.add(coeficientes.get(n-1) + b*c.get(c.size()-2));
    	return c;
    }
	public ArrayList<Double> simpleCaso1(double a){
		ArrayList<Double> c = new ArrayList<Double>();
		int n = this.coeficientes.size();
		a *= -1;
		c.add(this.coeficientes.get(0));
		for(int i=1; i<n ;i++) {
			c.add( a*c.get(i-1) +coeficientes.get(i) );
		}
		
		return c;
	}
	public ArrayList<Double> simpleCaso2(double a, double b) {
    	int n = this.coeficientes.size();
    	ArrayList<Double> c = new ArrayList<Double>();
    	
    	b = b/a;
    	c = simpleCaso1(b);
    	for(int i = 0; i<(n-1) ;i++) {
    		c.set(i, c.get(i)/a);
    	}
    	
    	return c;
    }
	public double evaluarPolinomio(double a){
	    double p = 0;
	    int n = this.coeficientes.size();
	    for(int i=0; i<n ;i++){
	        p = p*a + coeficientes.get(i);
	    }
	    return p;
	}
}

