package correction.tn.tuniprod.magasin.employes;

public class Caissier extends Employe {
	private int numeroDeCaisse ;
	
	/**
	 * Prosit 4. Q2.
	 */	
	// La cr�ation d'un caissier revient � la cr�ation d'un employ� de type caissier
	// Le constructeur de Caissier doit prendre en charge la construction de l'objet dans sa totalit�
	// Le constructeur d'une classe fille doit appeler le constrcuteur de sa classe m�re comme premi�re instruction
	public Caissier(int id, int nbr_heures, String nom, String adresse,
			int numeroDeCaisse) {
		// Appel du constructeur de Employe pour initialiser les attributs h�rit�s de celle ci
		super(id, nbr_heures, nom, adresse); 
		this.numeroDeCaisse = numeroDeCaisse;
	}

	/**
	 * Prosit 4. Q3.
	 */	
	@Override
	public String toString() {
		return "Caissier [numeroDeCaisse=" + numeroDeCaisse + ", id=" + id
				+ ", nbr_heures=" + nbr_heures + ", adresse=" + adresse
				+ ", nom=" + nom + ", calculerSalaire()=" + calculerSalaire()
				+ "]";
	}

	/**
	 * Prosit 4. Q6.
	 */
	@Override
	public float calculerSalaire() {
		int plus = this.getNbr_heures()-180;
		float salaire = (float) (180*5+plus*5*1.15);
		return salaire;
	}
}