package exercicetableaux7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int i;
		
		
		System.out.println("saisir le nombre de valeur à saisir");
		i = sc.nextInt();
		
		int[] tableau = new int[i];
		
		
		for(i = 0; i <= tableau.length-1;i++) {
			System.out.println("saisir la valeur a ajouter dans le tableau");
			tableau[i] = sc.nextInt();
			tableau[i] = tableau[i]+1;
		}	
		
		for(int j = 0;j <= tableau.length-1;j++ ){
			System.out.print(tableau[j]+" ");
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
