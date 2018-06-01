
package presentation;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import domaine.CarteBancaire;
import domaine.Client;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import domaine.Conseiller;
import domaine.VisaElectron;
import domaine.VisaPremier;
import service.Iservice;
import service.NbClientsGeresException;
import service.ServiceImpl;
import service.SoldeInsuffisantException;
import service.VerifPlacementException;


/**
 * 
 * Classe permettant de lancer l'utilisation de l'application ProxiBanque
 * 
 * @author Nadir Boutra && Kamir El Sisi
 * @version 1.0
 *  
 * 
 *
 */


public class Lanceur {
	
	
	static Iservice service = new ServiceImpl() ;
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Constructeur par défaut sans arguments de la classe Lanceur
	 */
	public Lanceur () {
		super() ;
	}
	
	/**
	 * Methode principale d'execution de l'application ProxiBanque
	 * @param args
	 */
	public static void main(String[] args) {


		
		
		
		List <Client> clients = new ArrayList<Client>() ;
		List <Compte> comptes = new ArrayList<Compte>() ;
		List <CarteBancaire> cartes = new ArrayList<CarteBancaire>();
		
		//Instanciation d'un conseiller
		//(String nom, String prenom, String adresse, String codePostal, String ville, int login, int password)
		Conseiller conseiller = new Conseiller ("Galile", "Michel", "2 rue Gambetta", "75014", "paris", 1234, 0000) ; 

		

		//Instanciation de clients		
		Client clientF = new Client("David", "Messir", "22 rue de la pompe ", "75016", "Paris", "PDG", "particulier") ; 
		Client clientEnt = new Client("MTS", "","Lourcine", "75014","Paris","", "entreprise") ; 
		Client clientSimp = new Client("boutrin", "nadir", "91 trur", "91120", "Palaiseau","", "particulier") ;
		
		try {
			service.creerMonClient(clientF, conseiller);
			service.creerMonClient(clientEnt, conseiller);
			service.creerMonClient(clientSimp, conseiller);
		} catch (NbClientsGeresException e) {
			System.out.println(e.getMessage());
		}
		
	
		Compte compteCourantf = new CompteCourant(600000, new Date()) ; 
		Compte compteCourant2 = new CompteCourant(15000, new Date() );
		Compte compteCourant3 = new CompteCourant(1500, new Date()) ; 
		
		service.creerCompteMonClient(compteCourantf, clientF);
		service.creerCompteMonClient(compteCourant2, clientEnt);
		service.creerCompteMonClient(compteCourant3, clientSimp);
		
		
		MenuPrincipal();		
		int choix = sc.nextInt();
		System.out.println();
		System.out.println();
		
		while(choix !=0) {
			
			if (choix == 1) {
				
				MenuGestionPersonne();
				int sousChoixPers = sc.nextInt();
				System.out.println();
				System.out.println();
				switch (sousChoixPers) {
					case 1:
						creationClient(conseiller);  //creer un client
					break;
					case 2:
						modificationClient(conseiller); //modifier un client
					break;
					case 3: 
						suppressionClient(conseiller); //supprimer un client
					break;
					case 4: 
						listerClient(conseiller);   //lister un client
					break;
					case 5: 
						listerClients(conseiller);   //lister un client
					break;
					case 0: // revenir au menu principal
						MenuPrincipal();
						choix = sc.nextInt();
						System.out.println();
						System.out.println();
					break;
					default:
						System.out.print("ERREUR DE SAISIE, VEUILLEZ RECOMMENCER ? :");
						System.out.println();
				}
			} else if (choix == 2) {
				MenuGestionCompte();
				int sousChoixComp = sc.nextInt();
				System.out.println();
				System.out.println();
				switch (sousChoixComp) {
				case 1:
					creationCompte(conseiller);    //creer un compte et l'associer à un client
					break;
				case 2:  
					modificationCompte(conseiller);   //modifier un compte 
					break;
				case 3:  
					effectuerVirement(conseiller);   //Effectuer un virement 
					break;
				case 4:  
					effectuerPlacement(conseiller);   //Effectuer un virement 
					break;
				case 5: 
					suppressionCompte(conseiller);    //supprimer un compte
					break;
				case 6: 
					listerComptes(conseiller); //lister comptes
					break;
				case 0: //revenir au menu principal
					MenuPrincipal();		
					choix = sc.nextInt();
					break;
				default:
					System.out.print("ERREUR DE SAISIE, VEUILLEZ RECOMMENCER ? :");
					System.out.println();
				}
			}else {
				System.out.print("ERREUR DE SAISIE, VEUILLEZ RECOMMENCER ? :");
				choix = sc.nextInt();
			}
		}
		
		System.out.println("*************AU REVOIR *******************");
		sc.close();
		
	}
	
