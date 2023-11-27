package exerciceboucle3tantque;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * 	Variable
				nb est un entier
				nbr est un entier
			Début du programme
				ecrire "saisir un nombre"
				lire nb
				nbr <-- 0
				Debut Tant que
						Tant que (nbr < 10)
						faire
							nb <-- nb + 1
							afficher nb
							nbr <-- nbr + 1
				Fin Tant que
			Fin du programme
		 */
		
		
		
		
		int nb;
		int nbr = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre");
		nb = sc.nextInt();
		
		while(nbr < 10) {
			nb = nb + 1;
			System.out.println(nb);
			nbr = nbr + 1;
		}
		
		sc.close();
		
		
		
		
		

	}

}
