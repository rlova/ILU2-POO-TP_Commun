package model;

public class Formulaire {
	private int jour;
	private int mois; 
	private int identificationEntitee;
	
	public Formulaire(int jour, int mois) {
		super();
		this.jour = jour;
		this.mois = mois;
	}
	
	public int getIdentificationEntitee() {
		return identificationEntitee;
	}
	
	public void setIdentificationEntitee(int identificationEntitee) {
		this.identificationEntitee = identificationEntitee;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
}
