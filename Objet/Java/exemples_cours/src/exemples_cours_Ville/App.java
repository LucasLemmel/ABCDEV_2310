package exemples_cours_Ville;

public class App {

	public static void main(String[] args) {
		
		Ville ville = new Ville();
		System.out.println("Le nombre d'instances de la classe Ville est : "+ ville.nbInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : "+ ville.getnbInstances());
		Ville ville1 = new Ville("Marseille", 870321, "France");
		System.out.println("Le nombre d'instances de la classe Ville est : "+ ville1.nbInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : "+ ville1.getnbInstances());
		Ville ville2 = new Ville("Mulhouse", 108038,"France");
		System.out.println("Le nombre d'instances de la classe Ville est : "+ ville2.nbInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : "+ ville2.getnbInstances());
		System.out.println("\n ville = "+ ville.getNom()+" ville de "+ ville.getNbHabitants()
							+" habitant(s) se situant en "+ ville.getNomPays());
		
		System.out.println(" ville1 = "+ ville1.getNom()+" ville de "+ ville1.getNbHabitants()
							+" habitant(s) se situant en "+ ville1.getNomPays());
		
		System.out.println(" ville2 = "+ ville2.getNom()+" ville de "+ ville2.getNbHabitants()
							+" habitant(s) se situant en "+ ville2.getNomPays()+"\n\n");
		
		/*
		 Nous allons interchanger les villes 1 et 2
		 tout ça par l'intermédiaire d'un autre objet ville
		 */
		
		Ville temp = new Ville();
		temp = ville1;
		ville1 = ville2;
		ville2 = temp;
		
		System.out.println(" ville1 = "+ ville1.getNom()+" ville de "+ ville1.getNbHabitants()
							+" habitant(s) se situant en "+ ville1.getNomPays());

		System.out.println(" ville2 = "+ ville2.getNom()+" ville de "+ ville2.getNbHabitants()
							+" habitant(s) se situant en "+ ville2.getNomPays()+"\n\n");
		
		/*
		 Nous allons maintenant interchanger leur noms
		 par le biais de leurs mutateurs
		 */
		
		ville1.setNom("Honk Kong");
		ville2.setNom("New York");
		
		System.out.println(" ville1 = "+ ville1.getNom()+" ville de "+ ville1.getNbHabitants()
							+" habitant(s) se situant en "+ ville1.getNomPays());

		System.out.println(" ville2 = "+ ville2.getNom()+" ville de "+ ville2.getNbHabitants()
							+" habitant(s) se situant en "+ ville2.getNomPays()+"\n\n");
		
		System.out.println("\n\n"+ ville1.decrisToi());
		System.out.println(ville.decrisToi());
		System.out.println(ville2.decrisToi()+"\n\n");
		System.out.println(ville1.comparer(ville2));
		;
		
		
	}

}
