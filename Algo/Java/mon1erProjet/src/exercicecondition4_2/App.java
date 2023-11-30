package exercicecondition4_2;

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
			Fin du programme

		 */
		
		int heures;
		int minutes;
		int secondes;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir les heures");
		heures = sc.nextInt();
		
		System.out.println("Saisir les minutes");
		minutes = sc.nextInt();
		
		System.out.println("Saisir les secondes");
		secondes = sc.nextInt();
		
		secondes = secondes + 1;
		
		if(secondes == 60) {
			secondes = 0;
			minutes = minutes + 1;
		}
		if(minutes == 60) {
			minutes = 0;
			heures = heures + 1;
		}
		if(heures == 24) {
			heures = 0;
		}
		
		System.out.println("Dans une minute il sera "+ heures +" heure(s) "+ minutes +" minute(s) "+ secondes +" seconde(s)");
		
		sc.close();
		
		
		
		
		
		
		
	

	}

}
