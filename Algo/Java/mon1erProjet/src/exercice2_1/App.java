package exercice2_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		/* VARIABLES
 		 *	age est un entier
 		 * Début du programme 
 		 *	ecrire "saisir l'age"
 		 *	Lire age
		 *		SI (age<0) alors
 		 *			ecrire "vous n'êtes pas encore né"
 		 *		SINON
 		 *				SI (age>=0 et age<18) alors
 		 *					ecrire "vous êtes mineur"
 		 *				SINON
 		 *						ecrire "vous êtes majeur"
 		 * Fin du progamme
		 */
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir l'age");
		age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("vous êtes majeur");
		}
		else if(age >= 0){
			System.out.println("vous êtes mineur");
		}
		else {
			System.out.println("vous n'êtes pas encore né");
		}
	
		
		sc.close();
		
		
	}

}
