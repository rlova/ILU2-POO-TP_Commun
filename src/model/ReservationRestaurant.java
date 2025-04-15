package model;

public class ReservationRestaurant extends Reservation {
	private int jour;
	private int mois;
	private int numTable;
	private int numService;
	
	public ReservationRestaurant(int jour, int mois, int numTable, int numService) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.numTable = numTable;
		this.numService = numService;
	}

	@Override
	public String toString() {
//		StringBuilder chaine = new StringBuilder();
//		chaine.append(toString());
//		chaine.append(" : table n°"+numTable+" pour le ");
//		if (numService==1) {
//			chaine.append(" premier");
//		} else if (numService==2) {
//			chaine.append(" deuxieme");
//		}
//		chaine.append(" service");
//		return chaine.toString();
		String chaine = super.toString();
		chaine += " : table n°"+numTable+" pour le ";
		if (numService==1) {
			chaine += "premier";
		} else if (numService==2) {
			chaine += "deuxieme";
		}
		return chaine+" service";
	}
}
