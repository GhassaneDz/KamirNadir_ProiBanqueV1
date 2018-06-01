package domaine;

public class Gerant extends Employe{
	
	private Agence agence;
	
	
	
	

	public Gerant() {
		super();
	}

	public Gerant(String nom, String prenom, String adresse, String codePostal, String ville, int login, int password) {
		super(nom, prenom, adresse, codePostal, ville, login, password);
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	@Override
	public String toString() {		
		return "Gerant ["+super.toString();
	}
	
	

}
