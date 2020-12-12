package correction.tn.tuniprod.magasin;
import java.util.Date;

public  class Produit implements Critere{
	// attributs de la classe:
	 /**
	  *  static : attribut commun pour toutes les instances de la classe produit 
	  *  */
	public static int nbTotal = 0;
	protected int id; // attribut : valeur du int
	protected String libelle, marque;
	protected float quantite;
	private float prix;
	private Date dateExp; // java . util . date pour reconnaitre le type Date
	
	/**
	 * Prosit 5. Q2.
	 */
	protected String saison;
	
	// Définition des constructeurs : des methodes speciales qui permettent la création d'objets+ éventuellement
	// l'initialisation des attributs (caractéristiques de l'objet)
	/**
	 * Prosit 1. Q1.
	 */
	public Produit() {
		nbTotal++;
		// constructeur par defaut : créer une instance d'un objet Produit
	}
	
	/**
	 * Prosit 1. Q2. a) et b)
	 */
	public Produit(int id, String libelle, String marque) {
		this.id = id;
		this.libelle = libelle;
		this.marque = marque;
		nbTotal++;
		// affecter les valeurs
		// this fait referance a l'instance de la classe actuelle
	} 
	
	/**
	 * Prosit 1. Q2. c)
	 */
	public Produit(int id, String libelle, String marque, float prix) {
		this.id = id;
		this.libelle = libelle;
		this.marque = marque;
		this.prix = prix;
		nbTotal++;
	}

	public Produit(int id, String libelle, String marque, float prix, Date dateExp) {
		this.id = id;
		this.libelle = libelle;
		this.marque = marque;
		this.prix = prix;
		this.dateExp = dateExp;
		nbTotal++;
	}
	
	/**
	 * Prosit 5. Q2.
	 */
	public Produit(int id,String libelle,float quantite,String saison) {
		this.id=id;
		this.libelle=libelle;
		this.quantite=quantite;
		this.saison=saison;	
		nbTotal++;
	}
	
	public String getSaison() {
		return saison;
	}

	public void setSaison(String saison) {
		this.saison = saison;
	}

	// Méthodes :
	/**
	 * Prosit 1. Q3.
	 */
	public void afficher() {
		System.out.println("id:" + id + ", libelle:" + libelle + ", marque:" + marque + ", prix:" + prix
				+ ", date expiration:" + dateExp);

	}
	public void afficherp() {
		System.out.println("\nid ="+id+"\nlibelle ="+libelle+"\nquantite ="+quantite);
	}
	
	/**
	 * @return String
	 * toString retourne une description textuelle de l'objet
	 * appelée implicitement par la méthode System.out.print
	 * Prosit 1. Q7.
	 */
	@Override
	public String toString() {
		return "Produit [id=" + id + ", libelle=" + libelle + ", marque="
				+ marque + ", quantite=" + quantite + ", prix=" + prix
				+ ", dateExp=" + dateExp + "]";
	}
	
	/**
	 * une méthode statique est une méthode de classe, ne dépend pas des attributs
	 * d'un objet, peut être appelée avec le nom de la classe
	 * Produit.comparer(p1,p2); pour comparer deux produits p1 et p2
	 * Prosit 3. Q1.a)
	 */
	public static boolean comparer(Produit p1, Produit p2) {
		if (p1.getId() == p2.getId() && p1.getLibelle() == p2.getLibelle() && p1.getPrix() == p2.getPrix()) {
			return true;
		}
		return false;
	}
	
	/**
	 * p1.comparer(p2); pour comparer p1 avec le paramètre p2
	 * Prosit 3. Q1.b)
	 */
	public boolean comparer(Produit p) {
		if (this.getId() == p.getId() && this.getLibelle() == p.getLibelle() && this.getPrix() == p.getPrix()) {
			return true;
		}
		return false;
	}

		//getters & setters
		public void setQuantite(float quantite) {
			this.quantite=quantite;
		}

		public void setDate(Date dateExp) {
			this.dateExp = dateExp;
		}

		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}

		public void setMarque(String marque) {
			this.marque = marque;

		}

		public void setPrix(float prix) {
			//à utiliser pour répondre à la question dans prosit2
			if (prix > 0)
				this.prix = prix;
			else
				System.out.println("prix negatif !");
		}

		public void setId(int id) {
			this.id = id;
		}

		public Date getDate() {
			return dateExp;
		}

		public int getId() {
			return id;
		}

		public String getLibelle() {
			return libelle;

		}
		public float getQuantite() {
			return quantite;
		}

		public String getMarque() {
			return marque;

		}

		public float getPrix() {
			return prix;
		}

		@Override
		public boolean estFrais(String saison){
			return false;
		}
}