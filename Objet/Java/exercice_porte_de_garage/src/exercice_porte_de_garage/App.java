package exercice_porte_de_garage;


public class App {

	public static void main(String[] args) {
		
		PorteDeGarage porteParDefaut = new PorteDeGarage();
		PorteDeGarage porteBasculante = new PorteDeGarage("Gypass",true,false,25);
		PorteDeGarage porteEnroulable = new PorteDeGarage("Lakal",false,false,0);
		PorteDeGarage porteSectionnelles = new PorteDeGarage("Novoferm",false,true,0);
		PorteDeGarage portePliante = new PorteDeGarage("Aludoor",true,false,50);
		
		boolean test1 = porteBasculante.ouvrir();
		boolean test2 = porteBasculante.fermer();
		boolean test3 = porteEnroulable.verrouiller();
		boolean test4 = porteEnroulable.déverrouiller();
		boolean test5 = porteSectionnelles.ouvrirPartiellemment(50);
		boolean test6 = portePliante.fermerPartiellement(50);
		
	}

}
