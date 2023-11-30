package exercicecondition5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		
		/*
		 * Variable
		 * 		nbphotocopies est un entier
		 * 		facture est un réel
		 * debut du programme
		 * 		ecrire "Saisir le nombre de photocopies effectuées"
		 * 		lire nbphotocopies
		 * 		debut Si
		 * 				Si nbphotocopies <= 10
		 * 				alors
		 * 					facture <-- nbphotocopies * 0.10
		 * 					ecrire "la facture est de ",facture"€"
		 * 				Sinon Si nbphotocopies <= 30
		 * 						facture <-- 10*0.1 + (nbphotocopies-10) *0.09
		 * 						ecrire "la facture est de ",facture"€"
		 * 					Sinon Si nbphotocopies > 30
		 * 							facture = 10 * 0.1 + 20 * 0.09 + (nbphotocopies - 30) * 0.08
		 * 							ecrire "la facture est de ",facture"€"
		 * 		Fin Si
		 * fin du programme
		 */
		
		
		int nbphotocopies;
		double facture;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le nombre de photocopies effectuées");
		nbphotocopies = sc.nextInt();
		
		if(nbphotocopies <= 10) {
			facture = nbphotocopies * 0.10;
			System.out.println("la facture est de "+ facture +"€");
		}
		else if( nbphotocopies <= 30) {
			facture = 10 * 0.1 + (nbphotocopies - 10) * 0.09;
			System.out.println("la facture est de "+ facture +"€");
		}
		else if(nbphotocopies > 30) {
			facture = 10 * 0.1 + 20 * 0.09 + (nbphotocopies - 30) * 0.08;
			System.out.println("la facture est de "+ facture +"€");
		}
		sc.close();
		
		
		
		

	}

}
