package domaine;

import java.util.Date;

/**
 * Classe définissant un objet de type compteCourant 
 * @author Nadir Boutra && Kamir El sisi
 * @version 1.0
 *
 */

public class CompteCourant extends Compte {
	
	private double decouvert =1000;

	//----------   Constructeurs ----------
	
	/**
	 * Constrcuteur par defaut sans arguments de la classe CompteCourant
	 */
	public CompteCourant() {
		super();
	}
	
	

	/**
	 * Constructeur permettant d'initiliser l'attribut idCompe
	 * @param int
	 */
	public CompteCourant(int idCompte) {
		super(idCompte);
	}

	
    /**
     * Constructeur permettant d'initiliser les attributs solde et dateOuverture
     * @param solde
     * @param dateOuverture
     */

	public CompteCourant(double solde, Date dateOuverture) {
		super(solde, dateOuverture);
	}


/**
 * Constructeur permettant d'initiliser les attributs : idCompte, solde, dateOuverture et decouvert 
 * @param idCompte
 * @param solde
 * @param dateOuverture
 * @param decouvert
 */
	public CompteCourant(int idCompte, double solde, Date dateOuverture, double decouvert) {
		super(idCompte, solde, dateOuverture);
		this.decouvert = decouvert;
	}
	
	//----------   Getters & Setters ----------

	/**
	 * Methode permettant d'acceder a l'attribut decouvert de la classe CompteCourant
	 * @return double
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Methode permettant de modifier l'attribut decouvert de la classe Compte
	 * @param double
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}


/**
 * Methode permettant d'afficher un descriptif de l'objet définit par le biais de la classe CompteCourant
 * @return String
 */
	@Override
	public String toString() {
		return "CompteCourant " + super.toString() +", decouvert=" + decouvert + "€]";
	} 
	


}
