package searchingForNessy11044;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		searchingForNessy();
	}
	public static void searchingForNessy() {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		//int[][]sonar=new int[testCases][2];
		
		for (int i = 0; i < testCases; i++) {
			//sonar[i][0]= sc.nextInt();
			//sonar[i][1]= sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println((a/3)*(b/3));
		}
		
		
	}
}
