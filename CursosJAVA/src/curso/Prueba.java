package curso;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author robot
 *
 */
public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 5;
		int c = 15;

		// Formas de no crear una variable
		// var HolaMundo = 12;
		// var #hola = 3;

		// Asi se hace la concatenación
		int suma = a + b + c;
		System.out.println("La suma de a, b y c es: " + suma);

		// Salto de linea:

		int i = 100;
		int j = 50;
		int k = 150;

		int resta = i - j - k;
		System.out.println("Salto de linea: \n" + resta);
		// poner un tablulador:
		System.out.println("Salto de linea: \t" + "Hola");

//-------------------------------------------------------------------------------------------------CLASS SCANNER-----------------------------------------------------------------------------------		
		
		//Creamos un objeto nuevo de la clase Scanner ".in" es de input = salida 
		System.out.println("Escribe el primer dato:");
		Scanner consola = new Scanner(System.in);
		
		//nextLine sirve para esperar a que el usuario teclee su respuesta y esta 
		//se almacene en la variable dato1, dato2, data
		var dato1 = consola.nextLine();
		System.out.println("El dato 1 es: \n" + dato1 );
		
		System.out.println("Escribe el segundo dato:");
		var dato2 = consola.nextLine();
		System.out.println("El dato 2 es: \n" + dato2 );
		
		var data = dato1 + " " + dato2; 
		System.out.println("Los datos son: \n" + data );	
		
		
	}

}