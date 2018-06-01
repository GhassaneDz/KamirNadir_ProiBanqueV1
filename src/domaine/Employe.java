package domaine;

/**
 * Classe Employe représentant de employé d'une agence
 * @author Adminl
 * @version 1.0
 *
 */
public class Employe extends Personne{
	
	protected int login;
	protected int password;
	
	


	//**********constructeurs *****************************
	
	/**
	 * constructeur sans paramètre
	 */
	public Employe() {
		super();
	}
	
	
	/**
	 * constructeur avec paramètres
	 * @param nom nom
	 * @param prenom prénom
	 * @param adresse adresse 
	 * @param codePostal code Postal
	 * @param ville  ville
	 * @param login  login
	 * @param password mot de passe
	 */
	public Employe(String nom, String prenom, String adresse, String codePostal, String ville, int login, int password) {
		super(nom, prenom, adresse, codePostal, ville);
		this.login = login;
		this.password = password;
	}



	/**
	 * login de l'employé
	 * @return login login
	 */
	public int getLogin() {
		return login;
	}
	
	/**
	 * modifier le login de l'employé
	 * @param login login
	 */
	public void setLogin(int login) {
		this.login = login;
	}
	
	/**
	 * mot de passe
	 * @return password mot de passe
	 */
	public int getPassword() {
		return password;
	}
	
	/**
	 * modifier le mot de passe
	 * @param password mot de passe
	 */
	public void setPassword(int password) {
		this.password = password;
	}

	/**
	 * redéfinition de la classe toString() pour la classe Employe
	 */
	@Override
	public String toString() {
		return "nom=" + nom + ", prenom=" + prenom + "]";
	}
}
