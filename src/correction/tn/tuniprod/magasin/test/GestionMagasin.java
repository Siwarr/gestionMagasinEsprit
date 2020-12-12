package correction.tn.tuniprod.magasin.test;

import java.util.Date;






import correction.tn.tuniprod.magasin.Magasin;
import correction.tn.tuniprod.magasin.MagasinPleinException;
import correction.tn.tuniprod.magasin.PrixNegatifException;
import correction.tn.tuniprod.magasin.Produit;
import correction.tn.tuniprod.magasin.ProduitFruit;
import correction.tn.tuniprod.magasin.ProduitLegume;
import correction.tn.tuniprod.magasin.employes.Caissier;
import correction.tn.tuniprod.magasin.employes.Responsable;
import correction.tn.tuniprod.magasin.employes.Vendeur;

public class GestionMagasin {

	public static void main(String[] args) {
		/**
		 * Prosit 1. Q1.
		 */
		Produit p1; // declaration d'un produit p1
		p1 = new Produit();// creation du produit p1
		// Produit p1=new Produit(); // fusionner ces 2 lignes
		/**
		 * Prosit 1. Q2.
		 */
		Produit p2 = new Produit(1021, "Lait", "Delice");
		Produit p3 = new Produit(2510, "Yaourt", "Vitalait");
		Produit p4 = new Produit(3250, "Tomate", "Sicam", 1.2f);
		
		/**
		 * Prosit 1. Q3.
		 */
		p1.afficher();
		p2.afficher();
		p3.afficher();
		p4.afficher();
		
		/**
		 * Prosit 1. Q4.
		 */
		p2.setPrix(0.7f);
		p2.afficher();
		
		/**
		 * Prosit 1. Q5.
		 */
		p1.setId(1010);
		p1.setLibelle("Cake");
		p1.setMarque("Moulin d'or");
		p1.setPrix(0.5f);
		p2.setPrix(1.2f);
		p3.setPrix(0.35f);
		
		/**
		 * Prosit 1. Q6.
		 */
		p1.afficher();
		p2.afficher();
		p3.afficher();
		p4.afficher();
		
		/**
		 * Prosit 1. Q7.
		 */
		System.out.println(p1); // println appelle toString si elle est redéfinie, sinon toString de la calsse Object
		System.out.println(p2);
		
		/**
		 * Prosit 1. Q8.
		 * @Deprecated
		public Date(int year, int month, int date)
		Le type Date est obsolète, remplacé par Calendar.set(year + 1900, month, date) ou GregorianCalendar(year + 1900, month, date).
		Créé un objet de type Date et initialise les valeurs de de year, month, et date (jour).
		@param
		year - annee moins 1900.
		month - mois entre 0-11.
		date - le jour entre 1-31.
		 */	
		p1.setDate(new Date(2019-1900,2-1,20));
		p2.setDate(new Date(2019-190,05-1,25));
		p3.setDate(new Date(2019-1900,12-1,03));
		p4.setDate(new Date(2020-1900,2-1,20));
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		/**
		 * Prosit 2. 
		 */	
		Magasin m = new Magasin(9090, "Tunis");
		m.ajouterProduit(p1);
		p3.setPrix(-2.3f);
		m.ajouterProduit(p2);
		m.ajouterProduit(p3);
		m.ajouterProduit(p4);
		System.out.println(m);	
		Produit p5 = new Produit(3250, "Tomate", "Sicam", 1.2f);
		Produit p6 = new Produit(1021, "lo", "Delice", 1.2f);
		Produit p7 = new Produit(1021, "Lait", "Delice", 1.2f);
		System.out.println("chercher "+p5+":"+m.chercherProduit(p7));
		System.out.println("chercher "+p6+":"+m.chercherProduit(p6));
		System.out.println("chercher "+p7+":"+m.chercherProduit(p5));
		
		/**
		 * Prosit 3. Q3.
		 */		
		System.out.println("ajouter "+p5+":"+m.ajouterNouveauProduit(p5));
		System.out.println("ajouter "+p6+":"+m.ajouterNouveauProduit(p6));
		System.out.println(m);
		
		/**
		 * Prosit 3. Q4.
		 */	
		Produit p8 = new Produit(3750, "Confiture", "Sicam", 2.2f);
		System.out.println("supprimer "+p8+":"+m.supprimer(p8));
		System.out.println("supprimer "+p6+":"+m.supprimer(p6));
		System.out.println("supprimer "+p6+":"+m.supprimer(p7));
		System.out.println(m);
		
		/**
		 * Prosit 4. Q1.
		 */			
		Magasin m1 = new Magasin(1, " Carrefour", "Centre-Ville ");		
		Magasin m2 = new Magasin(  2, "Monoprix", "Menzah 6");
		

		/**
		 * Prosit 4. Q2.
		 */	

		Caissier c11 = new Caissier(11, 48, "Ahmed", "Tunis",11);
		Caissier c12 = new Caissier(12, 48, "Ali", "Tunis",12);
		Vendeur v11 = new Vendeur(11, 48,  "Ahmed", "Ariana", 0.5f);
		Responsable r11 = new Responsable(11, 40, "Salem", "Ariana", 200);
		Caissier c21 = new Caissier(21, 48, "Salma", "Menzeh", 21);		
		Vendeur v21 = new Vendeur(21, 48,  "Ali", "Ariana", 0.3f);
		Vendeur v22 = new Vendeur(22, 48,  "Sami", "Bizerte", 0.6f);
		Vendeur v23 = new Vendeur(23, 48,  "Aya", "Sousse", 0.4f);	
		Responsable r21 = new Responsable(21, 40,  "sam", "ariana", 300);
		m1.ajouterEmploye(c11);
		m1.ajouterEmploye(c12);
		m1.ajouterEmploye(v11);
		m1.ajouterEmploye(r11);
		m2.ajouterEmploye(c21);
		m2.ajouterEmploye(v21);
		m2.ajouterEmploye(v22);
		m2.ajouterEmploye(v23);
		m2.ajouterEmploye(r21);
		
		/**
		 * Grace au polymorphisme, on peut insérer des objets de types différents dans un tableau de type classe
		 * générale Employe
		 * Prosit 4. Q3.
		 */	
		System.out.println(m1.afficherEmployes());
		System.out.println(m2.afficherEmployes());
		
		/**
		 * Prosit 4. Q4.
		 */	
		m1.ajouterProduit(p1);
		m2.ajouterProduit(p2);
		m2.ajouterProduit(p3);
		
		/**
		 * Prosit 4. Q5.
		 */	
		System.out.println(m1+m1.afficherEmployes());
		System.out.println(m2+m2.afficherEmployes());
		
		/**
		 * Prosit 5. Q2.
		 */
		Produit p51 = new ProduitFruit(1254,"Fraise",2.3f,"Mars");
		Produit p52 = new ProduitFruit(1224,"Pastèque",50,"Juin");
		Produit p53 = new ProduitFruit(7896,"Mandarine",25.6F,"Décembre");
		Produit p54 = new ProduitLegume(8521,"Artichaud",14F,"Janvier");
		
		/**
		 * Prosit 5. Q3.
		 */
		Magasin m3 = new Magasin(3, "Magasin Général", "Nabeul");
		m3.ajouterProduit(p51);
		m3.ajouterProduit(p52);
		m3.ajouterProduit(p53);
		m3.ajouterProduit(p54);
		// polymorphisme, ajouterProduit prend un objet de type Produit, 
		// un parmaètre de type ProduitFruit/ProduitLegume peut être encapsulé dans un objet de type Produit
		
		/**
		 * Prosit 5. Q4.
		 */
		
		System.out.println("stock de Magasin 3:"+m3.calculStock());
		
		/**
		 * Prosit 5. Q5. b)
		 */
		System.out.println(p54.estFrais("Septembre"));
		System.out.println(p54.estFrais("Février"));
		
		/**
		 * Prosit 6. Q6
		 */	
		Magasin m4 = new Magasin(4, "Aziza", "Bizerte");
		try {
			m4.ajouterProduitExceptionQuestion6(p1);
			m4.ajouterProduitExceptionQuestion6(p2);
			m4.ajouterProduitExceptionQuestion6(p3);
			
		} catch (MagasinPleinException e) {
			System.out.println("Vous avez dépassé la capacité du stock");
			/*
			 *  où 
			 *  System.out.println(e.getMessage());
			 *  getMessage retourne le message envoyé par le constructeur
			 */
		}
		
		System.out.println("Magasin 4:"+m4+"nombre de produits: "+m4.nbProduits);
		
		/**
		 * Prosit 6. Q7
		 */
		Magasin m5 = new Magasin(4, "Aziza", "Bizerte");
		try {
			m5.ajouterProduitExceptionQuestion6et7(p1);
			m5.ajouterProduitExceptionQuestion6et7(new Produit(3250, "Tomate", "Sicam", -1.2f));		
		} catch (MagasinPleinException e) {			
			System.out.println(e.getMessage());	
		} catch (PrixNegatifException e) {
			System.out.println(e.getMessage()+": "+e.getP());
		}
		finally {
			System.out.println("Magasin 5:"+m5);
		}				
	}
}