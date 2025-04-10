package model;

public class ReservationRestaurant extends Reservation {
	private int jour;
	private int mois;
	private int numTable;
	private int numService;
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le "+jour+"/"+mois+" : table n°"+numTable+" pour le ");
		if (numService==1) {
			chaine.append("première");
		} else if (numService==2) {
			chaine.append("deuxième");
		}
	}
}
