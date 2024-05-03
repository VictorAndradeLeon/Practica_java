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
		//De esta forma estamos convirtiendo a tipo Double el valor de 3 para que si sea posible hacer la diivision correctamente
		var resultado2 = 3D / b;
		System.out.println("resultado de dividir = " + resultado2);
		
		resultado = a % b;
		System.out.println("resultado de residuo = " + resultado);
		
		//Se pueden omitir las llaves si la estructura del codigo if solo es de un renglon
		//Utilizacion de operador "MOD" %
		if(b % 2 == 0)
			System.out.println("La varibale es PAR");
		else
			System.out.println("La variable NO es PAR");
	}

}