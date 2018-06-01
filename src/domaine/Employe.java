package domaine;

/**
 * Classe Employe repr�sentant de employ� d'une agence
 * @author Adminl
 * @version 1.0
 *
 */
public class Employe extends Personne{
	
	protected int login;
	protected int password;
	
	


	//**********constructeurs *****************************
	
	/**
	 * constructeur sans param�tre
	 */
	public Employe() {
		super();
	}
	
	
	/**
	 * constructeur avec param�tres
	 * @param nom nom
	 * @param prenom pr�nom
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
	 * login de l'employ�
	 * @return login login
	 */
	public int getLogin() {
		return login;
	}
	
	/**
	 * modifier le login de l'employ�
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
	 * red�finition de la classe toString() pour la classe Employe
	 */
	@Override
	public String toString() {
		return "nom=" + nom + ", prenom=" + prenom + "]";
	}
}
