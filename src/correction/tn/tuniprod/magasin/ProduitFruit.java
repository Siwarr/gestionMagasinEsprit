package correction.tn.tuniprod.magasin;

public class ProduitFruit extends Produit implements Critere{
	public ProduitFruit(int id,String libelle,float quantite,String saison) {
		super( id,libelle,quantite,saison);
	}

	/**
	 * Prosit 5. Q5. a)
	 */
	@Override
	public boolean estFrais(String saison) {
		return(saison.toUpperCase().equals(this.getSaison().toUpperCase()));
	}

}