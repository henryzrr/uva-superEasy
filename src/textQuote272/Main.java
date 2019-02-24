package textQuote272;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		texQuotes();
		
	}
	public static  void texQuotes(){
		Scanner sc = new Scanner(System.in);
		System.out.println("introdusca el texto");
		boolean inicio = true;
		
		while(sc.hasNext()) {
			String cadena = sc.nextLine();
			int tam = cadena.length();
			String cadFinal="";
			
			for(int i=0;i<tam;i++){
				if (cadena.charAt(i)=='"'){
					if(inicio){
						cadFinal = cadFinal+"``";
						inicio = false;
					}else{
						cadFinal = cadFinal+"''";
						inicio = true;
					}
					
				}
				else{
					cadFinal = cadFinal+cadena.charAt(i); 
				}
			}
			System.out.println(cadFinal);
		}
	}
		
}


