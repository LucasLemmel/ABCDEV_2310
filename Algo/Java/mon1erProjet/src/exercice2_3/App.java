package exercice2_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		
		/*
		 * VARIABLE
    			a est un réel
    			b est un réel
    			c est un réel
		   DEBUT DU PROGRAMME
    			ecrire "saisir a"
    			lire a
    			ecrire "saisir b"
    			lire b
    			ecrire "saisir c"
    			lire c
    			Si (a <= b et a <= c) 
    			alors
      			Si(b <= c ) 
      			alors
          		a <= b <= c
      			sinon
          		a <= c <= b
    			sinon Si (b <= a et b <= c)
          				alors
            			si (a <= c)
            			alors    
                		b <= a <= c
            			sinon
                		b <= c <= a
          				sinon Si (c <= a ET c <= b)
                				alors
                  				Si (a <= b)
                  				alors
                      			c <= a <= b
                  				sinon
                     			c <= b <= a
                      
		 */

		double a;
		double b;
		double c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir a");
		a = sc.nextDouble();
		System.out.println("saisir b");
		b = sc.nextDouble();
		System.out.println("saisir c");
		c = sc.nextDouble();
		
		if(a <= b && a <= c) {
			if(b <= c) {
				System.out.println(a +" "+ b +" "+ c);
				}
			
			else {
			   System.out.println(a +" "+ c +" "+ b);
			    }
		}
		else if(b <= a && b <= c) {
				if(a <= c) {
					System.out.println(b +" "+ a +" "+ c);
				}
				else {
					System.out.println(b +" "+ c +" "+ a);
				}
		}
		     else  {
		    	 	if(a <= b) {
		    	 		System.out.println(c +" "+ a +" "+ b);
		    	 	}
		    	 	else {
		    	 		System.out.println(c +" "+ b +" "+ a);
		    	 	}
		     }
		
		
		sc.close();
		
		
		
	}

}
