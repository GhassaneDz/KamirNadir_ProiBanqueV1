package domaine;

import java.util.Date;

public abstract class Compte {
	
	protected int idCompte ;
	protected double solde ; 
	protected Date dateOuverture ;
	private Client client ; 
	
	//----------   Constructeurs ----------
	
	public Compte() {
		super();
	}
	
	

	public Compte(int idCompte) {
		super();
		this.idCompte = idCompte;
	}

	public Compte(double solde, Date dateOuverture) {
		super();
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}

	public Compte(int idCompte, double solde, Date dateOuverture) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
	
	//----------   Getters & Setters ----------

	/**
	 * @return the idCompte
	 */
	public int getIdCompte() {
		return idCompte;
	}

	/**
	 * @param idCompte the idCompte to set
	 */
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * @return the dateOuverture
	 */
	public Date getDateOuverture() {
		return dateOuverture;
	}

	/**
	 * @param dateOuverture the dateOuverture to set
	 */
	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}



	@Override
	public String toString() {
		return "[idCompte=" + idCompte + ", solde=" + solde + ", dateOuverture=" + dateOuverture;
	} 	

}
