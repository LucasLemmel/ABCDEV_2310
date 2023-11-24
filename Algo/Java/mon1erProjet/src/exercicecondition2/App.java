package exercicecondition2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * 	VARIABLE
    			nombre1 est un entier
    			nombre2 est un entier
			début du programme 
    			ecrire "saisir le 1er nombre"
    			lire nombre1
    			ecrire "saisir le 2eme nombre"
   				lire nombre2
    			si (nombre1 < 0 ET nombre2 < 0) OU (nombre1 > 0 ET nombre2 > 0)
    			alors 
				ecrire "le produit des 2 nombre est positif"
    			sinon si (nombre1 > 0 et nombre2 < 0) OU  (nombre1 < 0 et nombre2 > 0)
    			alors 
            	ecrire "le produit des 2 nombre est négatif"
    	
			fin du programe
		 */
		
		int nombre1;
		int nombre2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le 1er nombre");
		nombre1 = sc.nextInt();
		
		System.out.println("Saisir le 1er nombre");
		nombre2 = sc.nextInt();
		
		if((nombre1 < 0 && nombre2 < 0) || (nombre1 > 0 && nombre2 > 0)) {
			System.out.println("le produit des 2 nombre est positif");
		}
		else if((nombre1 > 0 && nombre2 < 0) || (nombre1 < 0 && nombre2 > 0)) {
			System.out.println("le produit des 2 nombre est négatif");
		}
		
		sc.close();
		
		
		
		
		
		

	}

}
