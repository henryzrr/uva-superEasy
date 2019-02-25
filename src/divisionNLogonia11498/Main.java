package divisionNLogonia11498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int cases = sc.nextInt();
			if (cases==0) {
				break;
			}	
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int i = 0; i < cases; i++) {
				int x2 = sc.nextInt();
				int y2 = sc.nextInt();
				String res="";
				if((y2==y) || (x2 == x)) {
					res = "divisa";
				}else { 
					if(y2>y) { 
						res = "N";
					}else { 
						res = "S";
					}
					if(x2>x) {
						res = res+"E";
					}else {
						res =res+"O";
					}
				}
				System.out.println(res);
			}	
		}
	}

}
