package exercice1_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*Variable
		 *rayon est un entier
		 * aire est un réel
		 * volume est un réel
		 * Début du programme
		 * 		ecrire "saisir le rayon"
		 * 		lire rayon
		 * 		aire <-- 4*math.PI*pow(rayon,2)
		 * 		ecrire "l'aire est :",aire
		 *		volume <-- 4/3*Math.PI*pow(rayon,3)
		 *		ecrire "le volume est :",volume
		 * Fin du programme
		 */
		//Declaration des variable
		
		
		int rayon;
		double aire;
		double volume;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("saisir le rayon");
		rayon = sc.nextInt();
		
		aire = (4 * Math.PI * Math.pow(rayon,2));
		System.out.println("l'aire est :"+aire);
		
		volume = (4/3 * Math.PI * Math.pow(rayon,3));
		System.out.println("le volume est :"+volume);
		
		sc.close();
		
		
		
	}

}
