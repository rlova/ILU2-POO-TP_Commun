package model;

public class ReservationRestaurant extends Reservation {
	private int jour;
	private int mois;
	private int numTable;
	private int numService;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour,mois);
		this.jour = jour;
		this.mois = mois;
		this.numTable = numTable;
		this.numService = numService;
	}

	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append(super.toString());
		chaine.append("\nTable "+numTable+" pour le ");
		if (numService==1) {
			chaine.append("premier");
		} else {
			chaine.append("deuxieme");
		}
		chaine.append(" service.");
		return chaine.toString();
	}
}
