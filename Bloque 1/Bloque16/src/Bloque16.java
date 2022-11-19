//Intercambiar valores de a y b
import java.util.Scanner;

public class Bloque16 {
	
	public static void main(String[] arg) {
		
		int a, b, aux;
		Scanner S = new Scanner(System.in);
		
		System.out.print("Introduce el valor para el atributo A: ");
		a = S.nextInt();
		
		System.out.print("Introduce el valor para el atributo B: ");
		b = S.nextInt();
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("Los valores actuales de A y B son: " + a + ", " + b);
		
	}
	
}
