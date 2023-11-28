package exerciceboucle6;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		/*Variable
		 * 		nombre est un entier
		 * 		i est un entier
		 *début duprogramme
		 * 		i <-- 0	
		 * 		debut tant que
		 * 				tant que(i != 20)
		 * 				faire 
		 * 				ecrire"Saisir un nombre"	
		 * 				lire nombre
		 * 				i <-- i +1
		 * 				debut si
		 * 					si (nvnombre < nombre )
		 * 					alors
		 * 					nvnombre <-- nombre
		 * 				fin si
		 * 				ecrire"Le plus grand nombre est ",nvnombre
		 *fin du programme
		 */
		
		int nombre;
		int i = 0;
		int nvnombre = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(i != 20) {
			System.out.println("Saisir un nombre");
			nombre = sc.nextInt();
			i = i + 1;
			
			if(nvnombre < nombre) {
				
				nvnombre = nombre;
			}
			
		}
		
		System.out.println("Le plus grand nombre est "+ nvnombre);
		
		sc.close();
		
		
		
		
		
		
		
		
	}

}