	/**
	 *  Methode permettant d'afficher le menu d'entrée de l'application Proxibanque
	 */
	
	public static void MenuPrincipal() {
		
		System.out.println("###############################################################");
		System.out.println("#                          MENU                               #");
		System.out.println("###############################################################");
		System.out.println("#                                                             #");
		System.out.println("#                      1. GERER DES CLIENTS                   #");
		System.out.println("#                      2. GERER DES COMPTES                   #");
		System.out.println("#                      0. QUITTER                             #");
		System.out.println("#                                                             #");
		System.out.println("###############################################################");
		
		System.out.print("  VOTRE SELECTION <0 - 2> ? :");
		
	}
	
	/**
	 * Methode permettant d'afficher le sous-menu de gestion des comptes
	 */
	
	public static void MenuGestionCompte() {
		
		System.out.println("###############################################################");
		System.out.println("#                          GERER UN COMPTE                    #");
		System.out.println("###############################################################");
		System.out.println("#                                                             #");
		System.out.println("#                      1. CREER UN COMPTE                     #");
		System.out.println("#                      2. MODIFIER UN COMPTE                  #");
		System.out.println("#                      3. EFFECTUER VIREMENT                  #");
		System.out.println("#                      4. EFFECTUER PLACEMENT (CLIENT FORTUNE)#");
		System.out.println("#                      5. SUPPRIMER UN COMPTE                 #");
		System.out.println("#                      6. LISTER DES COMPTES                  #");
		System.out.println("#                      0. REVENIR AU MENU                     #");
		System.out.println("#                                                             #");
		System.out.println("###############################################################");
		
		System.out.print("  VOTRE SELECTION <0 - 4> ? :");
		
	}
	
	/**
	 * Methode permettant d'afficher le sous-menu de gestion des clients
	 */
	
	public static void MenuGestionPersonne() {
		
		System.out.println("###############################################################");
		System.out.println("#                          GERER UN CLIENT                    #");
		System.out.println("###############################################################");
		System.out.println("#                                                             #");
		System.out.println("#                      1. CREER UN CLIENT                     #");
		System.out.println("#                      2. MODIFIER UN CLIENT                  #");
		System.out.println("#                      3. SUPPRIMER UN CLIENT                 #");
		System.out.println("#                      4. LISTER UN CLIENT                    #");
		System.out.println("#                      5. LISTER TOUT LES CLIENTS             #");
		System.out.println("#                      0. REVENIR AU MENU                     #");
		System.out.println("#                                                             #");
		System.out.println("###############################################################");
		
		System.out.print("  VOTRE SELECTION <0 - 4> ? :");
		
	}
	
