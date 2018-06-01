package domaine;

/**
 * classe représentant carte bancaire
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
	 * constructeur sans paramètre
	 */
	public CarteBancaire() {
		super();
	}
	
	
	/**
	 * constructeur avec paramètres
	 * @param idCarte identifiant de la carte
	 */
	public CarteBancaire(int idCarte) {
		super();
		this.idCarte = idCarte;
	}


	/**
	 * constructeur avec paramètres
	 * @param idCarte identifiant de la carte
	 * @param codeCarte code de la carte
	 * @param dateExpiration date d'expiration de la carte
	 */
	public CarteBancaire(int idCarte, int codeCarte, String dateExpiration) {
		super();
		this.idCarte = idCarte;
		this.codeCarte = codeCarte;
		this.dateExpiration = dateExpiration;
	}
	
	//----------   Getters & Setters ----------

	
	/**
	 * @return the idCarte
	 */
	public int getIdCarte() {
		return idCarte;
	}
	

	/**
	 * @return the proprietaire
	 */
	public Client getProprietaire() {
		return proprietaire;
	}

	/**
	 * @param proprietaire the proprietaire to set
	 */
	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}

	/**
	 * @param idCarte the idCarte to set
	 */
	public void setIdCarte(int idCarte) {
		this.idCarte = idCarte;
	}

	/**
	 * @return the codeCarte
	 */
	public int getCodeCarte() {
		return codeCarte;
	}

	/**
	 * @param codeCarte the codeCarte to set
	 */
	public void setCodeCarte(int codeCarte) {
		this.codeCarte = codeCarte;
	}

	/**
	 * @return the dateExpiration
	 */
	public String getDateExpiration() {
		return dateExpiration;
	}

	/**
	 * @param dateExpiration the dateExpiration to set
	 */
	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	} 
	
	
	
	

}
