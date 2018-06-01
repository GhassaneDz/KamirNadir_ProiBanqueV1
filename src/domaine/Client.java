package domaine;

import java.util.ArrayList;
import java.util.List;

public class Client extends Personne {

	private int idClient ;
	private String profession;
	private String typeClient;
	private Conseiller conseiller;
	List<Compte> comptes = new ArrayList <Compte>();
	private CarteBancaire carte;

	//--------  Constructeurs  ------------------------------
	
	public Client() {
		super();
	}
	
	
	public Client(String nom, String prenom, String adresse, String codePostal, String ville, String profession, String typeClient) {
		super(nom, prenom, adresse, codePostal, ville);
		this.typeClient = typeClient;
		this.profession = profession;
	}

	public Client(int idClient, String nom, String prenom, String adresse, String codePostal, String ville, String profession, String typeClient) {
		super(nom, prenom, adresse, codePostal, ville);
		this.typeClient = typeClient;
		this.idClient = idClient;
		this.profession = profession;
	}
	
	//-------- Getters & setters  ------------------------------
	
	/**
	 * @return the idClient
	 */
	public int getIdClient() {
		return idClient;
	}

	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getProfession() {
		return profession;
	}


	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	/**
	 * @return the typeClient
	 */
	public String getTypeClient() {
		return typeClient;
	}


	/**
	 * @param typeClient the typeClient to set
	 */
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}

	/**
	 * @return the conseiller
	 */
	public Conseiller getConseiller() {
		return conseiller;
	}

	/**
	 * @param conseiller the conseiller to set
	 */
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	/**
	 * @return the comptes
	 */
	public List<Compte> getComptes() {
		return comptes;
	}

	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	/**
	 * @return the carte
	 */
	public CarteBancaire getCarte() {
		return carte;
	}

	/**
	 * @param carte the carte to set
	 */
	public void setCarte(CarteBancaire carte) {
		this.carte = carte;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ","+ super.toString() +", typeClient=" + typeClient+"]";
	}



	
	
	
	
	
	


	
	

}
