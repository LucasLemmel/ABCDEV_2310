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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir un nombre");
		nombreN = sc.nextInt();
		
		for(i = 1;i == nombreN - 1;i++ ) {
			if(nombreN % i == 0) {
				System.out.println(nombreN + " est que divisible par "+ i + " et par "+ nombreN);
			}
			sc.close();
		}
		
		
		

	}

}
