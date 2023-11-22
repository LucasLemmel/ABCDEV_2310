package exercice1_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Variable
		 * rayon est un entier
		 * angle est un entier
		 * airesecteurcirculaire est un réel
		 * Début du programme
		 * 		ecrire "saisir le rayon"
		 * 		lire rayon
		 * 		ecrire "saisir l'angle"
		 * 		lire angle
		 * 		airesecteurcirculaire <-- (Math.PI*pow(rayon,2)*angle)/360
		 * 		ecrire "l'aire du secteur circulaire est :",airesecteurcirculaire
		 *		
		 * Fin du programme
		 * 
		 */
		
		
		
				int rayon;
				int angle;
				double airesecteurcirculaire;
				
				Scanner sc = new Scanner(System.in);
				
				
				System.out.println("saisir le rayon");
				rayon = sc.nextInt();
		
				System.out.println("saisir l'angle");
				angle = sc.nextInt();
		
				airesecteurcirculaire = ((Math.PI*Math.pow(rayon,2 )*angle)/360);
				
				System.out.println("l'aire du secteur circulaire est :"+airesecteurcirculaire);
				
				sc.close();
				
		
	}

}
