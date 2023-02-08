package Examen_1;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String frase;
		
		System.out.println("Ingresa una frase: ");
		frase = scan.nextLine();
		
		Examen objeto = new Examen(frase);
		
		//Primera letra a mayúscula
		String cadenaNueva = objeto.primeraMayuscula();
		System.out.println("Primera letra en mayúscula");
		System.out.println(cadenaNueva);
		
		//Invertir frase
		String cadenaNueva1 = objeto.invertirCadena();
		System.out.println("Palabra o frase invertida");
		System.out.println(cadenaNueva1);
		
		//Vocales en mayúsculas
		String cadenaNueva2 = objeto.vocalesMayusculas();
		System.out.println("Vocales en mayúscula");
		System.out.println(cadenaNueva2);
		
		//FizzBuzz
		System.out.println("Múltiplos de 3 y 5");
		objeto.fizzBuzz();
		
		//Palíndromo
		System.out.println("Palíndromo");
		objeto.palindromo();
		
		scan.close();
		}

}
