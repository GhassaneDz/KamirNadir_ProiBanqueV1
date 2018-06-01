package domaine;

/**
 * Classe permettant de symboliser les objets de type CarteBancaire
 * @author Adminl
 * @version 1.0
 *
 */

public abstract class CarteBancaire {
	
	private int idCarte ; 
	private int codeCarte ; 
	private String dateExpiration ;
	private Client proprietaire ; 
	
	//----------   Constructeurs ----------
	/**
	 * Constrcuteur par defaut sans arguments de la classe Personne
	 */
	
	public CarteBancaire() {
		super();
	}
	
	/**
	 * Constructeur permettant d'initiliser l'attribut idCarte
	 * @param int
	 */

	public CarteBancaire(int idCarte) {
		super();
		this.idCarte = idCarte;
	}


	/**
	 * Constructeur permettant d'initiliser les attributs : idCarte, codeCarte et dateExpiration 
	 * @param idCarte
	 * @param codeCarte
	 * @param dateExpiration
	 */

	public CarteBancaire(int idCarte, int codeCarte, String dateExpiration) {
		super();
		this.idCarte = idCarte;
		this.codeCarte = codeCarte;
		this.dateExpiration = dateExpiration;
	}
	
	//----------   Getters & Setters ----------

	
	/**
	 * Methode permettant d'acceder a l'attribut idCarte de la classe CarteBancaire
	 * @return int
	 */
	public int getIdCarte() {
		return idCarte;
	}

	/**
	 *  Methode permettant d'acceder a l'attribut client de la classe CarteBancaire
	 * @return Client
	 */
	public Client getProprietaire() {
		return proprietaire;
	}

	/**
	 *  Methode permettant de modifier l'attribut proprietaire de la classe CarteBancaire
	 * @param Client
	 */
	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}

	/**
	 *  Methode permettant de modifier l'attribut idCarte de la classe CarteBancaire
	 * @param int
	 */
	public void setIdCarte(int idCarte) {
		this.idCarte = idCarte;
	}

	/**
	 *  Methode permettant d'acceder a l'attribut codeCarte de la classe CarteBancaire
	 * @return int
	 */
	public int getCodeCarte() {
		return codeCarte;
	}

	/**
	 *  Methode permettant de modifier l'attribut codeCarte de la classe CarteBancaire
	 * @param int
	 */
	public void setCodeCarte(int codeCarte) {
		this.codeCarte = codeCarte;
	}

	/**
	 *  Methode permettant d'acceder a l'attribut dateExpiration de la classe CarteBancaire
	 * @return String
	 */
	public String getDateExpiration() {
		return dateExpiration;
	}

	/**
	 *  Methode permettant de modifier l'attribut dateExpiration de la classe CarteBancaire
	 * @param String
	 */
	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	} 
	
	
	
	

}
