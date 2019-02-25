package saveSetu12403;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saveSetu();
	}

	private static void saveSetu() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int monto = 0;
		for (int i = 0; i < cases; i++) {
			String orden = sc.next();
			if(orden.equals("donate")) 
				monto +=sc.nextInt();
			else if(orden.equals("report"))
				System.out.println(monto);
		}
	}

}
