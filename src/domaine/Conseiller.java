package domaine;

import java.util.ArrayList;
import java.util.List;

public class Conseiller extends Employe{
	


	List<Client> clients = new ArrayList<Client>(); ;
	
	public Conseiller() {
		super();
		clients = new ArrayList<Client>();
	}
	

	public Conseiller(String nom, String prenom, String adresse, String codePostal, String ville, int login, int password) {
		super(nom, prenom, adresse, codePostal, ville, login, password);
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}


	@Override
	public String toString() {
		return "Conseiller ["+super.toString();
	}
	
	
	
	

}
