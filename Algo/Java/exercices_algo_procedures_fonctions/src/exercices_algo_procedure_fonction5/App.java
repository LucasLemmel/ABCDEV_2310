package exercices_algo_procedure_fonction5;

import java.util.Scanner;

public class App {
	public static void majeurouMineur(int age ,int majoriter ) {
		
		if( age >= majoriter) {
			System.out.println("vous êtes majeur");
		}
		else {
			System.out.println("vous êtes mineur");
		}
		
	}
	public static void main(String[] args) {
		
		int age;
		int majoriter = 18;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir votre age :");
		age = sc.nextInt();
		
		majeurouMineur(age,majoriter);

		sc.close();
		
	}

}
