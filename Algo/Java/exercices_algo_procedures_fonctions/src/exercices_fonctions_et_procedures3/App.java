package exercices_fonctions_et_procedures3;

import java.util.Scanner;

public class App {

	public static boolean estDivisible(int a,int b) {
		
		
		
		if(a % b ==0) {
			
			return true;
			
		}
		else {
			
			return false;
			
		}
		
		
		
	}
	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un 1er nombre :");
		a = sc.nextInt();
		System.out.println("Saisir un 2eme nombre :");
		b = sc.nextInt();
		
		estDivisible(a,b);
		
		if(estDivisible(a,b)) {
			
			System.out.println(a+" est divisible par "+b);
			
		}
		else {
			
			System.out.println(a+" n'est pas divisible par "+b);
			
		}
	}

}
