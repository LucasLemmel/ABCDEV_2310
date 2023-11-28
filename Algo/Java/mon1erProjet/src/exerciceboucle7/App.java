package exerciceboucle7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		int nombre=1;
		int nvnombre = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		
		while(nombre != 0) {
			System.out.println("Saisir un nombre");
			nombre = sc.nextInt();
			
			if(nvnombre < nombre) {
				
				nvnombre = nombre;
			}
			
		}
		
		System.out.println("Le plus grand nombre est "+ nvnombre);
		
		sc.close();
		
		
		
	}

}
