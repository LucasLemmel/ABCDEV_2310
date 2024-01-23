package exercice_porte_de_garage;

public class PorteDeGarage {
	
	private String marque;
	private boolean estOuverte;
	private boolean estVerrouiller;
	private int degretsOuverture;
	private final int degretsMax;
	private final int degretsMin;
	
	public PorteDeGarage() {
		
		marque = "inconnu";
		estOuverte = true;
		estVerrouiller = false;
		degretsOuverture = 0;
		degretsMax = 100;
		degretsMin = 0;
		
		
	}
	
	public PorteDeGarage(String _marque, Boolean _estOverte, Boolean _estVerrouiller, int _degretsOuverture){
		
		this.marque = _marque;
		this.estOuverte = _estOverte;
		this.estVerrouiller = _estVerrouiller;
		this.degretsOuverture =  _degretsOuverture;
		this.degretsMax = 100;
		this.degretsMin = 0;
	}
public boolean ouvrir() {
		
		if(!estOuverte & !estVerrouiller) {
			
			this.estOuverte = true;
			this.degretsOuverture = this.degretsMax;
			return true;
			
		}
		else {
			
			return false;
			
		}
		
	}
	public boolean fermer() {
		
		if(estOuverte & !estVerrouiller) {
			
			this.estOuverte = false;
			this.degretsOuverture = this.degretsMin;
			return true;
			
		}
		else {
			
			return false;
			
		}
	}
public boolean verrouiller() {
		
		if(!estOuverte& !estVerrouiller) {
			
			this.estVerrouiller = true;
			return true;
			
		}
		else {
			
			return false;
			
		}
		
	}
	public boolean déverrouiller() {
		
		if(!estOuverte & this.estVerrouiller) {
			
			this.estVerrouiller = false;
			return true;
			
		}
		else {
			
			return false;
			
		}
	}
	public boolean ouvrirPartiellemment(int degretsAOuvrir) {
		
		if(!estVerrouiller){
			
			if(this.degretsOuverture + degretsAOuvrir <= this.degretsMax){
				
				this.degretsOuverture = this.degretsOuverture + degretsAOuvrir;
				
				if(!estOuverte){
					
					this.estOuverte = true;
				}
				return true;
			}
			else{
				
				return false;
			}
		}
		else{
			
			return false;
		}
	}
	public boolean fermerPartiellement(int degretsAFermer) {
		
		if(!estVerrouiller){
			
			if(this.degretsOuverture - degretsAFermer >= degretsMin){
				
				this.degretsOuverture = this.degretsOuverture - degretsAFermer;
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
}
