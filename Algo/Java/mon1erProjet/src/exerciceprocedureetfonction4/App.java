package exerciceprocedureetfonction4;

import java.util.Scanner;

public class App {
	public static void anneBissextile(int annee) {
		if(annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
			System.out.println("l'année "+ annee +" est bissextile");
		}
		else {
			System.out.println( "l'année "+ annee +" n'est pas bissextile");
		}
	}
	public static void main(String[] args) {
		
		int annee;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir l'année");
		annee = sc.nextInt();
		
		anneBissextile(annee);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
