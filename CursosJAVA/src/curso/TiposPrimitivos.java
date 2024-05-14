package curso;
/**
 * 
 */

/**
 * @author robot
 *
 */
public class TiposPrimitivos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tipos primitivos de tipo entero: byte, short, int, long
		// Definir los tipos:

		byte numerobyte = (byte) 129;
		System.out.println("Valor del Byte: " + numerobyte);
		System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE);
		System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE);

		short numeroShort = 10;
		System.out.println("Valor maximo del short: " + Short.MAX_VALUE);
		System.out.println("Valor minimo del short: " + Short.MIN_VALUE);

		// Casting de un entero = int a un Long poniendo una "L" al final del valor pero
		// siempre se pierde precision
		int numeroInt = (int) 2001343454545L;
		System.out.println("Valor maximo de int: " + Integer.MAX_VALUE);
		System.out.println("Valor minimo de int: " + Integer.MIN_VALUE);

		long numeroLong = 12;
		System.out.println("Valor maximo de Long: " + Long.MAX_VALUE);
		System.out.println("Valor minimo de Long: " + Long.MIN_VALUE);

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		// Tipos primitivos de tipos Flotantes: float double

		float numeroFloat = (float) 45.4;

		System.out.println("numeroFloat: " + numeroFloat);
		System.out.println("Valor minimo de Float: " + Float.MIN_VALUE);
		System.out.println("Valor maximo de Float: " + Float.MAX_VALUE);

		double numeroDouble = 32;
		System.out.println("numeroDouble: " + numeroDouble);
		System.out.println("Valor minimo de Double: " + Double.MIN_VALUE);
		System.out.println("Valor maximo de Double: " + Double.MAX_VALUE);

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		// Inferencia de tipos con VAR y Tipos Primitivos

		var numeroEntero = 10;
		System.out.println("numeroEntero = " + numeroEntero);

		var numeroDoubleVar = 12.454545;
		System.out.println("numeroDoubleVar = " + numeroDoubleVar);

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		char miCaracter = 'a';
		System.out.println("miCaracter = " + miCaracter);

		// Utilizacion de Unicode

		char varChar = '\u0021';
		System.out.println("varChar = " + varChar);

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// El boolean tambien se le conoce como una bandera o semaforo
		boolean varBoolean = false;
		System.out.println("varBoolean = " + varBoolean);

		if (varBoolean == true) {
			System.out.println("La bandera es verdadera");
		} else {
			System.out.println("La bandera es falsa");
		}

	}

}