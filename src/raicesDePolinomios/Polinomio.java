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
	public String detRaicesRacionales(){		
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
			auxHorner = horner.simpleCaso1(-1*posibleRaiz); //en el método de horner se multiplca por -1
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
	}
	private double[][] formulaCuadratica(double b, double c) {
		double a = 1, disc = b*b - 4*a*c, xr[][] = new double[2][2];
		
		if(disc>=0) {
			System.out.println("\nentroo if..."+"\t a: "+a+"\t b: "+b+"\t c: "+c+"\n");
			//parte reales							//parte imaginaria
			xr[0][0] = (-b + Math.sqrt(disc))/2; 	xr[0][1] = 0;
			xr[1][0] = (-b - Math.sqrt(disc))/2; 	xr[1][1] = 0;
		}else {
			System.out.println("\nentroo else..."+"\t a: "+a+"\t b: "+b+"\t c: "+c+"\n");
			//parte reales  	//imaginarias
			xr[0][0] = b/2; 	xr[0][1] = (Math.sqrt(Math.abs(disc)))/2;
			xr[1][0] = b/2; 	xr[1][1] = -1*xr[0][1];
		}
		
		return xr;
	}
	public String bairstow(double epsilon, double r, double s, int maxIter) {
		int n     = this.coeficientes.size(),
			//tamC, tamB,
			g    = n-1,
			iter = 0;
		
		double det = 0, dr=0, ds=0, errorR=1, errorS=1;
		
		Horner horner;
		ArrayList<Double> b 		  = new ArrayList<Double>(),
						  c 		  = new ArrayList<Double>(),
						  p 		  = new ArrayList<Double>(),
						  reales      = new ArrayList<Double>(),
						  imaginarias = new ArrayList<Double>();
		
		double raicesPar[][]= new double[2][2];
		
		
		//crea una copia editable del coef P(x) original
		p.addAll(this.coeficientes);
		System.out.println("p copia de coef: "+ p);
		horner = new Horner();
		
		while(g>2 && iter<=maxIter) {
			iter = 0; errorR=1; errorS=1;
			System.out.println("en el while, antes del do-while, iter: "+iter);
			do {
				iter++;
				
				horner.setCoeficientes(p);
				b = horner.dobleCaso1(-1*r, -1*s);

				horner.setCoeficientes(b);
				c = horner.dobleCaso1(-1*r, -1*s);

				det = Math.pow(c.get(n-3),2) - (c.get(n-2) * c.get(n-4));

				if(det != 0) {
					dr = (b.get(n-1) * c.get(n-4) - b.get(n-2)*c.get(n-3))/det;
					ds = (b.get(n-2)*c.get(n-2) - b.get(n-1)*c.get(n-3))/det;
					
					r += dr;
					s += ds;
					
					errorR = Math.abs(dr/r);
					errorS = Math.abs(ds/s);

				}else {
					r += 1;
					s += 1;
					iter = 0;
				} 
			}while((errorR > epsilon || errorS > epsilon) && (iter <= maxIter));

			raicesPar 		= formulaCuadratica(-1*r,-1*s);
			reales.add(raicesPar[0][0]);		imaginarias.add(raicesPar[0][1]);
			reales.add(raicesPar[1][0]);		imaginarias.add(raicesPar[1][1]);

			horner.setCoeficientes(p);
			b = horner.dobleCaso1(-1*r, -1*s);
			
			g -= 2;

			p.clear(); //reseteo
			p.addAll(b); //copio el nuevo polinomio factor
		}
		if(iter <= maxIter) {
			if(g == 2) {
				r 			= (p.get(1))/(p.get(0));
				s 			= (p.get(2))/(p.get(0));
				raicesPar 	= formulaCuadratica(r,s);
				reales.add(raicesPar[0][0]);		imaginarias.add(raicesPar[0][1]);
				reales.add(raicesPar[1][0]);		imaginarias.add(raicesPar[1][1]);
			}else {
				reales.add(p.get(1)/p.get(0));
				imaginarias.add((double) 0);
			}
		}
		return reales.toString() + ";" + imaginarias.toString();
	}
	
	public String detRaicesReales(double epsilon, double r, double s, int maxIter) {
		return bairstow(epsilon, r,s, maxIter);
	}
}
