package correction.tn.tuniprod.magasin;

public class PrixNegatifException extends Exception {
	Produit p;
	PrixNegatifException(Produit p) {
		this.p=p;
	}
	public Produit getP() {
		return p;
	}
	public void setP(Produit p) {
		this.p = p;
	}
}