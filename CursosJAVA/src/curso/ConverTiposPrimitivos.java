package curso;

import java.util.Scanner;

public class ConverTiposPrimitivos {

	public static void main(String args[]) {
		
		//Convertir tipo String a tipo int
		var edad = Integer.parseInt("20");
		System.out.println("edad = " + (edad + 1));
		
		//Transformar un tipo de valor Double a un String
		var valorPI = Double.parseDouble("3.1416");
		System.out.println("valorPI = " + valorPI);
		
		//Pediremos un valor al usuario
		var consola = new Scanner(System.in);
		System.out.println("Proporciona tu edad:");
		edad = Integer.parseInt(consola.nextLine());
		System.out.println("edad = " + edad);
		
		//Convertir de tipo int a String
		var edadTexto = String.valueOf(10);
		System.out.println("Edad Texto = " + edadTexto);
		
		//Con este metodo .charAt haremos que nos regrese el caracter que queramos desde el inicio que es 0, 1, 2, 3
		//Por ejemplo si quisiera recuperar el caracter "a" pondria la posicion 3.
		var caracter = "hola".charAt(3);
		System.out.println("Caracter = " + caracter);
		
		//Un ejercicio corto para utilizar los caracteres
		System.out.println("Proporciona una cadena:");
		caracter = consola.nextLine().charAt(2);
		System.out.println("Caracter seleccionado es: " + caracter);
		
		
		
	}
	
}