package domaine;

import java.util.Date;



/**
 * classe représentant une agence de la banque ProxiBanque
 */
public class Agence {
	
	//les attributs
	private String idAgence;
	private Date dateCreation;
	private Employe gerant;
	
	
	//****************constructeurs **************************
	
	/**
	 * constructeur sans paramètres
	 */
	public Agence() {
		super();
	}
	
	
	/**
	 * constructeur avec paramètres
	 * @param idAgence identifiant de l'agence
	 * @param dateCreation date de création de l'agence
	 */
	public Agence(String idAgence, Date dateCreation) {
		super();
		this.idAgence = idAgence;
		this.dateCreation = dateCreation;
	}
	
	//********************Getters et Setters***************
	/**
	 * 
	 * @return identifiant de l'agence
	 */
	public String getIdAgence() {
		return idAgence;
	}
	
	/**
	 * modifier identifiant de l'agence
	 * @param idAgence identifiant de l'agence
	 */
	public void setIdAgence(String idAgence) {
		this.idAgence = idAgence;
	}
	
	/**
	 * 
	 * @return date de la création de l'agence
	 */
	public Date getDateCreation() {
		return dateCreation;
	}
	
	/**
	 * modifier  la date de création
	 * @param dateCreation date de la création de l'agence
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	/**
	 * gerant de l'agence
	 * @return gerant de l'agence
	 */
	public Employe getGerant() {
		return gerant;
	}
	
	
	/**
	 * modifier le gérant de l'agence
	 * @param gerant nouveau gérant de l'agence
	 */
	public void setGerant(Employe gerant) {
		this.gerant = gerant;
	}

	/**
	 * redéfinition de toString() de la classe Agence
	 */
	@Override
	public String toString() {
		return "Agence [idAgence=" + idAgence + ", dateCreation=" + dateCreation + "]";
	}
		

}