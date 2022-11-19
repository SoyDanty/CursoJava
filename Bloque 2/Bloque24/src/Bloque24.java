import java.util.Scanner;

public class Bloque24 {

	public static void main(String[] args) {
		
		int x;
		Scanner S = new Scanner(System.in);
		
		System.out.println("Ingrese un número por teclado: ");
		x = S.nextInt();
		
		if (x > 0) {
			System.out.println("El número introducido es mayor que cero");
		} else {
			System.out.println("El número introducido NO es mayor que cero");
		}
	}	
	
}
