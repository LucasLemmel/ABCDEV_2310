package exercices_fonctions_et_procedures2;

import java.util.Scanner;

public class App {

	public static int plusGrandNombre(int[] tableau) {
		int nvNombre = 0;
		
		for(int i = 0; i <= tableau.length-1;i++) {		 
			if(nvNombre < tableau[i]) {
				nvNombre = tableau[i];
			}
		}
		return nvNombre;
	}
	
	
	
	public static void main(String[] args) {
		
		int nbTab;
		int nvNombre;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir le nombre de valeur du tableau");
		 nbTab = sc.nextInt();
		
		 int[] tableau = new int[nbTab];
		
		for(int i = 0; i <= tableau.length-1;i++) {
			System.out.println("saisir la valeur a ajouter dans le tableau");
			tableau[i] = sc.nextInt();
		}
		
		nvNombre = plusGrandNombre(tableau);
		
		for(int j = 0;j <= tableau.length-1;j++ ){
			System.out.print(tableau[j]+" ");
		}
		
		System.out.print("\n");
		System.out.println("Le plus grand nombre du tableau est : "+ nvNombre);
		
		sc.close();
	}

}
