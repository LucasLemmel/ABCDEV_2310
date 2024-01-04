package exercices_fonctions_et_procedures1;

import java.util.Scanner;

public class App {
	
	public static double pourcentageCB(double nbTotal,double nbPaiementCB) {
		
		double pourcentageCB;
		
		pourcentageCB = nbPaiementCB / nbTotal * 100;
		
		return pourcentageCB;
	}
	public static double pourcentageCheque(double nbTotal,double nbChequesEmis) {
		
		double pourcentageChequesEmis;
		
		pourcentageChequesEmis = nbChequesEmis / nbTotal * 100;
		
		return pourcentageChequesEmis;
	}
	public static double pourcentageVirement(double nbTotal,double nbVirementAuto) {
		
		double pourcentageVirementAuto;
		
		pourcentageVirementAuto = nbVirementAuto / nbTotal * 100;
		
		return pourcentageVirementAuto; 
	}
		
	public static void main(String[] args) {

		double nbPaiementCB,nbChequesEmis,nbVirementAuto,nbTotal,pourcentageCB,pourcentageChequesEmis,pourcentageVirementAuto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le nombre de paiement par carte bleu :");
		nbPaiementCB = sc.nextDouble();
		System.out.println("Saisir le nombre de chèques émis :");
		nbChequesEmis = sc.nextDouble();
		System.out.println("Saisir le nombre de virements automatiques :");
		nbVirementAuto = sc.nextDouble();
		
		nbTotal = nbPaiementCB + nbChequesEmis + nbVirementAuto;
		
		System.out.println("Vous avez émis "+ nbTotal +" ordres de débit dont :");
		
		pourcentageCB = pourcentageCB(nbTotal,nbPaiementCB);
		pourcentageChequesEmis = pourcentageCheque(nbTotal,nbChequesEmis);
		pourcentageVirementAuto = pourcentageVirement(nbTotal,nbVirementAuto);
		
		System.out.println("\t"+pourcentageCB +"% par carte bleu \n\t"+ pourcentageChequesEmis +"% par chèque \n\t"+ pourcentageVirementAuto +"% par virement");
		
		sc.close();
	}

}
