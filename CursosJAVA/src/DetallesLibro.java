import java.util.Scanner;

/**
 * 
 */

/**
 * @author robot
 *
 */
public class DetallesLibro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Que tal usuario. Escribe el titulo: ");
		Scanner detalle = new Scanner(System.in);
		
		String libro = detalle.nextLine();
		System.out.println("Proporciona el titulo: " + libro);
		
		String autor = detalle.nextLine();
		System.out.println("Proporciona el autor: " + autor);
		
		System.out.println(libro + " fue escrito por " + autor);
		
		
	}

}
