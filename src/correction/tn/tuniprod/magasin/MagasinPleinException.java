package correction.tn.tuniprod.magasin;

@SuppressWarnings("serial")
public class MagasinPleinException extends Exception {
	
	MagasinPleinException () {
	}//constructeur non parametré
	MagasinPleinException (String msg) {
		super(msg);
	}//constructeur parametré
}