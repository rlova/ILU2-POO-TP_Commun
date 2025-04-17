package model;

public class CentraleReservation <E extends EntiteReservable<F>, F extends Formulaire>{
	public E[] entites;
	private int nbEntites = 0;
	
	public CentraleReservation(E[] entites) {
		super();
		this.entites = entites;
	}
	
	public int ajouterEntite(E entite) {
		entites[nbEntites] = entite;
		nbEntites++;
		return nbEntites;
	}
	
	public int[] donnerPossibilites(F formulaire) {
		int[] possibilites = new int[nbEntites];
		// formulaire correspondant au type d'entit�
		// si une entit� est dispo selon crit�res du formulaire => valeur stock�e dans le tableau = num entit�
		// si entit� non dispo => valeur = 0
		int j = 0;
		for (int i=0; i<nbEntites; i++) {
			if (entites[i].estLibre(formulaire) && entites[i].compatible(formulaire)) {
				possibilites[j] = i;
				j++;
			} else {
				possibilites[j] = 0;
				j++;
			}
		}
		return possibilites;
	}
	
	public Reservation reserver(int numEntite, F formulaire) {
		EntiteReservable<F> entite = entites[numEntite];
		formulaire.setIdentificationEntitee(entite.getNumeroIdentifiant());
		return entite.reserver(formulaire);
	}
}
