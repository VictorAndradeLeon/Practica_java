package curso;

public class OperadoresUnarios {

	public static void main(String[] args) {

		var a = 3;
		var b = -a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Operador Unario de Negacion "!"
		var c = true;
		var d = !c;// Invertimos el valor de C de TRUE a FALSE con el operador de negacion ! solo
					// aplica para tipos booleanos...
		System.out.println("c = " + c);
		System.out.println("d = " + d);

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Incremento
		// 1. Pre incremento (Simbolo antes de la variable)
		var e = 2;
		var f = ++e;// Primero se incrementa la variable y despues se usa su valor
		System.out.println("e = " + e);
		System.out.println("f = " + f);

		// 2. Post incremento (Simbolo despues de la variable)
		var g = 5;
		var h = g++;// Primero se utiliza el valor y despues se incrementa
		System.out.println("g = " + g);
		System.out.println("h = " + h);

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Decremento
		// 1. Pre decremento (Simbolo antes de la variable)
		var e1 = 2;
		var f1 = --e1;// Primero se decrementa la variable y despues se usa su valor
		System.out.println("e = " + e1);
		System.out.println("f = " + f1);

		// 2. Post decrementa (Simbolo despues de la variable)
		var g1 = 5;
		var h1 = g1--;// Primero se utiliza el valor y despues se decrementa
		System.out.println("g = " + g1);
		System.out.println("h = " + h1);

	}

}
