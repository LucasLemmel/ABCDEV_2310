package exercicecondition1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * 	VARIABLE
    			nombreN est un entier
			début du programme 
    			ecrire "saisir un nombre"
    			lire nombreN
    			si nombreN < 0
    			alors ecrire "ce nombre est négatif"
    			sinon
        		ecrire "ce nombre est positif"
			fin du programe
		 */
		
		
		int nombreN;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre");
		nombreN = sc.nextInt();
		
		if(nombreN < 0) {
			System.out.println(nombreN +" est négatif");
		}
		else {
			System.out.println(nombreN +" est positif");
		}
		
		sc.close();
		

	}

}
