package hajjEakbar12577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hajjEakbar();
	}

	private static void hajjEakbar() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(sc.hasNext()) {
			String cad = sc.next();
			if(cad.equals("*"))
				break;
			if(cad.equals("Hajj"))
				System.out.println("Case "+(i+1)+": Hajj-e-Akbar");
			else if(cad.equals("Umrah"))
				System.out.println("Case "+(i+1)+": Hajj-e-Asghar");
			i++;
		}
		
	}

}
