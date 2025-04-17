package model;

public abstract class Reservation {
	private int jour;
	private int mois;
	
	protected Reservation(int jour, int mois) {
		super();
		this.jour = jour;
		this.mois = mois;
	}

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
