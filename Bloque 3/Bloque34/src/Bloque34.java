
import java.util.Scanner;

public class Bloque34 {

	public static void main(String[] args) {
		
		int a;
		Scanner S = new Scanner(System.in);
		
		do {
			System.out.println("1. Enseñar por pantalla 'Hola mundo'");
			System.out.println("2. Enseñar por pantalla los números entre 5 y 10");
			System.out.println("3. Enseñar por pantalla 'Saludos'");
			System.out.print("Introduce una opción: ");
			a = S.nextInt();
		}while(a > 3);
		
		switch(a){
			case 1 : System.out.println("Hola mundo"); break;
			case 2 : 
				for (int i = 5; i <= 10; i++) {
					System.out.println(i); 
				} 
				break;
			case 3 : System.out.println("Saludos"); break;
			default: System.out.println("Elige una opción correcta");
		}
		
	}
	
}
