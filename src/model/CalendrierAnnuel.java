package model;

public class CalendrierAnnuel {
	private Mois[] calendrier = new Mois[12];
	private Mois mois;
	
	public CalendrierAnnuel() {
		calendrier[0] = new Mois("Janvier",31);
		calendrier[1] = new Mois("Février",28);
		calendrier[2] = new Mois("Mars",31);
		calendrier[3] = new Mois("Avril",30); 
		calendrier[4] = new Mois("Mai", 31);
		calendrier[5] = new Mois("Juin", 30);
		calendrier[6] = new Mois("Juillet", 31);
		calendrier[7] = new Mois("Août", 31);
		calendrier[8] = new Mois("Septembre", 30);
		calendrier[9] = new Mois("Octobre", 31);
		calendrier[10] = new Mois("Novembre", 30);
		calendrier[11] = new Mois("Décembre", 31);
	}
	
	public boolean estLibre(int jours, int mois) {
		Mois moisDuCalendrier = calendrier[mois-1];
		return moisDuCalendrier.estLibre(jours);
	}
	
	public boolean reserver(int jours, int mois) {
		boolean estLibre = estLibre(jours, mois);
		if (estLibre) {
			Mois moisDuCalendrier = calendrier[mois-1];
			moisDuCalendrier.reserver(jours);
		}
		return estLibre;
	}

	// classe interne
	private static class Mois {
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
		}

		private boolean estLibre(int jour) {
			return !jours[jour-1];
		}
		
		private void reserver(int jour) throws IllegalStateException{
			if (jours[jour-1]) {
				jours[jour-1] = true;
				throw new IllegalStateException("Il n'y a aucune réservation ce jour-ci");
			} else {
				jours[jour-1] = true;
			}
		}
	}
}
