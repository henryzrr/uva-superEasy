package languageDetection12250;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		languageDetection();
	}
	public static void languageDetection() {
	
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while(sc.hasNext()) {
			String saludo = sc.nextLine();
			
			if(saludo.equals("#"))
				break;
			
			switch (saludo) {
			case "HELLO":
				System.out.println("Case "+(i) +": ENGLISH");
				break;
			case "HOLA":
				System.out.println("Case "+(i) +": SPANISH");
				break;
			case "HALLO":
				System.out.println("Case "+(i) +": GERMAN");
				break;
			case "BONJOUR":
				System.out.println("Case "+(i) +": FRENCH");
				break;
			case "CIAO":
				System.out.println("Case "+(i) +": ITALIAN");
				break;
			case "ZDRAVSTVUJTE":
				System.out.println("Case "+(i) +": RUSSIAN");
				break;
			default:
				System.out.println("Case "+(i) +": UNKNOWN");
				break;
			}
			i++;
			
		}
	}

}