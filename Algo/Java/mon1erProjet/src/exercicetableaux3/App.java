package exercicetableaux3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int i;
		int nbpositif = 0;
		int nbnegatif = 0;
		System.out.println("saisir le nombre de valeur à saisir");
		i = sc.nextInt();
		
		int[] tableau = new int[i];
		
		
		for(i = 0; i <= tableau.length-1;i++) {
			System.out.println("saisir la valeur a ajouter dans le tableau");
			tableau[i] = sc.nextInt();
			
			if(tableau[i] >= 0) {
				nbpositif = nbpositif + 1;
				
			}
			else {
				nbnegatif = nbnegatif + 1;
			}
			
			
		}

		System.out.println("il y a "+ nbpositif +" valeurs positif et "+ nbnegatif +" valeurs negatif");
		
		
		
		
		
		
		
		
		
		
		

	}

}
