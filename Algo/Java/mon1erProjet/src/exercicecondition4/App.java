package exercicecondition4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		/*
		 * 	Variables
				heures est un entier
				minutes est un entier
			Debut du programme
				Ecrire "Saisir les heures : "
				Lire heures
				Ecrire " Saisir les minutes : "
				Lire minutes
				minutes <-- minutes + 1
				Debut Si
						Si minutes = 60
						Alors
							minutes <-- 0
							heures <-- heures + 1
				Fin Si
				Debut Si
						Si heures = 24
						Alors
						heures <-- 0
				Fin Si
					Ecrire "Dans une minute il sera ",heures,"heure(s) ",minutes,"minute(s)"
Fin du programme20

		 */
		
		int heures;
		int minutes;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir les heures");
		heures = sc.nextInt();
		
		System.out.println("Saisir les minutes");
		minutes = sc.nextInt();
		
		minutes = minutes + 1;
		
		if(minutes == 60) {
			minutes = 0;
			heures = heures + 1;
		}
		if(heures == 24) {
			heures = 0;
		}
		
		System.out.println("Dans une minute il sera "+ heures +" heure(s) "+ minutes +"minute(s)");
		
		sc.close();
		
		
		
		
		
		
		
		
		

	}

}
