package domaine;

/**
 * Classe permettant de symboliser les personnes physiques 
 * @author Nadir Boutra && Kamir El sisi 
 * @version 1.0
 *
 */

public abstract class Personne {


	protected String nom;
	protected String prenom;
	protected String adresse;
	protected String codePostal;
	protected String ville;

	/**
	 * Constrcuteur par defaut sans arguments de la classe Personne
	 * 
	 */
	public Personne() {
		super();
	}

	/**
	 * Constructeur permettant d'initiliser les attributs : nom, prenom, adrese, code postal et ville de la classe Personne
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param codePostal
	 * @param ville
	 */
	public Personne(String nom, String prenom, String adresse, String codePostal, String ville) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
	}



	/**
	 * Methode permettant d'acceder a l'attribut nom de la classe Personne
	 * @return String
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Methode permettant de modifier l'attribut nom de la classe Personne
	 * @param String
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Methode permettant d'acceder a l'attribut prenom de la classe Personne
	 * @return String
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Methode permettant de modifier l'attribut prenom de la classe Personne
	 * @param prenom le prenom de la personne a modifier
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Methode permettant d'acceder a l'attribut adresse de la classe Personne
	 * @return String
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Methode permettant de modifier l'attribut adresse de la classe Personne
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Methode permettant d'acceder a l'attribut code postal de la classe Personne
	 * @return String
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * Methode permettant de modifier l'attribut code postal de la classe Personne
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Methode permettant d'acceder a l'attribut ville de la classe Personne
	 * @return String
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Methode permettant de modifier l'attribut ville postal de la classe Personne
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * Methode permettant d'afficher un descriptif de l'objet définit par le biais de la classe Personne
	 * @return String  
	 */
	@Override
	public String toString() {
		return " Nom=" + nom + ", Prenom=" + prenom + ", Adresse=" + adresse + ", Ville=" + ville + ", Code Postal=" + codePostal;
	}
		


}
