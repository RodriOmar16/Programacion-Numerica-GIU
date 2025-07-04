package conversorDeBases;

//Controlador
public class NroControllerConverter {
	//atributos
	private NroSistNumeracion nro;
	private int metodo, baseLlegada;
	private String[][] tablaBases = new String[17][15]; // 16 números, 15 bases (2 a 16)
	
	//Constructor
	public NroControllerConverter(NroSistNumeracion pNro, int pMetodo, int pBaseLlegada) {
		this.nro		 = pNro;
		this.metodo 	 = pMetodo;
		this.baseLlegada = pBaseLlegada;
		crearTabla();
	}
	
	//Methods
	public String convertir() {
		String nroEquivalente = "";
		switch(metodo){
	        //METODOS PARA LLEGAR A BASE 10
	        case 1 -> {
	        	if(baseLlegada == 10) {
	        		nroEquivalente = sumaPonderadaConDecimales();
	        	}else System.out.println("La baseLlegada no es 10, no es posible convertir");
	        }
	        //METODOS PARA PARTIR DE BASE 10
	        case 2 -> {
	        	if(this.nro.getBase() == 10) {
	        		nroEquivalente = multiplicacionReiterada();
	        	}else System.out.println("La basePartida no es 10, no es posible convertir");
	        }
	        case 3 -> {
	        	if(this.nro.getBase() == 10) {
	        		nroEquivalente = divisionReiterada();
	        	}else System.out.println("La basePartida no es 10, no es posible convertir");
	        }
	        //METODO DIRECTO
	        case 4 -> nroEquivalente = metodoDirecto();
		}
		return nroEquivalente;
	}
	
	//Metodos para llegar a base 10
	private String sumaPonderada() {
		return String.valueOf(sumaPonderada(this.nro.getNro(), this.nro.getBase()));
	}
	private int sumaPonderada(String nro, int base) {
        int expo = 0;
        int nroNvo;
        int acu = 0;
        for(int i=nro.length()-1;i >= 0 ;i--){
            nroNvo = Character.getNumericValue(nro.charAt(i));
            acu += nroNvo * Math.pow(base, expo);
            expo++;
        }
        return acu;
    }

