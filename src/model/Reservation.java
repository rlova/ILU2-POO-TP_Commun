package model;

public abstract class Reservation {
	private int jour;
	private int mois;
	
	@Override
	public String toString() {
		return "Le "+jour+"/"+mois;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}
}
