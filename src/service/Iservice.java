package service;

import java.util.List;

import domaine.CarteBancaire;
import domaine.Client;
import domaine.Compte;
import domaine.Conseiller;

/**
 * Interface permettant de définir les methodes relatives a la creation, lecture, suppression et modification des objets de l'application 
 * ProxiBanque.
 * L'interface Iservice contient egalement les methodes qui définissent les taches métier
 * @author Nadir Boutra && Kamir El sisi
 * @version 1.0
 *
 */

public interface Iservice {
	
	// ---------  CRUD Compte ---------
	/**
	 * Methode permettant de creer un compte et l'ajouter a la liste des comptes 
	 * @param Compte
	 */
	public void creerCompte (Compte compte) ;
	/**
	 * Methode permettant d'obtenir un compte a partir de son id 
	 * @param int 
	 */
	public Compte lireCompte (int idCompte) ;
	/**
	 * Methode permettant de modifier un compte
	 * @param Compte
	 */
	public void modifierCompte (Compte compte) ;
	/**
	 * Methode permettant de supprimer un compte
	 * @param Compte
	 */
	public void supprimerCompte (Compte compte);
	/**
	 * Methode permettant de lister les comptes 
	 * @return List <Compte>
	 */
	public List <Compte> listerComptes () ;
	
	// ---------  CRUD Client ---------
	
	/**
	 * Methode permettant de creer un client
	 * @param Client
	 * @return boolean
	 */
	public boolean creerClient (Client client) ;
	/**
	 * Methode permettant de retourner un client a partir de son id 
	 * @param int 
	 * @return Client
	 */
	public Client lireClient (int idClient) ;
	/**
	 * Methode permettant de modifier un client 
	 * @param Client
	 */
	public void modifierClient (Client client) ;
	/**
	 * Methode permettant de supprimer un client 
	 * @param Client
	 */
	public void supprimerClient (Client client) ;
	/**
	 * Methode permettant de lister les clients
	 * @return List <Client>
	 */
	public List<Client> listerClients () ;

	
	// ---------  CRUD CarteBancaire ---------
	
	/**
	 * Methode permettant de creer un objet de type CarteBancaire
	 * @param CarteBancaire
	 */
	public void creerCarte (CarteBancaire carte);
	/**
	 * Methode permettant de lire un objet de type CarteBancaire
	 * @return CarteBancaire
	 */
	public CarteBancaire lireCarteBancaire () ;
	/**
	 * Methode permettant de modifier un objet de type CarteBancaire
	 * @param CarteBancaire
	 */
	public void modifierCarteBancaire (CarteBancaire carte) ;
	/**
	 * Methode permettant de supprimer un objet de type CarteBancaire
	 * @param CarteBancaire
	 */
	public void supprimerCarteBancaire (CarteBancaire carte) ;
		
	// -------------------Fonctionnalités métiers ------------------//
	/**
	 * Methode permettant de creer un client 
	 * Un conseiller ne doit pas gerer plus de dix clients
	 * @param Client 
	 * @param Conseiller 
	 * @throws NbClientsGeresException
	 */
	public void creerMonClient(Client client, Conseiller conseiller) throws NbClientsGeresException;
	/**
	 * Methode permettant au conseiller de supprimer un client définit par son id
	 * @param int
	 * @param Conseiller
	 */
	public void supprimerMonClient(int idClient, Conseiller conseiller);
	/**
	 * Methode permettant au conseiller de lister ses clients
	 * @param Conseiller
	 * @return List <Client>
	 */
	
	public List<Client> listerMesClients(Conseiller conseiller);
	
	/**
	 * Methode permettant d'associer un client et un compte
	 * @param Compte
	 * @param Client
	 */
	public void creerCompteMonClient(Compte c, Client client);
	/**
	 * Methode permettant de supprimer un client a partir de son id
	 * @param Conseiller 
	 * @param int
	 */
	public void supprimerCompteClient(int id, Conseiller conseiller);
	/**
	 * Methode permettant de lister les clients par le conseiller et de renvoyer cette liste
	 * @param Conseiller
	 * @return List <Compte>
	 */
	public List<Compte> listeComptesMesClients(Conseiller conseiller);
	
	
	/**
	 * Methode permettant de crediter un compte
	 * @param Compte 
	 * @param double montant
	 */
	public void crediterCompte (Compte compte, double montant) ;
	/**
	 * Methode permettant de débiter un compte
	 * @param Compte 
	 * @param double
	 */
	public void debiterCompte (Compte compte, double montant) ;

	/**
	 * Methode permettant d'eliminer un client du systeme 
	 * @param Client
	 */
	public void eliminerClientduSysteme(Client client) ;

	/**
	 * Methode permettant d'attribuer un conseiller pour un client
	 * @param Conseiller
	 * @param client
	 */
	public void attribuerConseiller(Client client, Conseiller conseiller) ;
	/**
	 * Methode permettant d'attribuer une carte bancaire pour un client
	 * @param CarteBancaire 
	 * @param Client
	 */
	public void attribuerCarte(Client client, CarteBancaire carte) ;
	/**
	 * Methode permettant d'effectuer un virement externe : d'un client A vers un client B 
	 * @param compteDebiteur
	 * @param compteCrediteur
	 * @param montant
	 * @throws SoldeInsuffisantException
	 */
	public void effectuerVirement(Compte compteDebiteur, Compte compteCrediteur, double montant)throws SoldeInsuffisantException;
	/**
	 * Methode permettant d'effectuer un virement interne : d'un compte courant vers un compte epargne ou inversement
	 * @param compteDebiteur
	 * @param montant
	 * @throws SoldeInsuffisantException
	 */
	public void effectuerVirement(Compte compteDebiteur, double montant) throws SoldeInsuffisantException;
	
	
	
	
	
	
	
	
	
	



}
