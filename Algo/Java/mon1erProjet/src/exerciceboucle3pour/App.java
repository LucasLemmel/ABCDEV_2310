package exerciceboucle3pour;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * 	Variable
				nb est un entier
				i est un entier
			Début du programme
				ecrire "saisir un nombre"
				lire nb
				Debut Pour
						Pour i allant de 0 à  10
						nb = nb +1;
						Afficher nbr
				Fin Pour
			Fin du programme
		 */
		
		
		
		
		int nb;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre");
		nb = sc.nextInt();
		
		for(i = 0; i < 10;i++) {
			
			nb += 1;
			System.out.println(nb);
			
		}
		sc.close();
		
		
		
		

	}

}
