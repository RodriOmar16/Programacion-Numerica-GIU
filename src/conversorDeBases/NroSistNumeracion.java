package conversorDeBases;

import java.util.Objects;
//Modelo
public class NroSistNumeracion {
	//Atributos
	private String expresion;
	private int base;
	
	//Constructor
	public NroSistNumeracion(String pNro, int pBase) {
		this.expresion = pNro;
		this.base      = pBase;		
	}
	
	//Methods
	public String getNro() { return this.expresion; }
	public int getBase() { return this.base; }
	
	public boolean equals(Object obj) {
		if(this == obj) { return true; }
		if(obj == null || obj.getClass() != getClass()) { return false; }
		
		NroSistNumeracion nro = (NroSistNumeracion)obj;
		return (nro.expresion == this.expresion && 
				nro.base == this.base);
	}
	public String toString() {
		String str = "";
		str += "Nro: "+this.expresion+"\n";
		str += "Base: "+this.base+"\n";
		return str;
	}
	private boolean validarCaracterBase(char caracter){
        if(Character.isDigit(caracter)){
            return 0 <= Character.getNumericValue(caracter) && Character.getNumericValue(caracter) < this.base ;
        }else{
            switch(this.base){
                case 11 -> {
                    return caracter == 'A';
                }
                case 12 -> {
                    return caracter == 'A' || caracter == 'B';
                }
                case 13 -> {
                    return caracter == 'A' || caracter == 'B' || caracter == 'C';
                }
                case 14 -> {
                    return caracter == 'A' || caracter == 'B' || caracter == 'C'  || caracter == 'D';
                }
                case 15 -> {
                    return caracter == 'A' || caracter == 'B' || caracter == 'C'  || caracter == 'D' || caracter == 'E';
                }
                case 16 -> {
                    return caracter == 'A' || caracter == 'B' || caracter == 'C'  || caracter == 'D' || caracter == 'E' || caracter == 'F';
                }
            } 
            System.out.println("LLEGO HASTA AQUÍ");
            return false;
        }
    }
    public boolean controlarNro() {
        int n = this.expresion.length();
        int i=0;
        boolean cumple = true;
        while(i < n && cumple){
            //SI ES EL PUNTO DECIMAL (.) LO IGNORA
            if(this.expresion.charAt(i)!='.'){
                if(this.base <= 10){
                    if(Character.getNumericValue(this.expresion.charAt(i)) < 0 || 
                    		this.base <= Character.getNumericValue(this.expresion.charAt(i))){
                      cumple = false;
                     }
                }else{ // Bases de a 11 a 16
                    if( validarCaracterBase(this.expresion.charAt(i)) == false){
                      cumple = false;
                    }
                }
            } 
            //
            i++;
        }
        return cumple;
    }
}