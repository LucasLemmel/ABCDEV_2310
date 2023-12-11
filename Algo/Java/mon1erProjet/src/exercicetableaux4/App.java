package exercicetableaux4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nb,somme;
		int[] tab;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("saisir le nombre de valeur du tableau");
		nb = sc.nextInt();
		
		tab = new int[nb];
		
		somme = 0;
		for(int i = 0; i <= tab.length-1;i++) {
			System.out.println("saisir le nombre n° "+ (i+1));
			tab[i] =sc.nextInt();
			somme = somme +tab[i];
		}
		
		System.out.println("la somme du tableau est : "+ somme);
		
		sc.close();
		
		
		
		
		

	}

}
