package exercice_etat_dune_bouteille;

public class App {

	public static void main(String[] args) {
		
		
		bouteille bouteilleParDefaut = new bouteille();
		bouteille bouteilleBadoit = new bouteille("badoit",1.5,0.75,false);
		
			//boolean test1 = bouteilleParDefaut.ouvrir();
			boolean test2 = bouteilleBadoit.ouvrir();
			//boolean test3 = bouteilleParDefaut.fermer();
			//boolean test4 = bouteilleBadoit.fermer();
				
			//boolean test5 = bouteilleParDefaut.remplirTout();
			//boolean test6 = bouteilleBadoit.remplirTout();
			//boolean test7 = bouteilleParDefaut.viderTout();
			boolean test8 = bouteilleBadoit.viderTout();
			boolean test9 = bouteilleParDefaut.remplir(1.5);
			boolean test10 = bouteilleBadoit.remplir(1.5);
			boolean test11 = bouteilleParDefaut.vider(0.5);
			boolean test12 = bouteilleBadoit.vider(0.75);
		

	}

}
