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

public class Lanceur {
	
	
	static Iservice service = new ServiceImpl() ;
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {


		
		
		
		List <Client> clients = new ArrayList<Client>() ;
		List <Compte> comptes = new ArrayList<Compte>() ;
		List <CarteBancaire> cartes = new ArrayList<CarteBancaire>();
		
		//Instanciation d'un conseiller
		//(String nom, String prenom, String adresse, String codePostal, String ville, int login, int password)
		Conseiller conseiller = new Conseiller ("Galile", "Michel", "2 rue Gambetta", "75014", "paris", 1234, 0000) ; 

		

		//Instanciation de clients
		
		Client client1 = new Client(1, "jierre", "ewing", "22rueam", "99820", "Dallas", "", "particulier") ; 
		Client client2 = new Client(2, "GTM", "","Lourcine", "7514","Paris","", "entreprise") ; 
		Client client3 = new Client(3, "boutrin", "nadir", "91trur", "91120", "Palaiseau","", "particulier") ;
				
		Compte comptep1 = new CompteEpargne(1) ; 
		Compte comptep2 = new CompteEpargne(2) ;
		Compte comptep3 = new CompteEpargne(3) ;
		
	
		
		Compte compteCourant1 = new CompteCourant(4) ; 
		Compte compteCourant2 = new CompteCourant(5) ; 
		Compte compteCourant3 = new CompteCourant(6) ; 
		

		
		CarteBancaire carte1 = new VisaElectron(100) ;
		CarteBancaire carte2 = new VisaElectron(200) ;
		CarteBancaire carte3 = new VisaPremier(300) ;
		
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
						listerClients(conseiller);   //lister les clients
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
					suppressionCompte(conseiller);    //supprimer un compte
					break;
				case 4: 
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
	
	public static void MenuGestionCompte() {
		
		System.out.println("###############################################################");
		System.out.println("#                          GERER UN COMPTE                    #");
		System.out.println("###############################################################");
		System.out.println("#                                                             #");
		System.out.println("#                      1. CREER UN COMPTE                     #");
		System.out.println("#                      2. MODIFIER UN COMPTE                  #");
		System.out.println("#                      3. SUPPRIMER UN COMPTE                 #");
		System.out.println("#                      4. LISTER DES COMPTES                  #");
		System.out.println("#                      0. REVENIR AU MENU                     #");
		System.out.println("#                                                             #");
		System.out.println("###############################################################");
		
		System.out.print("  VOTRE SELECTION <0 - 4> ? :");
		
	}
	
	public static void MenuGestionPersonne() {
		
		System.out.println("###############################################################");
		System.out.println("#                          GERER UN CLIENT                    #");
		System.out.println("###############################################################");
		System.out.println("#                                                             #");
		System.out.println("#                      1. CREER UN CLIENT                     #");
		System.out.println("#                      2. MODIFIER UN CLIENT                  #");
		System.out.println("#                      3. SUPPRIMER UN CLIENT                 #");
		System.out.println("#                      4. LISTER DES CLIENTS                  #");
		System.out.println("#                      0. REVENIR AU MENU                     #");
		System.out.println("#                                                             #");
		System.out.println("###############################################################");
		
		System.out.print("  VOTRE SELECTION <0 - 4> ? :");
		
	}
	
	
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
		System.out.print(" type client :");
		String  typeClient = sc.nextLine();
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
	
	//modifier un client par un conseiller
	public static void modificationClient(Conseiller conseiller) {
		
	}
	
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

	
	public static void creationCompte(Conseiller conseiller) {	
		
		List<Client> mesClients = listerClients(conseiller);
		System.out.println();
		if(mesClients.size() == 0) {
			System.out.println("Vous n'avez aucun client, veuillez créer un client pour lequel vous voulez créer un compte");
			System.out.println();
		} else {
			System.out.print("tapez id du client pour le quel vous créez un compte :");
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
	
	
	//modifier un compte par un conseiller
	public static void modificationCompte(Conseiller conseiller) {
		
	}
	
	
	//supprimer un compte par un conseiller
	/**
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
			listerComptes(client, conseiller);
			System.out.println();
			System.out.print("tapez id du compte à supprimer :");
			int idCompte = sc.nextInt();
			service.supprimerCompteClient(idCompte, conseiller);
			
			//int typeCompte = sc.nextInt();
			//Compte compte;
			//if (typeCompte == 1) {
				//compte = new CompteCourant(solde, new Date());
			//}else {
				//compte = new CompteEpargne(solde, new Date());
			//}
			//service.creerCompteMonClient(compte, client);
		}	
	
		
	}
	
	
	
	//afficher une liste de compte des clients du conseiller	
	public static List<Compte> listerComptes(Client client, Conseiller conseiller) {
		List<Compte> comptesDeMonClient = client.getComptes();
		System.out.println("*************************");
		System.out.println(" Liste des comptes :");
		System.out.println("*************************");
		Stream<Compte> str = comptesDeMonClient.stream();		
		str.forEach(System.out::println);
		return comptesDeMonClient;
	}
	
	
	
	//afficher une liste de compte des clients du conseiller	
	public static void listerComptes(Conseiller conseiller) {
		List<Compte> comptesDeMesClients = service.listeComptesMesClients(conseiller);
		System.out.println("*************************");
		System.out.println(" Liste des comptes :");
		System.out.println("*************************");
		Stream<Compte> str = comptesDeMesClients.stream();		
		str.forEach(System.out::println);
		
	}
	
	
}
