
public class Bloque31 {

	public static void main(String[] arg) {
		
		int i = 0;
		int j;
		
		while (i < 5) {
			System.out.println(i + " ");
			i++;
		}
		
		System.out.println("Estoy fuera del bucle");

		for (j = 0; j < 5; j += 1) {
			System.out.println(j + " ");
			//j += 1;
		}

		System.out.println("Estoy fuera del bucle for");
		
	}
	
}
