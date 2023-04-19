package cadena;

public class Cadena {

	    public int longitud(String cadena) {
	        return cadena.length();
	    }
	    
	    public int vocales(String cadena) {
	        int cuenta = 0;
	        for (int i = 0; i < cadena.length(); i++) {
	            char c = cadena.charAt(i);
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                cuenta++;
	            }
	        }
	        return cuenta;
	    }
	    
	    public String invertir(String cadena) {
	    	String invertida = "";
	    	
	    	for (int i = cadena.length() -1; i >= 0; i--) {
				
				 invertida += cadena.charAt(i);
			}
			return invertida;
			
	    }
	    
	    public int contarLetra(String cadena, char caracter) {
	        int cuenta = 0;
	        for (int i = 0; i < cadena.length(); i++) {
	            char c = cadena.charAt(i);
	            if (c == caracter) {
	            	cuenta++;
	            }
	        }
	        return cuenta;
	}

}
