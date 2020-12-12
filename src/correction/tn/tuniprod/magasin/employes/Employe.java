package correction.tn.tuniprod.magasin.employes;

public abstract class Employe {
	protected int id;
	protected int nbr_heures;
	protected String adresse;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNbr_heures() {
		return nbr_heures;
	}

	public void setNbr_heures(int nbr_heures) {
		this.nbr_heures = nbr_heures;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	protected String nom;
	public Employe(int id, int nbr_heures, String nom, String adresse) {
		this.id = id;
		this.nbr_heures = nbr_heures;
		this.nom = nom;
		this.adresse = adresse;
	}
	
	/**
	 * Prosit 4. Q3.
	 */	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", nbr_heures=" + nbr_heures
				+ ", adresse=" + adresse + ", nom=" + nom
				+ ", calculerSalaire()=" + calculerSalaire() + "]";
	}

	/**
	 * Prosit 4. Q6.
	 */
	public abstract float calculerSalaire() ;

}