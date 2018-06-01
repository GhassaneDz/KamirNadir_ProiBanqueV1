package domaine;

import java.util.Date;

/**
 * Classe permettant de symboliser les comptes bancaires gérés par l'application ProxiBanque
 * @author Nadir Boutra && Kamir El sisi 
 * @version 1.0
 *
 */

public abstract class Compte {
	
	protected int idCompte ;
	protected double solde ; 
	protected Date dateOuverture ;
	private Client client ; 
	
	//----------   Constructeurs ----------
	/**
	 * Constrcuteur par defaut sans arguments de la classe Compte
	 */
	public Compte() {
		super();
	}
	
	/**
	 * Constructeur permettant d'initiliser l'attribut idCompte
	 * @param idCompte
	 */

	public Compte(int idCompte) {
		super();
		this.idCompte = idCompte;
	}

	/**
	 * Constructeur permettant d'initiliser les attributs solde et dateOuverture
	 * @param solde
	 * @param dateOuverture
	 */
	public Compte(double solde, Date dateOuverture) {
		super();
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
	
/**
 * Constructeur permettant d'initiliser les attributs : idCompte, solde et dateOuverture
 * @param idCompte
 * @param solde
 * @param dateOuverture
 */

	public Compte(int idCompte, double solde, Date dateOuverture) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
	
	//----------   Getters & Setters ----------

	/**
	 * Methode permettant d'acceder a l'attribut idCompte de la classe Compte
	 * @return int
	 */
	public int getIdCompte() {
		return idCompte;
	}

	/**
	 * Methode permettant de modifier l'attribut idCompte de la classe Compte
	 * @param int
	 */
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	/**
	 * Methode permettant d'acceder a l'attribut solde de la classe Compte
	 * @return double
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Methode permettant de modifier l'attribut idCompte de la classe Compte
	 * @param double
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Methode permettant d'acceder a l'attribut dateOuverture de la classe Compte
	 * @return Date
	 */
	public Date getDateOuverture() {
		return dateOuverture;
	}

	/**
	 * Methode permettant de modifier l'attribut dateOuverture de la classe Compte
	 * @param Date
	 */
	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	/**
	 * Methode permettant d'acceder a l'attribut client de la classe Compte
	 * @return Client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Methode permettant de modifier l'attribut client de la classe Compte
	 * @param Client 
	 */
	public void setClient(Client client) {
		this.client = client;
	}


	/**
	 * Methode permettant d'afficher un descriptif de l'objet définit par le biais de la classe Compte
	 * @return String 
	 */

	@Override
	public String toString() {
		return "[idCompte=" + idCompte + ", solde=" + solde + ", dateOuverture=" + dateOuverture;
	} 	

}
