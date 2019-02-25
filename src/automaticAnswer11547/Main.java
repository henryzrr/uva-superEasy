package automaticAnswer11547;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		automaticAnswe();
	}
	public static void automaticAnswe() {
		Scanner sc = new Scanner(System.in);
		//while(sc.hasNext()) {
			int cases = sc.nextInt();
			for (int i = 0; i < cases; i++) {
				int n = sc.nextInt();
				System.out.println(Math.abs((((((((n*567)/9)+7492)*235)/47)-498)/10)%10));
			}
		//}
	}

}
