package combinationLock10550;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combinationLock();
	}
	
	public static void combinationLock() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese");
		while(sc.hasNext()) {
			
			String cad = sc.nextLine();
			int tam = cad.length();
			int espacio = 0;
			int [] numeros = new int[4];
			String auxNum="";
			for (int i = 0; i < tam; i++) {
				if(cad.charAt(i)!=' ') {
					auxNum = auxNum + cad.charAt(i);
				}else {
					numeros[espacio] = Integer.parseInt(auxNum);
					espacio++;
					auxNum = "";
				}
			}
			int resp = 720+ (Math.abs(numeros[0]-numeros[1])*9)+
					((Math.abs(numeros[1]-numeros[2])*9)-360)+
					(Math.abs(numeros[2]-numeros[3])*9);
			System.out.println(resp);
		}
		sc.close();
	}
}
