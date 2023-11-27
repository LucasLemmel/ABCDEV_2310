package exercicecondition2_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * 	VARIABLE
    			nombre1 est un entier
    			nombre2 est un entier
			début du programme 
    			ecrire "saisir le nombre1"
    			lire nombre1
    			ecrire "saisir le nombre2"
    			lire nombre2
    			si (nombre1 * nombre2) > 0
    			alors 
				ecrire "ce nombre est positif"
    			sinon
        			si (nombre1 * nombre2) < 0
    				alors 
            		ecrire "ce nombre est négatif"
    				sinon
            			si (nombre1 * nombre2) = 0
	    				alors
                		ecrire "ce nombre est nul"
				fin du programe
		 */
		
		
		
		int nombre1;
		int nombre2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un 1er nombre");
		nombre1 = sc.nextInt();
		
		System.out.println("Saisir un 2eme nombre");
		nombre2 = sc.nextInt();
		
		if((nombre1 * nombre2) > 0) {
			System.out.println("ce nombre est positif");
		}
		else if((nombre1 * nombre2) < 0) {
			System.out.println("ce nombre est négatif");
		}
		else {
			System.out.println("ce nombre est nul");
		}
		
		sc.close();
		
		
		
		

	}

}
