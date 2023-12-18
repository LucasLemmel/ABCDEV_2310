package exerciceprocedureetfonction1;

import java.util.Scanner;

public class App {
	public static void inversion(int a,int b,int c) {
		c = a;
		a = b;
		b = c;
		
		
		System.out.println(" a : "+ a);
		System.out.println(" b : "+ b);
		
	}
	public static void main(String[] args) {
		
		
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir a : ");
		a = sc.nextInt();
		System.out.println("saisir b : ");
		b = sc.nextInt();
		
		System.out.println(" a : "+ a);
		System.out.println(" b : "+ b);
		
		inversion(a,b,c);
		
		sc.close();
		
		
		
		
		
		
		
		
		

	}

}
