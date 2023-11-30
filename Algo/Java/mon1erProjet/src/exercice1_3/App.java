package exercice1_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Variable
		 * rayon est un entier
		 * angle est un entier
		 * aire est un réel
		 * Début du programme
		 * 		ecrire "saisir le rayon"
		 * 		lire rayon
		 * 		ecrire "saisir l'angle"
		 * 		lire angle
		 * 		aire <-- (PI*rayon^2*angle)/360
		 * 		ecrire "l'aire du secteur circulaire est :",aire
		 *		
		 * Fin du programme
		 * 
		 */
		
		
				//Variable
				int rayon;
				int angle;
				double aire;
				//constante
				final double pi = Math.PI;
				Scanner sc = new Scanner(System.in);
				
				
				System.out.println("saisir le rayon");
				rayon = sc.nextInt();
		
				System.out.println("saisir l'angle");
				angle = sc.nextInt();
		
				aire = (pi * Math.pow(rayon,2 ) * angle) / 360;
				
				aire = Math.round(aire*1000.00)/1000.00;
				
				System.out.println("l'aire du secteur circulaire est :"+aire);
				
				sc.close();
				
		
	}

}
