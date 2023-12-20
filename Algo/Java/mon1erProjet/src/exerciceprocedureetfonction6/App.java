package exerciceprocedureetfonction6;

public class App {
	public static void inversion(String[] tableau) {

		
		tableau[5] = tableau[0];
		tableau[0] = tableau[4];
		tableau[4] = tableau[1];
		tableau[1] = tableau[3];
		tableau[3] = tableau[4];
		tableau[4] = tableau[5];
		tableau[5] = "";
		for(int j = 0;j <= tableau.length-1;j++){
			System.out.print(tableau[j]+" ");
		}
	}
	public static void main(String[] args) {
		
		String[] tableau = new String[6];
		
		tableau[0] = "H";
		tableau[1] = "E";
		tableau[2] = "L";
		tableau[3] = "L";
		tableau[4] = "O";
		tableau[5] = "";
		
		for(int i = 0;i <= tableau.length-1;i++ ){
			System.out.print(tableau[i]+" ");
		}
		
		System.out.print("\n");
		
		inversion(tableau);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
