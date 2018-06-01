package service;

import java.util.ArrayList;
import java.util.List;

import domaine.CarteBancaire;
import domaine.Client;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import domaine.Conseiller;

public class ServiceImpl implements Iservice {

	public static int idClient = 0;
	public static int idCompte = 0;
	
	private List<Compte> comptes = new ArrayList<Compte>();
	private List<Client> clients = new ArrayList<Client>();
	private List<Conseiller> conseillers = new ArrayList<Conseiller>();
	private List<CarteBancaire> cartes = new ArrayList<CarteBancaire>();

	// ------------ methodes CRUD-----------------

	@Override
	public void creerCompte(Compte compte) {
		compte.setIdCompte(idCompte++);
		comptes.add(compte);
	}

	@Override
	public Compte lireCompte(int idCompte) {

		return comptes.get(idCompte);

	}

	@Override
	public void modifierCompte(Compte compte) {
		int index = compte.getIdCompte();
		comptes.set(index, compte);
	}

	@Override
	public void supprimerCompte(Compte compte) {

		comptes.remove(compte);
	}

	@Override
	public List<Compte> listerComptes() {

		return comptes;
	}

	@Override
	public boolean creerClient(Client client) {
		client.setIdClient(idClient++);
		return clients.add(client);
	}

	@Override
	public Client lireClient(int idClient) {
		return clients.get(idClient);
	}

	@Override
	public void modifierClient(Client client) {
		clients.set(client.getIdClient(), client);

	}

	@Override
	public void supprimerClient(Client client) {
		clients.remove(client);

	}

	@Override
	public List<Client> listerClients() {
		return clients;
	}

	@Override
	public void creerCarte(CarteBancaire carte) {
		cartes.add(carte);
	}

	@Override
	public CarteBancaire lireCarteBancaire() {
		return null;

	}

	@Override
	public void modifierCarteBancaire(CarteBancaire carte) {

	}

	@Override
	public void supprimerCarteBancaire(CarteBancaire carte) {
		cartes.remove(carte);

	}

	/**************************************
	 * Fonctionnalités métiers
	 * @throws NbClientsGeresException 
	 ************************************************************/
	@Override
	public void creerMonClient(Client client, Conseiller conseiller) throws NbClientsGeresException {
		if (conseiller.getClients().size() >= 10) throw new NbClientsGeresException("vous dépassez le nombre de clients max à gérer");
		this.creerClient(client);
		this.attribuerConseiller(client, conseiller);
	}
	
	
	
	@Override 
	public void supprimerMonClient(int id, Conseiller conseiller) {
		Client client = clients.get(id);
		
		conseiller.getClients().remove(id); //supprimmer client de la liste des clients du conseiller
		this.supprimerClient(client);           //supprimer client de la liste des clients de l'agence
		
		if(client.getComptes().size() !=0)
			for (Compte compte : client.getComptes()) //supprimer tous les comptes du client
				this.supprimerCompte(compte);
				
	}
	
	
	@Override
	public List<Client> listerMesClients(Conseiller conseiller){
		
		return conseiller.getClients();
		
	}
	
	

	@Override
	public void creerCompteMonClient(Compte c, Client client) {
		
			c.setClient(client);
			client.getComptes().add(c);
			this.creerCompte(c);
	}
	
	
	
	public List<Compte> listeComptesMesClients(Conseiller conseiller){
		List<Compte> comptes = new ArrayList<Compte>();
		for (Client cl : conseiller.getClients()) {
			for (Compte c : cl.getComptes() ) {
				comptes.add(c);
			}
		}
		return comptes;
	}
	
	
	@Override 
	public void supprimerCompteClient(int id, Conseiller conseiller) {
		Compte compte = comptes.get(id);
		Client client = compte.getClient();
		this.supprimerCompte(compte);
		client.getComptes().remove(compte);
				
	}
	
	
	@Override
	public void crediterCompte(Compte compte, double montant) {

		double solde = compte.getSolde();
		compte.setSolde(solde + montant);

	}

	@Override
	public void debiterCompte(Compte compte, double montant) {

		double solde = compte.getSolde();
		compte.setSolde(solde - montant);

	}


	@Override
	public void attribuerConseiller(Client client, Conseiller conseiller) {
		client.setConseiller(conseiller);
		conseiller.getClients().add(client);
	}

	@Override
	public void attribuerCarte(Client client, CarteBancaire carte) {
		client.setCarte(carte);
		carte.setProprietaire(client);

	}

	@Override
	public void eliminerClientduSysteme(Client client) {
		cartes.remove(client.getCarte());
		comptes.removeAll(client.getComptes());
		clients.remove(client);
	}

	@Override
	public void effectuerVirement(Compte compteDebiteur, Compte compteCrediteur, double montant) throws SoldeInsuffisantException{
		double soldeD = compteDebiteur.getSolde();
		double soldeC = compteCrediteur.getSolde();

		if (compteDebiteur instanceof CompteEpargne) {

			if (montant <= soldeD) {

				compteDebiteur.setSolde(soldeD - montant);
				compteCrediteur.setSolde(soldeC + montant);
			}
			else 
				throw new SoldeInsuffisantException("Le montant que vous souhaitez retirer est superieur au solde") ; 
		} else {
			
			double decouvert = ((CompteCourant)compteDebiteur).getDecouvert();
			
			if (montant <= soldeD + decouvert) {
				compteDebiteur.setSolde(soldeD - montant);
				compteCrediteur.setSolde(soldeC + montant);
			}
			else 
				throw new SoldeInsuffisantException("Le montant que vous souhaitez retirer est superieur au solde") ; 
			
		}

	}
	
	@Override
	public void effectuerVirement(Compte compteDebiteur, double montant) throws SoldeInsuffisantException {
		
		double soldeD = compteDebiteur.getSolde();
		if (compteDebiteur instanceof CompteEpargne) {
			if (montant <= soldeD) {
                
				compteDebiteur.setSolde(soldeD - montant);
			} else  {
				
				throw new SoldeInsuffisantException("Le montant que vous souhaitez retirer est superieur au solde") ; 
			}
		} else {
			
			double decouvert = ((CompteCourant)compteDebiteur).getDecouvert();
			
			if (montant <= (soldeD + decouvert)) {
				compteDebiteur.setSolde(soldeD - montant);
			} else {
				
				throw new SoldeInsuffisantException("Le montant que vous souhaitez retirer est superieur au solde") ; 
			}
			
		}

	}

}
