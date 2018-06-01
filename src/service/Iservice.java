package service;

import java.util.List;

import domaine.CarteBancaire;
import domaine.Client;
import domaine.Compte;
import domaine.Conseiller;



public interface Iservice {
	
	// ---------  CRUD Compte ---------
	
	public void creerCompte (Compte compte) ;
	public Compte lireCompte (int idCompte) ;
	public void modifierCompte (Compte compte) ;
	public void supprimerCompte (Compte compte);
	public List <Compte> listerComptes () ;
	
	// ---------  CRUD Client ---------
	
	public boolean creerClient (Client client) ;
	public Client lireClient (int idClient) ;
	public void modifierClient (Client client) ;
	public void supprimerClient (Client client) ;
	public List<Client> listerClients () ;

	
	// ---------  CRUD CarteBancaire ---------
	
	public void creerCarte (CarteBancaire carte);
	public CarteBancaire lireCarteBancaire () ;
	public void modifierCarteBancaire (CarteBancaire carte) ;
	public void supprimerCarteBancaire (CarteBancaire carte) ;
		
	// -------------------Fonctionnalités métiers ------------------//
	public void creerMonClient(Client client, Conseiller conseiller) throws NbClientsGeresException;
	public void supprimerMonClient(int idClient, Conseiller conseiller);
	public List<Client> listerMesClients(Conseiller conseiller);
	public void creerCompteMonClient(Compte c, Client client);
	public void supprimerCompteClient(int id, Conseiller conseiller);
	public List<Compte> listeComptesMesClients(Conseiller conseiller);
	
	
	
	public void crediterCompte (Compte compte, double montant) ;
	public void debiterCompte (Compte compte, double montant) ;
	public void eliminerClientduSysteme(Client client) ;
	public void attribuerConseiller(Client client, Conseiller conseiller) ;
	public void attribuerCarte(Client client, CarteBancaire carte) ;
	public void effectuerVirement(Compte compteDebiteur, Compte compteCrediteur, double montant)throws SoldeInsuffisantException;
	public void effectuerVirement(Compte compteDebiteur, double montant) throws SoldeInsuffisantException;
	
	
	
	
	
	
	
	
	
	



}
