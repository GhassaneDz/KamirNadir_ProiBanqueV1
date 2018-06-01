package service;

import java.util.ArrayList;
import java.util.List;

import domaine.CarteBancaire;
import domaine.Client;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import domaine.Conseiller;

/**
 * Classe qui implemente les methodes de l'interface IService
 * @author Nadir Boutra && Kamir El sisi
 * @version 1.0
 *
 */
public class ServiceImpl implements Iservice {

	public static int idCl = 0;
	public static int idCom = 0;
	
	private List<Compte> comptes = new ArrayList<Compte>();
	private List<Client> clients = new ArrayList<Client>();
	private List<Conseiller> conseillers = new ArrayList<Conseiller>();
	private List<CarteBancaire> cartes = new ArrayList<CarteBancaire>();

	// ------------ methodes CRUD-----------------

	/**
	 * Methode permettant de creer un compte et l'ajouter a la liste des comptes 
	 * @param Compte
	 */
	@Override
	public void creerCompte(Compte compte) {
		compte.setIdCompte(idCom++);
		comptes.add(compte);
	}
	
	/**
	 * Methode permettant d'obtenir un compte a partir de son id 
	 * @param int 
	 * @return Compte
	 */

	@Override
	public Compte lireCompte(int idCompte) {
		
		for (Compte compte : comptes) {
			if (compte.getIdCompte() == idCompte)
				return compte;
		}
		return null;

	}
	
	/**
	 * Methode permettant de modifier un compte
	 * @param Compte
	 */

	@Override
	public void modifierCompte(Compte compte) {
		int index = 0;
		for (int i = 0; i <= comptes.size(); i++) {
			if (comptes.get(i).getIdCompte() == compte.getIdCompte()) {
				index = i;
			}
		}
		comptes.set(index, compte);
	}
/**
 * Methode permettant de supprimer un compte
 * @param Compte
 */
	
	@Override
	public void supprimerCompte(Compte compte) {
		comptes.remove(compte);
	}
	
	/**
	 * Methode permettant de lister les comptes 
	 * @return List <Compte>
	 */

	@Override
	public List<Compte> listerComptes() {

		return comptes;
	}
	
	/**
	 * Methode permettant de creer un client
	 * @param Client
	 * @return boolean
	 */

	@Override
	public void creerClient(Client client) {
		client.setIdClient(idCl++);
		clients.add(client);
	}

	/**
	 * Methode permettant de retourner un client a partir de son id 
	 * @param int 
	 * @return Client
	 */
	@Override
	public Client lireClient(int idClient) {
		
		for (Client client : clients) {
			if (client.getIdClient() == idClient)
				return client;
		}
		return null;
	}
	/**
	 * Methode permettant de modifier un client 
	 * @param Client
	 */

	@Override
	public void modifierClient(Client client) {
		
		int index = 0;
		
		for (Client c : clients) {
			if (c.getIdClient() == client.getIdClient()) {
				index = clients.indexOf(c);
			}
		}
		
		clients.set(index, client);

	}
	
	/**
	 * Methode permettant de supprimer un client 
	 * @param Client
	 */

	@Override
	public void supprimerClient(Client client) {
		clients.remove(client);

	}
	
	/**
	 * Methode permettant de lister les clients
	 * @return List <Client>
	 */

	@Override
	public List<Client> listerClients() {
		return clients;
	}
	
	/**
	 * Methode permettant de creer un objet de type CarteBancaire
	 * @param CarteBancaire
	 */

	@Override
	public void creerCarte(CarteBancaire carte) {
		cartes.add(carte);
	}
	
	/**
	 * Methode permettant de lire un objet de type CarteBancaire
	 * @return CarteBancaire
	 */

	@Override
	public CarteBancaire lireCarteBancaire() {
		return null;

	}
	
	/**
	 * Methode permettant de modifier un objet de type CarteBancaire
	 * @param CarteBancaire
	 */

	@Override
	public void modifierCarteBancaire(CarteBancaire carte) {

	}
	
	/**
	 * Methode permettant de supprimer un objet de type CarteBancaire
	 * @param CarteBancaire
	 */

	@Override
	public void supprimerCarteBancaire(CarteBancaire carte) {
		cartes.remove(carte);

	}

	/**************************************
	 * Fonctionnalités métiers
	 * @throws NbClientsGeresException 
	 ************************************************************/
	
	/**
	 * Methode permettant au conseiller de creer un client 
	 * Un conseiller ne doit pas gerer plus de dix clients
	 * @param Client 
	 * @param Conseiller 
	 * @throws NbClientsGeresException
	 */
	@Override
	public void creerMonClient(Client client, Conseiller conseiller) throws NbClientsGeresException {
		if (conseiller.getClients().size() >= 10) throw new NbClientsGeresException("vous dépassez le nombre de clients max à gérer");
		this.creerClient(client);
		this.attribuerConseiller(client, conseiller);
	}
	