	/**
	 * Methode permettant de creer un client sur demande du conseiller via le menu de l'application ProxiBanque
	 * @param Conseiller 
	 */
	//creer un client par un conseiller
	public static void creationClient(Conseiller conseiller) {
		System.out.print(" nom client:");
		sc.nextLine();
		String nom = sc.nextLine();
		
		System.out.print(" prenom client:");
		String prenom = sc.nextLine();
		System.out.print(" adresse client :");
		String adresse = sc.nextLine();
		System.out.print(" code postale :");
		String codePostale = sc.nextLine();
		System.out.print(" Ville :");
		String ville = sc.nextLine();
		System.out.print(" profession :");
		String  profession = sc.nextLine();
		System.out.print(" type client (1. Particulier/2. Entreprise) :");
		int typeC = sc.nextInt();
		String  typeClient = " " ;
		if (typeC == 1)
		   typeClient = "Particulier";
		else if (typeC == 2)
		   typeClient = "Entreprise";
		System.out.println();
		System.out.println();
		
		//int idClient, String nom, String prenom, String adresse, String codePostal, String ville, String typeClient
		Client client1 = new Client(nom, prenom,adresse,codePostale,ville, profession,typeClient);
		try {
			service.creerMonClient(client1, conseiller);
			System.out.println("client créé :"+client1);
			System.out.println();
			System.out.println();
		} catch (NbClientsGeresException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	/**
	 * Methode permettant de modifier les informations d'un client sur demande du conseiller via le menu de l'application ProxiBanque
	 * @param Conseiller
	 */
	
	//modifier un client par un conseiller
	public static void modificationClient(Conseiller conseiller) {
		listerClients(conseiller);
		System.out.println();
		System.out.println("--------  Saisir l'ID du client a modifier");
		int id = sc.nextInt() ; 
		Client client = conseiller.getClients().get(id);
		
		System.out.println("--------  Menu des modifications ---------- ");
		System.out.println("           1. modification du nom");
		System.out.println("           2. modification du prenom");
		System.out.println("           3. modification de l'adresse");
		System.out.println("           4. modification de la ville");
		System.out.println("           5. modification du code postal");
		
		int choix = sc.nextInt() ;
		String donneeC = " "; 
		switch (choix) {
		  case (1) : System.out.print("Veuillez saisir le nouveau nom: "); 
		             sc.nextLine();
		             donneeC = sc.nextLine();
		             client.setNom(donneeC); 
		             service.modifierClient(client); 
		             listerClients(conseiller) ;
		             break; 
		  case (2) : System.out.print("Veuillez saisir le nouveau prenom: ");
		             sc.nextLine();
		             donneeC = sc.nextLine(); 
                     client.setPrenom(donneeC); 
                     service.modifierClient(client);
                     listerClients(conseiller) ;
                     break; 
		  case (3) : System.out.print("Veuillez saisir la nouvelle adresse: "); 
		             sc.nextLine();
		             donneeC = sc.nextLine(); 
                     client.setAdresse(donneeC); 
                     service.modifierClient(client); 
                     break; 
		  case (4) : System.out.print("Veuillez saisir la nouvelle ville: ");
		             sc.nextLine();
		             donneeC = sc.nextLine(); 
                     client.setVille(donneeC); 
                     service.modifierClient(client); 
                     break; 
		  case (5) : System.out.print("Veuillez saisir le nouveau code postal: ");
		             sc.nextLine();
		             donneeC = sc.nextLine(); 
                     client.setCodePostal(donneeC); 
                     service.modifierClient(client); 
                     break; 
		  }
		
		
	}
	
	/**
	 * Methode permettant de supprimer un client sur demande du conseiller via le menu de l'application ProxiBanque
	 * @param Conseiller
	 */
	
	//supprimer un client par un conseiller
	public static void suppressionClient(Conseiller conseiller) {

		List<Client> mesClients = listerClients(conseiller);
		System.out.println();
		if(mesClients.size() == 0) {
			System.out.println("Vous n'avez aucun client");
		} else {
			System.out.print("tapez id du client à supprimer :");
			int idClient = sc.nextInt();
			service.supprimerMonClient(idClient, conseiller);
			listerClients(conseiller);
		}
	}
	
	
	/**
	 * Methode permettant de lister tout les clients de l'agence sur demande du conseiller via le menu de l'application ProxiBanque
	 * @param Conseiller
	 * @return List <Client>
	 */
	//obtenir la liste des clients gérés par un conseiller
	public static List<Client> listerClients(Conseiller conseiller) {
		List<Client> mesClients = conseiller.getClients();
		System.out.println("*************************");
		System.out.println(" Liste de mes clients :");
		System.out.println("*************************");
		Stream<Client> str = mesClients.stream();		
		str.forEach(System.out::println);
		return mesClients;
	}
	
	/**
	 * Methode permettant de lister un client en particulier sur demande du conseiller via le menu de l'application ProxiBanque
	 * @param Conseiller
	 */
	public static void listerClient(Conseiller conseiller) {
		
	}

	/**
	 * Methode permettant de creer un compte pour un client donné (courant ou epargne) avec précision du solde a créditer pour ce compte 
	 * sur demande du conseiller via le menu de l'application ProxiBanque
	 * @param Conseiller
	 */
	public static void creationCompte(Conseiller conseiller) {	
		
		List<Client> mesClients = listerClients(conseiller);
		System.out.println();
		if(mesClients.size() == 0) {
			System.out.println("Vous n'avez aucun client, veuillez créer un client pour lequel vous voulez créer un compte");
			System.out.println();
		} else {
			System.out.print("tapez id du client pour lequel vous voulez créer un compte :");
			int idClient = sc.nextInt();
			Client client = conseiller.getClients().get(idClient);
			sc.nextLine();
			System.out.print("choisir type de compte : 1- compte courant, 2- compte epargne");
			int typeCompte = sc.nextInt();
			System.out.print("solde :");
			double solde = sc.nextDouble();
			Compte compte;
			if (typeCompte == 1) {
				compte = new CompteCourant(solde, new Date());
			}else {
				compte = new CompteEpargne(solde, new Date());
			}
			service.creerCompteMonClient(compte, client);
			listerComptes(client, conseiller);
		}
				
	}
	
	/**
	 * Methode permettant de modifier les informations relatives à un compte donné 
	 * sur demande du conseiller via le sous-menu de gestion des comptes de l'application ProxiBanque
	 * @param Conseiller
	 */
	//modifier un compte par un conseiller
	public static void modificationCompte(Conseiller conseiller) {
		
	}
	
	
	//supprimer un compte par un conseiller
	/**
	 * Methode permettant de supprimer un compte donné
	 * sur demande du conseiller via le sous-menu de gestion des comptes de l'application ProxiBanque
	 * @param conseiller
	 */
	public static void suppressionCompte(Conseiller conseiller) {
		 
		List<Client> mesClients = listerClients(conseiller);
		System.out.println();
		if(mesClients.size() == 0) {
			System.out.println("Vous n'avez aucun client et aucun compte à supprimer");
			System.out.println();
		} else {
			System.out.print("tapez id du client pour lequel vous voulez supprimer un compte :");
			int idClient = sc.nextInt();
			Client client = conseiller.getClients().get(idClient);
			sc.nextLine();
			List<Compte> comptes = listerComptes(client, conseiller);
			
			if(comptes.size() == 0) {
				System.out.println("Le client n'aucun compte");
				System.out.println();
			}else {
				System.out.println();
				System.out.print("tapez id du compte à supprimer :");
				int idCompte = sc.nextInt();
				service.supprimerCompteClient(idCompte, conseiller);
				listerComptes(client, conseiller);
			}
		}	
	
		
	}
	
	
	/**
	 * methode permettant de lister tout les comptes que possède un client donné
	 * sur demande du conseiller via le sous-menu de gestion des comptes de l'application ProxiBanque
	 * @param Client
	 * @param Conseiller
	 * @return List <Compte>
	 */
	//afficher une liste de compte des clients du conseiller	
	public static List<Compte> listerComptes(Client client, Conseiller conseiller) {
		List<Compte> comptesDeMonClient = client.getComptes();
		System.out.println("*************************");
		System.out.println(" Liste des comptes :");
		System.out.println("*************************");
		System.out.println("Client: " + client.getIdClient());
		Stream<Compte> str = comptesDeMonClient.stream();		
		str.forEach(System.out::println);
		return comptesDeMonClient;
	}
	
	
	
	/**
	 * Methode permettant d'afficher tout les comptes gérés par un conseiller de l'agence 
	 * @param Conseiller
	 */
	//afficher une liste de compte des clients du conseiller	
	public static void listerComptes(Conseiller conseiller) {
		List<Compte> comptesDeMesClients = service.listeComptesMesClients(conseiller);
		System.out.println("*************************");
		System.out.println(" Liste des comptes de tous les clients:");
		System.out.println("*************************");
		Stream<Compte> str = comptesDeMesClients.stream();		
		str.forEach(System.out::println);
		
	}
	
	/**
	 * Methode permettant d'effectuer un virement d'un client vers un autre. Cette methode permet egalement d'effectuer
	 * un virement d'un compte courant vers un compte epargne pour un meme client *
	 * via le sous-menu de gestion des comptes de l'application ProxiBanque
	 * @param conseiller
	 */
	
	public static void effectuerVirement(Conseiller conseiller) {
		listerClients(conseiller);
		System.out.println("----  Saisir l'identifient du client pour a débiter----");
		int idClient1 = sc.nextInt() ;
		System.out.println("----  Saisir l'identifient du client pour a créditer----");
		int idClient2 = sc.nextInt() ;
		System.out.println("----  Saisir le montant de votre virement ----");
		double montant = sc.nextDouble();
		List<Compte> mesComptes1 = listerComptes(service.lireClient(idClient1), conseiller);
		List<Compte> mesComptes2 = listerComptes(service.lireClient(idClient2), conseiller);
		System.out.println("----  Saisir l'identifient du compte à débiter ----");
		int idCompte1 = sc.nextInt() ;
		System.out.println("----  Saisir l'identifient du compte sà créditer ----");
		int idCompte2 = sc.nextInt() ;
		try {
			service.effectuerVirement(mesComptes1.get(idCompte1), mesComptes2.get(idCompte2), montant);
		} catch (SoldeInsuffisantException e) {
			// TODO Auto-generated catch block
			System.out.println("*************************");
			System.out.println(e.getMessage() + " !!!!!");
			System.out.println("*************************");
		}	
		listerComptes(service.lireClient(idClient1), conseiller);
	}
	
	
	public static void effectuerPlacement(Conseiller conseiller) {
		
		//listerComptes(conseiller);
		for (Client client : conseiller.getClients()) {
			
			
			try {
				service.verifierPlacement(client, conseiller);
			} catch (VerifPlacementException e) {
				System.out.println(client);
				System.out.println(e.getMessage());
			}
			
		}
		
				
	}
	
}

