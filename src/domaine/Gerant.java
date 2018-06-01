package domaine;

/**
 * classe représentant le gérant de l'agence bancaire
 * @author Adminl
 *
 */
public class Gerant extends Employe{
	
	private Agence agence;
	
	
	
	//***********************constructeurs******************************
	/**
	 * constructeur sans paramètre
	 * 
	 */
	public Gerant() {
		super();
	}

	/**
	 * constructeur avec paramètres hérite de la classe Personne
	 * @param nom  nom
	 * @param prenom prenom
	 * @param adresse adresse
	 * @param codePostal code postale
	 * @param ville ville
	 * @param login   login
	 * @param password   mot de passe
	 */
	public Gerant(String nom, String prenom, String adresse, String codePostal, String ville, int login, int password) {
		super(nom, prenom, adresse, codePostal, ville, login, password);
	}

	//*********************Getters et Setters *****************
	
	/**
	 * agence du gérant
	 * @return agence du gérant
	 */
	public Agence getAgence() {
		return agence;
	}

	/**
	 * modification de l'attribut agence
	 * @param agence nouvelle agence
	 */
	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	/**
	 * redéfinition de toString() pourla classe Personne
	 */
	@Override
	public String toString() {		
		return "Gerant ["+super.toString();
	}
	
	

}
