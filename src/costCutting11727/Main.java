package costCutting11727;

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
			
			for (int i = 0; i < cases; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				
				int menor,medio,mayor;
				mayor=menor=medio=1000;
				
				
				if(a>mayor)
					mayor=a;
				else if(a<menor)
					menor = a;
				else if(a>menor && a<mayor)
					medio = a;
				
				if(b>mayor)
					mayor=b;
				else if(b<menor)
					menor = b;
				else if(b>menor && b<mayor)
					medio = b;
				
				if(c>mayor)
					mayor=c;
				else if(c<menor)
					menor = c;
				else if(c>menor && c<mayor)
					medio = c;
				
				
				System.out.println("Case "+(i+1)+ ": "+medio);
				
			}
		//}
	}

}

