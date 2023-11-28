package exercicecondition3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		/*
		 *	VARIBLE
    			age est un entier
			DEBUT DU PROGAMME
   				ecrire"saisir age" 
    			lire age
   				Si age >= 6 ET age <= 7
    			alors
       				afficher age
      				ecrire "cet enfant est dans la catégorie Poussin"
    			sinon
       				si age >= 8 ET age <= 9
       				alors
          				afficher age
          				ecrire "cet enfant est dans la catégorie pupille"
       				sinon
          				si age >= 10 ET age <= 11
       						alors
          					afficher age
          					ecrire "cet enfant est dans la catégorie minime"
          				sinon
             				si age >= 12
             				alors
                				afficher age
               					ecrire "cet enfant est dans la catégorie cadet"
			FIN DU PROGRAMME
		 */
		
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un age");
		age = sc.nextInt();
		
		if(age >= 6 && age <= 7) {
			System.out.println(age +" cet enfant est dans la catégorie Poussin");
		}
		else if(age >= 8 && age <= 9) {
			System.out.println(age +" cet enfant est dans la catégorie pupille");
		}
		else if(age >= 10 && age <= 11) {
			System.out.println(age +" cet enfant est dans la catégorie minime");
		}
		else if(age >= 12) {
			System.out.println(age +" cet enfant est dans la catégorie cadet");
		}	
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
