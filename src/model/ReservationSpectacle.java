package model;

public class ReservationSpectacle extends Reservation {
	private int jour;
	private int mois;
	private int placeReservee;
	private int chaiseReservee;
	
	public ReservationSpectacle(int jour, int mois, int jour2, int mois2, int placeReservee, int chaiseReservee) {
		super(jour, mois);
		jour = jour2;
		mois = mois2;
		this.placeReservee = placeReservee;
		this.chaiseReservee = chaiseReservee;
	}	
}
