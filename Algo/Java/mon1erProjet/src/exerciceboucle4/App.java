package exerciceboucle4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 *	Variable
				nb est un entier
				somme est un entier
				i est un entier
			Début du programme
				ecrire "saisir un nombre"
				lire nb
				somme <-- 0
 				debut pour
						POUR i Allant de 1 à nb
		 				somme <-- somme + i
 						FIN_POUR
 						ecrire"La somme est :"
 						Afficer somme
			Fin du programme
		 */
		
		int nb;
		int somme;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre");
		nb = sc.nextInt();
		somme = 0;
		
		for(i=1;i <= nb;i++) {
			somme = somme + i;
			
		}
		System.out.println("la somme est : "+ somme);
		
		sc.close();
		
		
	}

}
