package correction.tn.tuniprod.magasin.employes;

public class Vendeur extends Employe {
	private float tauxDeVente;

	public Vendeur(int id, int nbr_heures, String nom, String adresse,
			float tauxDeVente) {
		super(id, nbr_heures, nom, adresse);
		this.tauxDeVente = tauxDeVente;
	}
	
	/**
	 * Prosit 4. Q3.
	 */	
	
	
	@Override
	public String toString() {
		return "Vendeur [tauxDeVente=" + tauxDeVente + ", id=" + id
				+ ", nbr_heures=" + nbr_heures + ", adresse=" + adresse
				+ ", nom=" + nom + ", calculerSalaire()=" + calculerSalaire()
				+ "]";
	}

	/**
	 * Prosit 4. Q6.
	 */
	@Override
	public float calculerSalaire() {
		return 450*this.getTauxDeVente();
	}

	public float getTauxDeVente() {
		return tauxDeVente;
	}

	public void setTauxDeVente(float tauxDeVente) {
		this.tauxDeVente = tauxDeVente;
	}
}