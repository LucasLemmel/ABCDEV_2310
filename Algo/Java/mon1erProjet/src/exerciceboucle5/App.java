package exerciceboucle5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*	Variables
				nombre est un entier
				factorielle est un entier
				i est un entier
			Debut du programme
				Ecrire "Saisir un nombre"
				Lire nombre
				factorielle <-- 1
				Debut pour
						Pour i allant de 2 à nombre
						factorielle <-- factorielle * i
						i suivant
				Fin pour
					Ecrire "La factorielle de ",nombre" est :",factorielle
			Fin du programme
		 * 
		 */
		
		
		int nombre;
		int factorielle =1;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre");
		nombre = sc.nextInt();
		
		for(int i=2;i <= nombre;i++) {
			factorielle = factorielle * i;
		}
		
		System.out.println("la factorielle de "+ nombre +" est : "+ factorielle);
		
		sc.close();
		
		
		
		
		
	}

}
