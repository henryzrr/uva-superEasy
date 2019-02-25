package costCutting11727;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		costCUtting();
	}
	public static void costCUtting() {
		Scanner sc = new Scanner(System.in);
		//while(sc.hasNext()) {
			int cases = sc.nextInt();
			int [] salary = new int[3];
			for (int i = 0; i < cases; i++) {
				salary[0] = sc.nextInt();
				salary[1] = sc.nextInt();
				salary[2] = sc.nextInt();
				
				Arrays.sort(salary);
				
				System.out.println("Case "+(i+1)+": "+salary[1]);
				
			}
		//}
	}

}

