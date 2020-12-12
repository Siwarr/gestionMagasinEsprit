package correction.tn.tuniprod.magasin.employes;

public class Responsable extends Employe {
	private float prime;

	public Responsable(int id, int nbr_heures, String nom, String adresse,
			float prime) {
		super(id, nbr_heures, nom, adresse);
		this.prime = prime;
	}

	/**
	 * Prosit 4. Q3.
	 */	
	@Override
	public String toString() {
		return "Responsable [prime=" + prime + ", id=" + id + ", nbr_heures="
				+ nbr_heures + ", adresse=" + adresse + ", nom=" + nom
				+ ", calculerSalaire()=" + calculerSalaire() + "]";
	}

	/**
	 * Prosit 4. Q6.
	 */
	@Override
	public float calculerSalaire() {
		int plus = this.getNbr_heures()-160;
		float salaire = (float) (160*10+this.getPrime()+plus*10*1.2);
		return salaire;		
	}

	public float getPrime() {
		return prime;
	}

	public void setPrime(float prime) {
		this.prime = prime;
	}
}