package correction.tn.tuniprod.magasin;
import correction.tn.tuniprod.magasin.employes.Employe;

public class Magasin {
	int id;
	String adresse;
	String nom;
	final int CAPACITE_P = 2; //constante
	protected Produit[] produits;
	public int nbProduits;// nombre actuel de produits
	final int CAPACITE_E = 20; // constante
	
	/**
	 * Prosit 4. Q2.
	 */	
	Employe[] employes = new Employe[CAPACITE_E];

	int nbEmp = 0;// nombre actuel de produits
	
	// constructeurs :	
	public Magasin() {
		// La création d'un magasin créé le stock de produits, c'est à dire le tableau
		produits = new Produit[CAPACITE_P];
		//Employe[] employers = new Employe[CAPACITE_E];
		
	}
	
	public Magasin(int id, String adresse) {
		// La création d'un magasin créé le stock de produits, c'est à dire le tableau
		produits = new Produit[CAPACITE_P];
		this.id = id;
		this.adresse = adresse;	
	}
	
	/**
	 * Prosit 4. Q1.
	 */		
	public Magasin(int id, String nom, String adresse) {
		// La création d'un magasin créé le stock de produits, c'est à dire le tableau
		produits = new Produit[CAPACITE_P];
		Employe[] employers = new Employe[CAPACITE_E];
		this.id = id;
		this.adresse = adresse;	
		this.nom=nom;
	}
	
	/**
	 * Prosit 2. 
	 */	
	public boolean ajouterProduit(Produit p) {
		if (nbProduits < CAPACITE_P) {
			produits[nbProduits] = p;
			nbProduits++;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String prod="[";
		int i;
		for (i=0; i<nbProduits-1;i++) {
			prod+=produits[i]+",";
		}
		prod+=produits[i]+"]";
		return "Magasin [id=" + id + ", adresse=" + adresse + ", produits="
				+ prod;
	}
	
	/**
	 * Prosit 3. Q2.
	 */	
	public boolean chercherProduit(Produit p) {
		int i=0;
		while (i<nbProduits-1 && !p.comparer(produits[i])) {
		i++;
		}
		if (p.comparer(produits[i])) return true;
		return false;
	}
	
	/**
	 * Prosit 3. Q3.
	 */
	public boolean ajouterNouveauProduit(Produit p) {
		if (nbProduits < CAPACITE_P && !chercherProduit(p)) {
			produits[nbProduits] = p;
			nbProduits++;
			return true;
		}
		return false;
	}
	
	/**
	 * Prosit 3. Q4.
	 */
	public boolean supprimer(Produit p) {
		if (chercherProduit(p)) {
			int i=0;
			while(!p.comparer(produits[i])) {
				i++;
			}
			for (int k = i; k < nbProduits - 1; k++) {
				produits[k] = produits[k + 1];
			}
			nbProduits--;
			return true;
		}
		return false;		
	}
	
	/**
	 * Prosit 3. Q5.
	 */
	public static Magasin superieur(Magasin m1, Magasin m2) {
		if (m1.nbProduits > m2.nbProduits)
			return m1;
		if (m1.nbProduits < m2.nbProduits)
			return m2;
		return null; // si null c'est à dire deux magasins sont égaux
	}
	
	/**
	 * Prosit 4. Q2.
	 */		
	public boolean ajouterEmploye(Employe e) {
		if (nbEmp < CAPACITE_E) {
			employes[nbEmp] = e;
			nbEmp++;
			return true;
		} 
		return false;
	}
	
	/**
	 * Prosit 4. Q3.
	 */	
	public String afficherEmployes() {
		String emp="[";
		int i;
		for (i=0; i<nbEmp-1;i++) {
			emp+=employes[i]+",";
		}
		emp+=employes[i]+"]";
		return "Magasin [id=" + id + ", adresse=" + adresse + ", employés="
				+ emp;
	}
	
	/**
	 * Prosit 5. Q4.
	 */	
	public float calculStock() {
		float stock=0;
		for (int i=0; i<nbProduits; i++) {
			if (produits[i] instanceof ProduitFruit) {
				stock+=produits[i].getQuantite();
			}
		}
		return stock;
	}
	
	/**
	 * Prosit 6. Q3, 4 et 5
	 */	
	public void ajouterProduitException(Produit p) {
			produits[nbProduits] = p;
			nbProduits++;
			/*
			 * L'ajout de 3 prosuits génère une exception de type
			 * ArrayIndexOutOfBoundsException
			 * On peut délimiter l'instruction d'ajout par un bloc try-catch
			 * produits[nbProduits] cette instruction peut lancer une exception la solution serait
			 * 
			 * try{ produits[nbProduits] = p;}
			 * catch (ArrayIndexOutOfBoundsException e) 
			 * {System.out.println("Erreur");}
			 * 
			 */
	}
	
	/**
	 * Prosit 6. Q6
	 */	
	public void ajouterProduitExceptionQuestion6(Produit p) throws MagasinPleinException{
		if (nbProduits==CAPACITE_P) {
			throw new MagasinPleinException();
		}
		/*
		 * Méthode numéro 2 : utiliser le constrcuteur avec message d'erreur
		 * 
		 * if (nbProduits==CAPACITE_P) {
			throw new MagasinPleinException("Vous avez dépassé la capacité du stock");
		}
		 */	
		produits[nbProduits] = p;
		nbProduits++;
	}
	
	/**
	 * Prosit 6. Q6
	 * @throws PrixNegatifException 
	 */	
	public void ajouterProduitExceptionQuestion6et7(Produit p) throws MagasinPleinException, PrixNegatifException{
		if (nbProduits==CAPACITE_P) {
			throw new MagasinPleinException("Vous avez dépassé la capacité du stock");
		}
		if (p.getPrix()<0) {
			throw new PrixNegatifException("Merci de vérifier le prix du produit ",p);
		}
		produits[nbProduits] = p;
		nbProduits++;
	}
}