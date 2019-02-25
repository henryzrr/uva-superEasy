package parking11364;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		parking();
	}
	public static void parking() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int testCases = sc.nextInt();

		for (int i = 0; i < testCases; i++) {
			int a = sc.nextInt();
			int mayor = 0;
			int menor = 100;
			for (int j = 0; j < a; j++) {
				int aux = sc.nextInt();
				if(aux>mayor) {
					mayor =aux;
				}if(aux<menor) {
					menor = aux;
				}
			}
			System.out.println((mayor-menor)*2);
			
		}
		sc.close();
	}
}
