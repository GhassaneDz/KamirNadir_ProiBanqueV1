package domaine;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Adminl
 *@version 1.0
 */
public class Conseiller extends Employe{
	

	List<Client> clients = new ArrayList<Client>();
	
	//*******constructeurs ***********************
	/**
	 * constructeur sans paramètres
	 */
	public Conseiller() {
		super();
		clients = new ArrayList<Client>();
	}
	
	/**
	 * constructeur avec paramètres
	 * @param nom nom 
	 * @param prenom prénom
	 * @param adresse adresse
	 * @param codePostal code postale
	 * @param ville  ville
	 * @param login  login 
	 * @param password  mot de passe
	 */
	public Conseiller(String nom, String prenom, String adresse, String codePostal, String ville, int login, int password) {
		super(nom, prenom, adresse, codePostal, ville, login, password);
	}

	
	// ******************Getters et Setters **********************
	/**
	 * la liste des clients du conseiller
	 * @return liste des clients
	 */
	public List<Client> getClients() {
		return clients;
	}
	
	/**
	 * modifier la liste des clients
	 * @param clients du conseiller
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	/**
	 * redéfinition de toString() de la classe Conseiller
	 */
	@Override
	public String toString() {
		return "Conseiller ["+super.toString();
	}
	
	
	
	

}
