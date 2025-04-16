package model;

public class FormulaireSpectacle extends Formulaire {
	private int jour;
	private int mois;
	private int placeReservee;
	
	public FormulaireSpectacle(int jour, int mois, int placeReservee) {
		super(jour, mois);
		this.jour = jour;
		this.mois = mois;
		this.placeReservee = placeReservee;
	}
}
