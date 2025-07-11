package raicesDePolinomios;

import java.util.ArrayList;

public class Horner {
	//Atributos
	private ArrayList<Double> coeficientes;
	
	//Constructor
	public Horner(ArrayList<Double> coef) {
		coeficientes = new ArrayList<Double>();
		coeficientes.clear();
		coeficientes.addAll(coef);
	}
	//Métodos
	public ArrayList<Double> dobleCaso2(double a, double b, double c) {
    	int n = this.coeficientes.size();
    	b/=a;
    	c/=a;
    	ArrayList<Double> cx = dobleCaso1(b, c);
		//mostrarCoefHorner(coef, 2, n );
		for(int i = 0; i<(n-1) ;i++){
			//cx[i] /= a;
			cx.set(i, cx.get(i)/a);
		}
		return cx;
	}

    /*public double[] hdobleCaso1(double a, double b) {
    	int n = this.coeficientes.size();
    	double[] c = new double[n];
    	a *=-1;      b *=-1;
    	c[n-1] = coef[n-1];
    	c[n-2] = a*c[n-1] + coef[n-2];
    	int i;
    	for(i=(n-3); i>0 ;i--) {
    		c[i] = coef[i] + a*c[i+1] + b*c[i+2];
    	}
    	c[0] = coef[0] + b*c[2];
    	return c;
    }*/
    public ArrayList<Double> dobleCaso1(double a, double b) {
    	int n = this.coeficientes.size();
    	ArrayList<Double> c = new ArrayList<Double>();
    	a *=-1;      b *=-1;
    	c.add(coeficientes.get(0));
    	c.add(a * c.get(0) + coeficientes.get(1));
    	for(int i=2; i<(n-1) ;i++) {
    		c.add(coeficientes.get(i) + a * c.get(i-1) + b * c.get(i-2));
    	}
    	//c[0] = coef[0] + b*c[2];
    	c.add(coeficientes.get(n-1) + b*c.get(c.size()-2));
    	return c;
    }
  
    /*public double[] simpleCaso2(double a, double b) {
    	int n 		= this.cantTerminos;
    	double[] c 	= new double[n];
    	
    	b 			= b/a;
    	c 			= hornerSimpleCaso1(-1*b);
    	for(int i = (n-1); i>=1 ;i--) {
    		c[i] /= a;
    	}
    	
    	return c;
    }

    public double[] simpleCaso1(double a) {
    	int n = this.cantTerminos;
    	double[] c = new double[n];
    	
    	c[n-1] = coef[n-1];    
    	for(int i=n-2;i >= 0;i--) {
    		c[i] = a*c[i+1] + coef[i];
    	}
    	
    	return c;
    }*/
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

