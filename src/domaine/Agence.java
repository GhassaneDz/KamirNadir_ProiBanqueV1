package domaine;

import java.util.Date;

public class Agence {
	
	
	private String idAgence;
	private Date dateCreation;
	private Employe gerant;
	
	
	public String getIdAgence() {
		return idAgence;
	}
	public void setIdAgence(String idAgence) {
		this.idAgence = idAgence;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Employe getGerant() {
		return gerant;
	}
	public void setGerant(Employe gerant) {
		this.gerant = gerant;
	}
	
	
	
	
	

}
