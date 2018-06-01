package domaine;

/**
 * Classe permettant de symboliser les personnes physiques 
 * @author Nadir Boutra 
 * @version 1.0
 *
 */

public abstract class Personne {


	protected String nom;
	protected String prenom;
	protected String adresse;
	protected String codePostal;
	protected String ville;

	public Personne() {
		super();
	}

	public Personne(String nom, String prenom, String adresse, String codePostal, String ville) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
	}



	/**
	 * @return le nom de la personne
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom le nom de la personne a modifier
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return le prenom de la personne
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom le prenom de la personne a modifier
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return " Nom=" + nom + ", Prenom=" + prenom + ", Adresse=" + adresse + ", Ville=" + ville + ", Code Postal=" + codePostal;
	}
		


}
