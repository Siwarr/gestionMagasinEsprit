package correction.tn.tuniprod.magasin;

public enum Mois {
	JANVIER (1),
	FÉVRIER (2),
	MARS (3),
	AVRIL (4),
	MAI (5),
	JUIN (6),
	JUILLET (7),
	AOÛT (8),
	SEPTEMBRE (9),
	OCTOBRE (10),
	NOVEMBRE (11),
	DECEMBRE (12);
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	private int numero;
		 
	Mois(int numero){
		this.numero = numero;
	}
}