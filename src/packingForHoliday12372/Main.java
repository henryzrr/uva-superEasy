package packingForHoliday12372;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		packingForHOliday();
	}

	private static void packingForHOliday() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int vol = 20*20*20;
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a<=20 && b<=20 && c<=20)
				System.out.println("Case "+(i+1)+": good");
			else
				System.out.println("Case "+(i+1)+": bad");
		}
	}

}
