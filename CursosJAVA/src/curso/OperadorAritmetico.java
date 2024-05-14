package curso;

public class OperadorAritmetico {

	public static void main(String args[]) {

		var a = 3;
		var b = 2;

		var resultado = a + b;
		System.out.println("resultado = " + resultado);

		resultado = a - b;
		System.out.println("resultado resta = " + resultado);

		resultado = a * b;
		System.out.println("resultado de multi = " + resultado);
		// De esta forma estamos convirtiendo a tipo Double el valor de 3 para que si
		// sea posible hacer la diivision correctamente
		var resultado2 = 3D / b;
		System.out.println("resultado de dividir = " + resultado2);

		resultado = a % b;
		System.out.println("resultado de residuo = " + resultado);

		// Se pueden omitir las llaves si la estructura del codigo if solo es de un
		// renglon
		// Utilizacion de operador "MOD" %
		if (b % 2 == 0)
			System.out.println("La varibale es PAR");
		else
			System.out.println("La variable NO es PAR");

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		// Probando la diferencia entre el metodo Equals y el Operador ==
		String a1 = new String("Hola");
		String a2 = new String("Hola");

		System.out.println(a1 == a2);
		// Este lo que evalua es la REFERENCIA
		System.out.println(a1.equals(a2));
		// Este lo que evalua es el CONTENIDO

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Operadores de Asignacion
		int a11 = 3, b1 = 2;
		int c = a11 + 5 - b1;
		System.out.println("c = " + c);

		a11 += 1; // a = a + 1 significa que la varible a se incrementara en 1
		System.out.println("a = " + a11);

		a11 -= 2;// a = a - 2 significa que la variable va ir en decremento en 1
		System.out.println("a = " + a11);

		b1 *= 3;// b = b * 3
		System.out.println("b = " + b1);

		b1 /= 2;// b = b / 2
		System.out.println("b = " + b1);

		b1 %= 2;
		System.out.println("b = " + b1);
	}

}