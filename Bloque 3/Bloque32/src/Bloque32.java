
import java.util.Scanner;

public class Bloque32 {

	public static void main(String[] arg) {
		
		int a, b, suma = 0;
		Scanner S = new Scanner(System.in);
		
		System.out.println("Introduce el número menor: ");
		a = S.nextInt();
		
		System.out.println("Introduce el número mayor: ");
		b = S.nextInt();
		
		for(int i = a; i < b; i++) {
			suma += i;
		}
		
		System.out.println("El valor total de la suma es: " + suma);
		
	}
	
}
