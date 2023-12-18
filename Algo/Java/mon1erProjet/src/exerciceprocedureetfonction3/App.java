package exerciceprocedureetfonction3;

import java.util.Scanner;

public class App {
	public static void calculemoyenne(double nombre1,double nombre2,double moyenne) {
		
		 moyenne = (nombre1 + nombre2)/2;
		
		
		System.out.println("La moyenne des 2 nombre est : "+moyenne);
		
		
	}
	public static void main(String[] args) {
		
		double nombre1;
		double nombre2;
		double moyenne=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le 1er nombre");
		nombre1 = sc.nextInt();
		
		System.out.println("Saisir le 2eme nombre");
		nombre2 = sc.nextInt();
		calculemoyenne(nombre1,nombre2,moyenne);
		
		
		sc.close();
		
		
		
		
	}

}
