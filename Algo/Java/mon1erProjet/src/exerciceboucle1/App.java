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
		
		
		int nb;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre entre 1 et 3");
		nb = sc.nextInt();
		
		while(nb < 1 || nb > 3) {
			System.out.println("Saisir un nombre entre 1 et 3");
			nb = sc.nextInt();
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
