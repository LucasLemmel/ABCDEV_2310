package exercice1_5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		/*
		 * VARIABLES
 		 *		a est un entier
 		 *		b est un entier
 		 *		c est un entier
 		 * Début du programme
 		 *		ecrire "saisir la valeur de a"
 		 *		Lire a
 		 *		ecrire "saisir la valeur de b"
 		 *		Lire b
 		 *		ecrire "la valeurde a est:",a
 		 *		ecrire "la valeur de b est:",b
 		 *		c <-- a
 		 *		a <-- b
 		 *		b <-- c
 		 *		ecrire "la valeur de a est:"a
 		 *		ecrire "la valeur de b est:",b
 		 * Fin du programme
		 */
		
		
		int a;
		int b;
		int c;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir la valeur de a");
		a = sc.nextInt();
		
		System.out.println("saisir la valeur de b");
		b = sc.nextInt();
		
		System.out.println("la valeur de a est: "+a);
		
		System.out.println("la valeur de b est: "+b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("la valeur de a est: "+a);
		
		System.out.println("la valeur de b est: "+b);
		
		sc.close();
		
	}

}
