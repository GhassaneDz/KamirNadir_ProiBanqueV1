package domaine;

/**
 * Classe définissant un objet de type VisaElectron
 * @author Nadir Boutra && Kamir El sisi
 * @version 1.0
 *
 */

public class VisaElectron extends CarteBancaire {
	
	/**
	 * Constrcuteur par defaut sans arguments de la classe VisaElectron
	 */

	public VisaElectron() {
		super();
	}
	
	/**
	 * Constructeur permettant d'initiliser l'attribut idCarte
	 * @param int
	 */

	public VisaElectron(int idCarte) {
		super(idCarte);
	}
	
	

}
