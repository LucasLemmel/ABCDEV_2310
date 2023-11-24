package exercice1;

import java.util.Scanner;

public class App {
	/*
 	VARIABLES
	nombre1 est un entier
	nombre2 est un entier
	moyenne est un reel
DEBUT DU PROGRAMME
	Ecrire "Saisir le 1er nombre"
	Lire nombre1
	Ecrire "saisir le 2eme nombre"
	Lire nombre2
	moyenne <-- (nombre1 + nombre2)/2d
	Ecrire "La moyenne est :",moyenne
FIN DU PROGRAMME
	 */
	public static void main(String[] args) {
		
		//Declaration des variable
		
		int nombre1;
		int nombre2;
		double moyenne;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir le 1er nombre");
		nombre1 = sc.nextInt();
		System.out.println("saisir le 2eme nombre");
		nombre2 = sc.nextInt();

		moyenne = (nombre1 + nombre2) / 2d;
		
		System.out.println("la moyenne de "+nombre1+" et "+nombre2+" est "+moyenne);
		
		sc.close();
	}

}
