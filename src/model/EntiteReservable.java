package model;

public abstract class EntiteReservable <F extends Formulaire>{
	private CalendrierAnnuel calendrier = new CalendrierAnnuel();
	private int numeroIdentifiant;
	
	public int getNumeroIdentifiant() {
		return numeroIdentifiant;
	}
	public void setNumeroIdentifiant(int numeroIdentifiant) {
		this.numeroIdentifiant = numeroIdentifiant;
	}
	
	public boolean estLibre(F formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return calendrier.estLibre(jour, mois);
	}
	
	public abstract boolean compatible(F formulaire);
	
	public abstract Reservation reserver(F formulaire);
}
