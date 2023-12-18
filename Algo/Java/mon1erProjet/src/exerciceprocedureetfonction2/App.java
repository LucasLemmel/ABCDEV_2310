package exerciceprocedureetfonction2;

import java.util.Scanner;

public class App {
	public static void calculaireperimetre(double perimetre,double aire,int a,int b,int c) {
		
		perimetre = a + b + c;
		aire = ((perimetre /2 - a)*(perimetre /2 - b)*(perimetre /2 - c));
		
		System.out.println("le périmètre du triangle est : "+perimetre);
		System.out.println("l'aire du triangle est : "+aire);
	}
	public static void main(String[] args) {
		
		double perimetre=0, aire=0;
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir a");
		a = sc.nextInt();
		System.out.println("saisir b");
		b = sc.nextInt();
		System.out.println("saisir c");
		c = sc.nextInt();
		
		calculaireperimetre(perimetre,aire,a,b,c);
		
		sc.close();

	}

}
