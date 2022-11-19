
import java.util.Scanner;

public class Bloque33 {

	public static void main(String[] args) {
		
		int a, b;
		Scanner S = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		a = S.nextInt();
		
		do {
			System.out.println("Introduce un número mayor al anterior: ");
			b = S.nextInt();
		}while(b < a);
	}
	
}
