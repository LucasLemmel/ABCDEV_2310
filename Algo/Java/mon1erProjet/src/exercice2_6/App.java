package exercice2_6;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Variable
				nombreN est un entier
				i est un entier
			Début du programme
				ecrire "saisir un nombre"
				lire nombreN
				Debut Pour
						Pour i allant de 1 à nombreN -1
							Debut Si
									Si nombreN mod i = 0
									Alors
										ecrire ,nombreN " est que divisible par ",i " et par " ,nombreN
							Fin Si
			Fin du programme
		 */
		
		int nombreN;
		int i;
		int compteur;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir un nombre");
		nombreN = sc.nextInt();
		compteur = 0;
		
		for(i = 2;i < nombreN;i++ ) {
			if(nombreN % i == 0) {
				compteur = compteur + 1;
				
			}
		}	
			if(compteur == 0) {
				System.out.println("le nombre "+ nombreN +" est premier");
			}
			else {
				System.out.println("le nombre "+ nombreN +" n'est pas premier");
			}
			
			
			
			sc.close();
		
		
		
		

	}

}
