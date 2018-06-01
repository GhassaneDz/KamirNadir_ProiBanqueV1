package domaine;

import java.util.Date;

/**
 * Classe définissant un objet de type compteEpargne
 * @author Nadir Boutra && Kamir El sisi
 * @version 1.0
 *
 */

public class CompteEpargne extends Compte {
	
	private double taux = 3 ;
	
	//----------   Constructeurs ----------
	/**
	 * Constrcuteur par defaut sans arguments de la classe CompteEpargne
	 */
	public CompteEpargne() {
		super();
	}
	
	/**
	 * Constructeur permettant d'initiliser l'attribut idCompe
	 * @param int
	 */

	public CompteEpargne(int idCompte) {
		super(idCompte);
	}

	
	/**
     * Constructeur permettant d'initiliser les attributs solde et dateOuverture
     * @param solde
     * @param dateOuverture
     */

	public CompteEpargne(double solde, Date dateOuverture) {
		super(solde, dateOuverture);
	}

    /**
     * Constructeur permettant d'initiliser les attributs : idCompte, solde, dateOuverture et taux
     * @param idCompte
     * @param solde
     * @param dateOuverture
     * @param taux
     */

	public CompteEpargne(int idCompte, double solde, Date dateOuverture, double taux) {
		super(idCompte, solde, dateOuverture);
		this.taux = taux;
	}
	
	//----------   Getters & Setters ----------

	/**
	 * Methode permettant d'acceder a l'attribut taux de la classe CompteEpargne
	 * @return double
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * Methode permettant de modifier l'attribut taux de la classe CompteEpargne
	 * @param double
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/**
	 * Methode permettant d'afficher un descriptif de l'objet définit par le biais de la classe CompteEpargne
	 * @return String
	 */

	@Override
	public String toString() {

		return "CompteEpargne " + super.toString() + ", taux=" + taux + "%]";
	} 
	
	
	

}
