package La_Suite_De_Fibonacci;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		//Variable
		int position;
		int nb;
		String resultat;
		int nbPrecedent;
		int nbCourant;
		int nbSuivant;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("combien de nombre de la suite de Fibonacci souhaitez-vous afficher:");
		nb = sc.nextInt();
		
		position = 2;
		resultat = "\t0\n\t1";
		nbPrecedent = 0;
		nbCourant = 1;
		
		if(nb > 2) {
			while(position < nb) {
				nbSuivant = nbPrecedent + nbCourant;
				resultat = resultat +"\n\t"+ nbSuivant;
				nbPrecedent = nbCourant;
				nbCourant = nbSuivant;
				position = position + 1;
			}
		}
		else {
			nb = 2;
		}
		System.out.println("les "+ nb +" premiers nombres de la suite de Fibonacci sont \n\n"+ resultat+"\n");
		System.out.println(nb +" nombre affichés");
		sc.close();
		
		
		
	}

}