	/**
	 * Methode permettant au conseiller de supprimer un client définit par son id
	 * @param int
	 * @param Conseiller
	 */
	
	@Override 
	public void supprimerMonClient(int idClient, Conseiller conseiller) {
		

		Client clientb = lireClient(idClient);

		int index = conseiller.getClients().indexOf(clientb);
		Client clientc = conseiller.getClients().get(index);


		conseiller.getClients().remove(clientc); //supprimmer client de la liste des clients du conseiller
		

		this.supprimerClient(clientb);           //supprimer client de la liste des clients de l'agence
		
		if(clientb.getComptes().size() !=0)
			for (Compte compte : clientb.getComptes()) //supprimer tous les comptes du client
				this.supprimerCompte(compte);
				
	}
	
	/**
	 * Methode permettant au conseiller de lister ses clients
	 * @param Conseiller
	 * @return List <Client>
	 */
	@Override
	public List<Client> listerMesClients(Conseiller conseiller){
		
		return conseiller.getClients();
		
	}
	
	/**
	 * Methode permettant d'associer un client et un compte
	 * @param Compte
	 * @param Client
	 */

	@Override
	public void creerCompteMonClient(Compte c, Client client) {
				
			c.setClient(client);
			client.getComptes().add(c);
			this.creerCompte(c);
	}
	
	/**
	 * Methode permettant de lister les clients par le conseiller et de renvoyer cette liste
	 * @param Conseiller
	 * @return List <Compte>
	 */
	
	public List<Compte> listeComptesMesClients(Conseiller conseiller){
		List<Compte> comptes = new ArrayList<Compte>();
		for (Client cl : conseiller.getClients()) {
			for (Compte c : cl.getComptes() ) {
				comptes.add(c);
			}
		}
		return comptes;
	}
	
	/**
	 * Methode permettant de supprimer un client a partir de son id
	 * @param Conseiller 
	 * @param int
	 */
	
	
	@Override 
	public void supprimerCompteClient(int idCompte, Conseiller conseiller) {
		Compte compte = lireCompte(idCompte);
		Client client = compte.getClient();
		this.supprimerCompte(compte);
		client.getComptes().remove(compte);
				
	}
	
	/**
	 * Methode permettant de crediter un compte
	 * @param Compte 
	 * @param double montant
	 */
	@Override
	public void crediterCompte(Compte compte, double montant) {

		double solde = compte.getSolde();
		compte.setSolde(solde + montant);

	}
	
	/**
	 * Methode permettant de débiter un compte
	 * @param Compte 
	 * @param double
	 */

	@Override
	public void debiterCompte(Compte compte, double montant) {

		double solde = compte.getSolde();
		compte.setSolde(solde - montant);

	}


	/**
	 * Methode permettant d'attribuer un conseiller pour un client
	 * @param Conseiller
	 * @param client
	 */
	@Override
	public void attribuerConseiller(Client client, Conseiller conseiller) {
		client.setConseiller(conseiller);
		conseiller.getClients().add(client);
	}

	/**
	 * Methode permettant d'attribuer une carte bancaire pour un client
	 * @param CarteBancaire 
	 * @param Client
	 */
	@Override
	public void attribuerCarte(Client client, CarteBancaire carte) {
		client.setCarte(carte);
		carte.setProprietaire(client);

	}
	
	/**
	 * Methode permettant d'eliminer un client du systeme 
	 * @param Client
	 */

	@Override
	public void eliminerClientduSysteme(Client client) {
		cartes.remove(client.getCarte());
		comptes.removeAll(client.getComptes());
		clients.remove(client);
	}

	/**
	 * Methode permettant d'effectuer un virement externe : d'un client A vers un client B 
	 * @param compteDebiteur
	 * @param compteCrediteur
	 * @param montant
	 * @throws SoldeInsuffisantException
	 */
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
	
	/**
	 * Methode permettant d'effectuer un virement externe : d'un client A vers un client B 
	 * @param compteDebiteur
	 * @param compteCrediteur
	 * @param montant
	 * @throws SoldeInsuffisantException
	 */
	
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
	
	public void verifierPlacement(Client client, Conseiller conseiller) throws VerifPlacementException {
		
		for (Compte compte : client.getComptes()) {
			if (compte instanceof CompteCourant) {
				if (compte.getSolde() >= 500000) throw new VerifPlacementException(" Ce client est elligible pour un placement");
			}
		}
		
	}

}
