package exercicecondition1_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*	VARIABLE
    			nombreN est un entier
			début du programme 
    			ecrire "saisir un nombre"
    			lire nombreN
    			si nombreN < 0
    			alors
        		ecrire ,nombreN " est négatif"
    			sinon si nombreN > 0
        			alors
           				ecrire ,nombreN " est positif"
        			sinon
           				ecrire ,nombreN " est nul"
			fin du programe
		 * 
		 */
		
		
		int nombreN;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre");
		nombreN = sc.nextInt();
		
		if(nombreN < 0) {
			System.out.println(nombreN +" est négatif");
		}
		else if (nombreN > 0) {
				System.out.println(nombreN +" est positif");
		}
			else {
				System.out.println(nombreN +" est nul");
			}
		
		sc.close();
		
		
		
		

	}

}
