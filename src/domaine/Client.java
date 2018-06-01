package domaine;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe définissant un objet de type client de la banque 
 * @author Nadir Boutra && Kamir El sisi
 * @version 1.0 
 *
 */

public class Client extends Personne {

	private int idClient ;
	private String profession;
	private String typeClient;
	private Conseiller conseiller;
	List<Compte> comptes = new ArrayList <Compte>();
	private CarteBancaire carte;

	//--------  Constructeurs  ------------------------------
	/**
	 * Constructeur par défaut sans argument permettant de creer un objet de type Client vide 
	 */
	public Client() {
		super();
	}
	
	/**
	 * Constrcuteur permettant de creer un objet de type Client et d'initialiser ses attributs : nom, prenom, 
	 * adresse, code postal, ville, profession, type client
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param codePostal
	 * @param ville
	 * @param profession
	 * @param typeClient
	 */
	public Client(String nom, String prenom, String adresse, String codePostal, String ville, String profession, String typeClient) {
		super(nom, prenom, adresse, codePostal, ville);
		this.typeClient = typeClient;
		this.profession = profession;
	}
	
	/**
	 * Constrcuteur Constrcuteur permettant de creer un objet de type Client et d'initialiser ses attributs : id client, nom, prenom
	 * adresse, code postal, ville, profession, type client
	 * @param idClient
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param codePostal
	 * @param ville
	 * @param profession
	 * @param typeClient
	 */

	public Client(int idClient, String nom, String prenom, String adresse, String codePostal, String ville, String profession, String typeClient) {
		super(nom, prenom, adresse, codePostal, ville);
		this.typeClient = typeClient;
		this.idClient = idClient;
		this.profession = profession;
	}
	
	//-------- Getters & setters  ------------------------------
	
	/**
	 * Methode permettant d'acceder a l'attribut id client de la classe Client
	 * @return int
	 */
	public int getIdClient() {
		return idClient;
	}

	/**
	 * Methode permettant de modifier l'attribut id client de la classe Client
	 * @param int
	 */
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	
	/**
	 * Methode permettant d'acceder a l'attribut profession de la classe Client
	 * @return String
	 */

	public String getProfession() {
		return profession;
	}

/**
 * Methode permettant de modifier l'attribut profession de la classe Client
 * @param String 
 */
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	/**
	 * Methode permettant d'acceder a l'attribut type client de la classe Client
	 * @return String
	 */
	public String getTypeClient() {
		return typeClient;
	}


	/**
	 * Methode permettant de modifier l'attribut type client de la classe Client
	 * @param tString
	 */
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}

	/**
	 * 
	 *  Methode permettant d'acceder a l'attribut conseiller de la classe Client
	 * @return Conseiller
	 */
	public Conseiller getConseiller() {
		return conseiller;
	}

	/**
	 * Methode permettant de modifier l'attribut conseiller de la classe Client
	 * @param Conseiller
	 */
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	/**
	 *  Methode permettant d'acceder a l'attribut comptes de la classe Client
	 * @return List <Compte>
	 */
	public List<Compte> getComptes() {
		return comptes;
	}

	/**
	 * Methode permettant de modifier l'attribut comptes de la classe Client
	 * @param List <Compte>
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	/**Methode permettant d'acceder a l'attribut carteBancaire de la classe Client
	 * @return CarteBancaire
	 */
	public CarteBancaire getCarte() {
		return carte;
	}

	/**
	 * Methode permettant de modifier l'attribut cartebancaire de la classe Client
	 * @param carteBancairet
	 */
	public void setCarte(CarteBancaire carte) {
		this.carte = carte;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/**
	 * Methode permettant d'afficher un descriptif de l'objet définit par le biais de la classe Client
	 * @return String
	 */
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ","+ super.toString() +", typeClient=" + typeClient+"]";
	}



	
	
	
	
	
	


	
	

}
