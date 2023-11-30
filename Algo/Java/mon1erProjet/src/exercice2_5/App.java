package exercice2_5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Variable
				nombreN est un entier
				i est un entier
			Début du programme
				ecrire "saisir un nombre entier"
				lire nombreN
				Debut Pour
						Pour i allant de 2 à nombreN -1
						Debut Si
								Si nombreN mod i = 0
								Alors
									ecrire ,nombreN "est divisible par",i
								sinon
									ecrire ,nombreN "n'est pas divisible par",i
						Fin Si
				Fin du programme
		 */
		
		
		int nombreN;
		int i;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("saisir le nombreN");
		nombreN = sc.nextInt();
		
		for(i = 2;i < nombreN;i++) {
			if(nombreN % i == 0) {
				System.out.println(nombreN +" est divisible par"+ i);
			}
			sc.close();
		}
		
		
		
		
		
		
		
		
	}

}
