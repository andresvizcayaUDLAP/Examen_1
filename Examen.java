package Examen_1;

public class Examen {
	
	String cadena;
	char[] arreglo;
	int longitud;
	
	String[] vocales = {"a", "e", "i", "o", "u"};
	int longitudVocales = vocales.length;
	int index;
	char vocal;
	char vocalMayuscula;
	
	public Examen(String cadena) {
		
		this.cadena = cadena;
		arreglo = cadena.toCharArray();
		longitud = cadena.length();
	}
	
	public String primeraMayuscula() {
		
		String primeraLetra = cadena.substring(0,1);
		String letraMayuscula = primeraLetra.toUpperCase();
		String otrasLetras = cadena.substring(1, cadena.length());
		String cadenaNueva = letraMayuscula.concat(otrasLetras);
		
		
		return cadenaNueva;
	}
	
	public String invertirCadena() {
		
		char[] arregloInvertido = new char[longitud];
		
		
		int count = 0;
		for(int i=longitud-1; i>=0; i--) {
			arregloInvertido[count] = arreglo[i];
			count++;
		}
		
		String cadenaNueva1 = new String(arregloInvertido);
		
		return cadenaNueva1;
	}
	
	public String vocalesMayusculas() {
		
		String cadenaNueva2 = cadena;
		
		for(int i=0; i<longitudVocales; i++) {
			if(cadena.contains(vocales[i])) {
				index = cadena.indexOf(vocales[i]);
				vocal = cadena.charAt(index);
				vocalMayuscula = Character.toUpperCase(vocal);
				cadenaNueva2 = cadenaNueva2.replace(vocal, vocalMayuscula);	
			
			} else {
				continue;
			}
		}
		
		return cadenaNueva2;	
	}
	
	public void fizzBuzz() {
		
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				System.out.println(i+": Fizz");
			} else if(i%5==0) {
				System.out.println(i+": Buzz");
			} else if(i%3==0 && i%5==0) {
				System.out.println(i+": FizzBuzz");
			}
		}
	}
	
	public void palindromo() {
		
		char[] arregloInvertido3 = new char[longitud];
		
		
		int count = 0;
		for(int i=longitud-1; i>=0; i--) {
			arregloInvertido3[count] = arreglo[i];
			count++;
		}
		
		String cadenaNueva3 = new String(arregloInvertido3);
		cadenaNueva3 = cadenaNueva3.replace(" ", "");
		String cadenaComparacion = cadena.replace(" ", "");
		
		boolean comparacion = cadenaComparacion.equals(cadenaNueva3);
		
		if(comparacion) {
			System.out.println("Es un palíndromo");
		} else {
			System.out.println("No es un palindromo");
		}
	}
}

