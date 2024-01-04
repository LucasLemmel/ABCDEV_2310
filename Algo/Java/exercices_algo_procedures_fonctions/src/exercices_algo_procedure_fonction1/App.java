package exercices_algo_procedure_fonction1;

import java.util.Scanner;

public class App {
	/*
	FONCTION 
		entier calculeSomme(entier arg1, entier arg2, entier arg3, entier arg4, entier arg5)
		resultat est un entier
		resultat <-- arg1 + arg2 + arg3 + arg4 + arg5
		retourner resultat
	FIN FONCTION
	VARIABLES
		nombre1, nombre2, nombre3, nombre4, nombre5 sont des entiers
		addition est un entier
	DEBUT DU PROGRAMME
		ecrire "Saisir le 1er nombre"
		lire nombre1
		ecrire "Saisir le 2eme nombre"
		lire nombre2
		ecrire "Saisir le 3eme nombre"
		lire nombre3
		ecrire "Saisir le 4eme nombre"
		lire nombre4
		ecrire "Saisir le 5eme nombre"
		lire nombre5
		additon <-- calculeSomme(nombre1,nombre2,nombre3,nombre4,nombre5)
		ecrire "La somme des 5 nombres est : ",addition
	FIN DU PROGRAMME
	
	 */
	public static int calculeSomme(int arg1,int arg2,int arg3,int arg4,int arg5) {
		int resultat;
		resultat = arg1 + arg2 + arg3 + arg4 + arg5;
		return resultat;
	}
	public static void main(String[] args) {
		
		int nombre1, nombre2, nombre3, nombre4, nombre5;
		int addition;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir le 1er nombre");
		nombre1 = sc.nextInt();
		System.out.println("saisir le 2eme nombre");
		nombre2 = sc.nextInt();
		System.out.println("saisir le 3eme nombre");
		nombre3 = sc.nextInt();
		System.out.println("saisir le 4eme nombre");
		nombre4 = sc.nextInt();
		System.out.println("saisir le 5eme nombre");
		nombre5 = sc.nextInt();
		
		addition = calculeSomme(nombre1,nombre2,nombre3,nombre4,nombre5);
		
		System.out.println("La somme des 5 nombres est : "+ addition);
		
		sc.close();
		
		
		
		
		
		
		
		
	}

}
