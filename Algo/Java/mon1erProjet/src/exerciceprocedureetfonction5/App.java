package exerciceprocedureetfonction5;

import java.util.Scanner;

public class App {
	public static void dateValide(int jours,int mois,int annees) {
		
		boolean bissextile = annees % 4 == 0 && annees % 100 != 0 || annees % 400 == 0;
		boolean jourValide = true;
		if(jours > 31||jours < 1||mois > 12||mois < 1) {
			jourValide = false;	
		}
		else if(jours >= 1 && jours <= 29 && mois == 2 && bissextile) {
			jourValide = true;
		}
		else if(jours > 29 && mois == 2 || !bissextile) {
			jourValide = false;
		}
		else if(mois == 4 ||mois == 6 ||mois == 9 ||mois == 11 && jours > 30) {
			jourValide = false;
		}
		if(jourValide) {
			System.out.println("la date "+ jours +"/"+ mois +"/"+ annees +" est valide");
		}
		else {
			System.out.println("la date "+ jours +"/"+ mois +"/"+ annees +" n'est pas valide");
		}
	}
	public static void main(String[] args) {
		
		int jours,mois,annees;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir le jour");
		jours = sc.nextInt();
		System.out.println("saisir le mois");
		mois = sc.nextInt();
		System.out.println("saisir l'année");
		annees = sc.nextInt();
		
		dateValide(jours,mois,annees);
		
		sc.close();

	}

}
