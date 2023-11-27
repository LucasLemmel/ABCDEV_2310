package exerciceboucle2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		/*
		 * 	Variable
				nb est un entier
			Début du programme
				ecrire "saisir un nombre"
				lire nb
				Debut Tant que
					Tant que (nb < 10 OU nb > 20)
					faire
						Si (nb < 10)
							ecrire "saisir un nombre plus grand"
							lire nb
						sinon si (nb>20)
								ecrire "saisir un nombre plus petit"
								lire nb
				Fin Tant que
			Fin du programme
		 */
		
		int nb;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre");
		nb = sc.nextInt();
		
		while(nb < 10 || nb > 20) {
			if(nb < 10) {
				System.out.println("Saisir un nombre plus grand");
				nb = sc.nextInt();
			}
			else if(nb >20) {
				System.out.println("Saisir un nombre plus petit");
				nb = sc.nextInt();
			}
				
				
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
