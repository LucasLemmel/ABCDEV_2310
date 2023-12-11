package exercicetableaux1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		int[] tableau = new int[7];
		int i;
		
		for(i = 0; i <= tableau.length-1;i++) {
			tableau[i] = 0;
			
		}

		for(int j = 0;j <= tableau.length-1;j++ )
		{
			System.out.print(tableau[j]+" ");
			System.out.println("\n");
		}
		
		
		
		
		
		

	}

}
