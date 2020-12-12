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
		/* Une m�thode parmi plusieurs, 
		 * ici on a utilis� le type �num�r� Mois qui associe � chaque mois un type Mois 
		 * ayant deux attributs String : le mois, et int : le num�ro de mois
		 * Pour plus de d�tail voir le turoriel suivant :
		 * https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/22162-decouvrez-les-enumerations
		 * 
		 * Vous pouvez faire des tests par rapport aux valeurs de types String
		 */
	}
}