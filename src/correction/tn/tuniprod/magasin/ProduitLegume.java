package correction.tn.tuniprod.magasin;

public class ProduitLegume extends Produit implements Critere {
	public ProduitLegume(int id,String libelle,float quantite,String saison) {
		super( id,libelle,quantite,saison);
	}
	
	/**
	 * Prosit 5. Q5. b)
	 */
	@Override
	public boolean estFrais(String saison) {
		Mois moisSaison = Mois.valueOf(saison.toUpperCase());
		Mois moisProduit = Mois.valueOf(this.getSaison().toUpperCase());
		return (moisSaison.getNumero()<=moisProduit.getNumero()+1);
		/* Une méthode parmi plusieurs, 
		 * ici on a utilisé le type énuméré Mois qui associe à chaque mois un type Mois 
		 * ayant deux attributs String : le mois, et int : le numéro de mois
		 * Pour plus de détail voir le turoriel suivant :
		 * https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/22162-decouvrez-les-enumerations
		 * 
		 * Vous pouvez faire des tests par rapport aux valeurs de types String
		 */
	}
}