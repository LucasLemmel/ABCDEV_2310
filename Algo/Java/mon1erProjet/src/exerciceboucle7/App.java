package exerciceboucle7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		int nombre=1;
		int nvnombre = 0; 
		int i = 0;
		int position = 0;
		Scanner sc = new Scanner(System.in);
		
		
		while(nombre != 0) {
			System.out.println("Saisir un nombre");
			nombre = sc.nextInt();
			i++;
			if(nvnombre < nombre) {
				
				nvnombre = nombre;
				position = i;
			}
			
		}
		
		System.out.println("Le plus grand nombre est "+ nvnombre);
		System.out.println("il a été saisi en position numéro : "+ position);
		sc.close();
		
		
		
	}

}
