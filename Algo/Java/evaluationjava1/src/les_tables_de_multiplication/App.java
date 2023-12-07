package les_tables_de_multiplication;

import java.util.Scanner;

public class App {
	/*
  	Variable
 		nombre est entier
 		i est un entier
 		resultat est un entier
 		nvTable est une chaine de caractere
 		condition1 est un booleen
 		condition2 est un booleen
 	debut du programme
 		ecrire "Saisir un nombre entre 1 et 10:"
 		lire nombre
 		i <--0
 		debut tant que
 				tant que (i != 11)
 				faire
 				debut pour
 		 				pour i allant de 0 à 10
 						faire
 						resultat = i * nombre 
 						ecrire ,i" * ",nombre" = ",resultat
 						i = i + 1
 				fin pour
 				ecrire "Souhaitez vous afficher une autre table ? Oui(O) ou Non(N)"
 				lire nvTable
 				condition1 <-- nvTable = "O"
 				condition2 <-- nvTable = "N"
 				debut Si
 						Si(condition1)
 						alors
 						i <-- 0
						ecrire"Saisir un nombre entre 1 et 10:")
						lire nombre
 						Sinon Si(condition2) 
							alors
							i = 11
				fin Si
 		fin tant que
 	fin du programme			
 */
	public static void main(String[] args) {
		
		
		
		//variable
		int nombre;
		int i = 0;
		int resultat;
		String nvTable;
		boolean condition1;
		boolean condition2;
		
		//debut du programme
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Saisir un nombre entre 1 et 10:");
		//nombre = sc.nextInt();
		while(i!=11) {
			System.out.println("Saisir un nombre entre 1 et 10:");
			nombre = sc.nextInt();
		for(i = 0; i <= 10;i++) {
		resultat = i * nombre;
		System.out.println(i +" * "+ nombre +" = "+resultat);
			
		}
		
		System.out.println("Souhaitez vous afficher une autre table ? Oui(O) ou Non(N)");
		nvTable = sc.next();
		
		condition1 = nvTable.equals("O");
		condition2 = nvTable.equals("N");
		
		if(condition1) {
			i=0;
			//System.out.println("Saisir un nombre entre 1 et 10:");
			//nombre = sc.nextInt();
		}
		else if(condition2) {
			i = 11;
		}
		}	
		sc.close();
		//fin du programme
		
		
	}

}
