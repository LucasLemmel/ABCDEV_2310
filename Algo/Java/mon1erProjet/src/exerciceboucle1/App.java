package exerciceboucle1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		/*
		 * 	Variable
				nb est un entier
			Début du programme
					ecrire "saisir un nombre entre 1 et 3"
					lire nombre
					Debut Tant que
							Tant que (nb < 1 OU nb >3)
							faire
								ecrire "saisir un nombre entre 1 et 3"
								lire nombre
					Fin Tant que
			Fin du programme
		 */
		
		
		int nb=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(nb < 1 || nb > 3) {
			System.out.println("Saisir un nombre entre 1 et 3");
			nb = sc.nextInt();
			if(nb >=1 && nb <= 3) {
			System.out.println("Le nombre convien");
			}
			else {
			System.out.println("Le nombre ne convien pas");
			}
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
