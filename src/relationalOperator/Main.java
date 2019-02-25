package relationalOperator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		relationalOperator();
	}

	private static void relationalOperator() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a<b)
				System.out.println("<");
			else if(a>b)
				System.out.println(">");
			else
				System.out.println("=");
		}
	}

}
