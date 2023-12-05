package exercice3_1;

import java.util.Random;
import java.util.Scanner;

public class App {
/*
 VARIABLES
	nombre est un entier
	nbJoueur est un entier
	max est un entier
	min est un entier
	essai est un entier
	win est un boolean

DEBUT DU PROGRAMME
	nombre <-- est genere aleatoirement
	essai = 0
	win = false
	min = 0
	max = 100
Debut boucle
Faire
	Ecrire "Saisir un nombre entre ",min," et ",max
	Lire nbJoueur
	Debut si
		si nbJoueur est superieur à nombre
		Alors 
		      Ecrire "C'est moins !!!"
		      max <-- nbJoueur 
		sinon si nbJoueur est inferieur à nombre
		      Ecrire"C'est plus !!!"
		      min <-- nbJoueur 
		sinon
		      win <-- vrai
	Fin Si
	essai <-- essai+1
Tant que win = faux
	Ecrire "Bravo, vous avez trouve en", essai,  " essais "
Fin du programme
 */
	public static void main(String[] args) {
		
		
		
		int nombre;
		int nbJoueur;
		int min=0;
		int max=100;
		int essai=1;
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		nombre = rand.nextInt(max - min + 1)+ min;
		
		
		System.out.println("Saisir un nombre entre "+ min +" et "+ max);
		nbJoueur = sc.nextInt();
		
		
		while(nbJoueur != nombre) {
			if(nbJoueur < nombre) {
				min = nbJoueur;
			}
			else if(nbJoueur > nombre) {
				max = nbJoueur;
			}
			System.out.println("Saisir un nombre entre "+ min +" et "+ max);
			nbJoueur = sc.nextInt();
			essai = essai + 1;
		}
		if(nbJoueur == nombre) {
			System.out.println("Bravo, vous avez trouvé en "+ essai +" essais ");
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		

	}

}
