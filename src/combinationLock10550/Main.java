package combinationLock10550;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combinationLock();

	}
	
	public static void combinationLock() {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			
			int [] numeros = new int[4];
			numeros[0] = sc.nextInt();
			numeros[1] = sc.nextInt();
			numeros[2] = sc.nextInt();
			numeros[3] = sc.nextInt();
			
			if (numeros[0]==numeros[1] &&numeros[1]==numeros[2]&&numeros[2]==numeros[3]) {
				break;
			}else {
				int suma = (((numeros[0]-numeros[1])+40)%40)*9;
				suma += (((numeros[2]-numeros[1])+40)%40)*9;
				suma += (((numeros[2]-numeros[3])+40)%40)*9;
					
				System.out.println(suma+1080);
			}
		}
		sc.close();
	}
}
