package oneTwoThree12289;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oneTwoThree();
	}

	private static void oneTwoThree() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cases = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < cases; i++) {
			String cad = sc.nextLine();
			
			if (isNumber(cad,"one"))
				System.out.println(1);
			else if (isNumber(cad,"two"))
				System.out.println(2);
			else if(isNumber(cad,"three"))
				System.out.println(3);
		}
	}
	private static boolean isNumber(String cad, String num) {
		int aux = 0;
		int aux2 = 0;
		while (aux<num.length() && aux2<2) {
			if(cad.charAt(aux)!=num.charAt(aux))
				aux2+=1;
			
			aux++;
		}
		return aux2<=1;
	}

}
