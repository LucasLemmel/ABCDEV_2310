package exercice2_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
	/*VARIABLES
 		a est un entier
 		b est un entier
	  Début du programme
	    ecrire "saisir la valeur de a"
 		Lire a
 		ecrire "saisir la valeur de b"
 		Lire b
 		Debut Si
 				Si (a < b) Alors
 					Afficher ,a < ,b
 				Sinon
 				 	Afficher ,b < ,a
 		Fin Si
 	  Fin du programme
	 */
		
		
	int a;
	int b;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("saisir la valeur de a");
		a = sc.nextInt();
		
		System.out.println("saisir la valeur de b");
		b = sc.nextInt();
		
		if(a < b) {
			System.out.println(a+" < "+b);
		}
		else if(b < a) {
			System.out.println(b+" < "+a);
		}
		
		else {
			System.out.println(a+" = "+b);
		}
		sc.close();
		
	}

}
