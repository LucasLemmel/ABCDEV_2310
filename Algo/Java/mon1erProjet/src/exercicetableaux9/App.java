package exercicetableaux9;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int i;
		double moyenne = 0;
		int supmoyenne = 0;
		System.out.println("saisir le nombre de note à saisir");
		i = sc.nextInt();
		
		int[] tableau = new int[i];
		
		
		for(i = 0; i <= tableau.length-1;i++) {
			System.out.println("saisir la note à ajouter dans le tableau");
			tableau[i] = sc.nextInt();
			moyenne = moyenne + tableau[i];
			
		}
		moyenne = moyenne / (i);
		for(i = 0; i <= tableau.length-1;i++) {
			if(tableau[i]>moyenne) {
			supmoyenne = supmoyenne +1;
			}
		}	
		System.out.println("la moyenne de la classe est de "+ moyenne);
		System.out.println("il y a "+ supmoyenne +" notes supérieures à la moyenne");
		sc.close();
		
		
		
		
		
		
		
		
		

	}

}
