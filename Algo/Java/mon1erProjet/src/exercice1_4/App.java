package exercice1_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		
	/* VARIABLES
	 *  somme est un entier
 	 *	interet est un réel
     * 	annees est un entier/
 	 *	interet_simple est un réel
 	 *	interet_composer est un réel
 	 * Début du programme
 	 *	ecrire "saisir somme"
 	 *	Lire somme
 	 *	ecrire "saisir interet"
 	 *	Lire interet
 	 *	ecrire "saisir annees"
 	 *	Lire annees
	 *  interet_simple <-- somme*(1+annees*interet/100)
	 *  ecrire "l'nteret simple est:",interet_simple
	 * 	interet_composer <--  somme*pow((1+interet/100),annees)
	 *  ecrire "l'interet composer est:",interet_composer
	 * Fin du programme
	 */
		
		int somme;
		double interet;
		int annees;
		double interet_simple;
		double interet_composer;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir la somme");
		somme = sc.nextInt();
		
		System.out.println("saisir l'interet");
		interet = sc.nextDouble();
				
		System.out.println("saisir le nombre d'annees");
		annees = sc.nextInt();
		
		interet_simple = somme*(1+annees*interet/100);
		System.out.println("l'nteret simple est:"+interet_simple);
		
		interet_composer =  somme*Math.pow((1+interet/100),annees);
		System.out.println("l'nteret composer est:"+interet_composer);
		
		sc.close();
		
		
	}

}
