package model;

public class Restaurant {
	
	private static class Table extends EntiteReservable<Formulaire>{
		private CalendrierAnnuel calendrierDeuxiemeService = new CalendrierAnnuel();
		private int nbChaises;

		private Table(int nbChaises) {
			this.nbChaises = nbChaises;
		}
		
		private boolean compatible(FormulaireRestaurant formulaire) {
			int jour = formulaire.getJour();
			int mois = formulaire.getMois();
			int numService = formulaire.getNumService();
			int nbPersonnes = formulaire.getNombrePersonnes();
			if (nbPersonnes == nbChaises || nbPersonnes == nbChaises-1) {
				if (calendrierDeuxiemeService.estLibre(jour, mois)) {
					return true;
				}
			}
			return false;
		}
		
		private Reservation reserver(FormulaireRestaurant formulaire) {
			Reservation reservation = null;
			int jour = formulaire.getJour();
			int mois = formulaire.getMois();
			int numService = formulaire.getNumService();
			boolean reservationPosssible = false;
			if (numService ==numService) {
				reservationPosssible = calendrierDeuxiemeService.estLibre(jour, mois);
			}
			if (reservationPosssible) {
				reservation = new ReservationRestaurant(jour, mois, numService, getNumeroIdentifiant());
			}
			return reservation;
		}
	}
}
