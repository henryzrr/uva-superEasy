package emoogleBalance12279;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emogleBalance();
	}
	
	private static void emogleBalance() {
		Scanner sc = new Scanner(System.in);
		int n=1;
		while(sc.hasNext()) {
			int cases = sc.nextInt();
			
			if(cases == 0)
				break;
			
			int x,y;
			x=y=0;
			for (int i = 0; i < cases; i++) {
				int aux = sc.nextInt();
				if(aux==0)
					y++;
				else
					x++;
			}
			System.out.println("Case "+n+": "+(x-y));
			n++;
		}
	}
}