    private String sumaPonderadaConDecimales() {
    	String nro = this.nro.getNro(); 
        String[] nroPartes = nro.split("\\.");
        int base = this.nro.getBase(),
			expo = 0,
            nroNvo, 
            acu  = 0;
        
        if(nroPartes.length == 1) {
        	return String.valueOf(sumaPonderada(nro, base));
        }
        String nroParteDecimal = nroPartes[1], nroParteEntera = nroPartes[0];
        
        //Convierte parte entera
        acu = sumaPonderada(nroParteEntera, base);
        
        //Convierte parte decimal
        expo = -1;
        double acuD = 0;
        for(int i=0;i < nroParteDecimal.length();i++){
            nroNvo = Character.getNumericValue(nroParteDecimal.charAt(i));
            acuD += nroNvo * Math.pow(base, expo);
            expo--;
        }
        acuD += acu;
        
        return String.valueOf(acuD);
    }
    private String invertirString(String str) {
        String nva = "";
        for(int i=str.length()-1; i>=0 ;i--){
           nva += str.charAt(i);
        }
        return nva;
    }
    public String divisionReiterada() {
    	return divisionReiterada(this.nro.getNro(), this.baseLlegada);
    }
    private String divisionReiterada(String nro, int baseLlegada) {
        String str = "";
        int nroCompleto = Integer.parseInt(nro);
        while(nroCompleto != 0){
            str += nroCompleto % baseLlegada;
            nroCompleto /= baseLlegada; 
        }
        return invertirString(str);
    }
    private int cantidadDeDígitos(int baseMasChica, int baseMasGrande) {
    	int dig = 1;
    	while(Math.pow(baseMasChica, dig) < baseMasGrande && dig < 4){
            dig++;
        }
    	return dig;
    }
    private int buscarEquivalente(int col, char c) {
    	int i=0, n = tablaBases.length;
    	while(i<n && tablaBases[i][col].charAt(0) != c) {
    		i++;
    	}
    	if(i<n){
    		return i;
    	}else 	return -1;
    }
    private int buscarEquivalente(int col, String c, int dig) {
    	int i=0, n = tablaBases.length;
    	String s = String.format("%"+dig+"s", tablaBases[i][col]).replace(' ', '0');
    	while(i<n && !s.equals(c)) {
    		i++;
    		s = String.format("%"+dig+"s", tablaBases[i][col]).replace(' ', '0');
    	}
    	if(i<n){
    		return i;
    	}else 	return -1;
    }
    private String invertirCadena(String cadena) {
    	String cadenaInvertida = "";
    	for (int i = cadena.length() - 1; i >= 0; i--) {
    	    cadenaInvertida += cadena.charAt(i);
    	}
    	return cadenaInvertida;
    }
    private String metodoDirecto() {
    	String nroStr = this.nro.getNro();
    	if(nroStr.contains(".")) {
    		String[] nroPartes = nroStr.split("\\.");
    		nroStr = metodoDirecto(nroPartes[0]) + "." + metodoDirecto(nroPartes[1]);
    	}else nroStr = metodoDirecto(nroStr);
    	return nroStr;
    }
    private String metodoDirecto(String nroStr) {
        String str = "",padded;
        int dig, n = nroStr.length();
        int basePartida = this.nro.getBase(), fila = -1, col = -1;
        
        if(basePartida > baseLlegada){
            //primero determino la cantidad de digitos equivalentes
        	dig = cantidadDeDígitos(baseLlegada, basePartida);
        	for(int i=0; i<n ; i++) {
        		fila = buscarEquivalente(basePartida - 2, nroStr.charAt(i));
        		if(fila != -1) {
            		col = baseLlegada - 2;
            		padded = String.format("%"+dig+"s", tablaBases[fila][col]).replace(' ', '0');
            		str = str.concat(padded);
            	}else System.out.println("error");
        	}
        }else{
            //primero determino la cantidad de digitos equivalentes
        	dig = cantidadDeDígitos(basePartida, baseLlegada);
        	String aux;
        	int i=  nroStr.length() - 1 ;
        	while( i >= 0 ) {
        		aux = nroStr.substring(i-dig+1,i+1);
        		fila = buscarEquivalente(basePartida - 2, aux, dig);
        		if(fila != -1) {
        			col = baseLlegada - 2;
        			str = str.concat(tablaBases[fila][col]);
        		}else System.out.println("Error");
        		i -= dig;
        	}
        	str = invertirCadena(str);
        }
        return str;
    }  

    private String convertirDig(int dig, int baseLlegada) {
        if(dig < baseLlegada){
            return dig + "";
        }else{
            return divisionReiterada(dig + "", baseLlegada);
        }
    }
    private String multiplicacionReiterada() {
    	String nro = this.nro.getNro();
    	float nroCompleto = Float.parseFloat(nro);
        
    	int nroParteEntera = (int) nroCompleto, 
            t = 9, baseLlegada = this.baseLlegada;
        
    	float nroParteDecimal = nroCompleto - nroParteEntera;
        
        String strNroParteEntera = divisionReiterada(nroParteEntera + "", baseLlegada),
               strNroNvo = "";
        if(strNroParteEntera.equals("")){
            strNroParteEntera = "0";
        }
        while(t >= 0){
            nroParteDecimal *= baseLlegada;
            strNroNvo += convertirDig((int)nroParteDecimal, baseLlegada); 
            t--;
            nroParteDecimal -= (int)nroParteDecimal;
        }

        return strNroParteEntera+"."+strNroNvo;
    }
    
    private void crearTabla() {
    	for (int num = 0; num <= 16; num++) {
            for (int base = 2; base <= 16; base++) {
                tablaBases[num][base - 2] = Integer.toString(num, base).toUpperCase(); //padded;
                //System.out.printf("%-6s", tablaBases[num][base - 2]);
            }
            //System.out.println();
        }
    }
}
