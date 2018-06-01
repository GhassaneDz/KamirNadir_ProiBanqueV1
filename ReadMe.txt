----------------------------------------------------------------------------------------------
				Projet ProxiBanqueSI v1.0
----------------------------------------------------------------------------------------------
Par Boutra Nadir et Kamir El Sisi
le 01/06/2018


---------------------
I. Probl�matique
---------------------

   L'application ProxibanqueSI permet la gestion des agences et des clients de ProxiBanque "la banque proche de ses clients!". Elle sera utilis�e par les conseillers des agences bancaires sous la version 1.0
	
   L'application doit permettre au conseiller client�le de cr�er un client, le modifier, lire ses informations et le supprimer. Le conseil doit pouvoir effectuer des virements de  
   compte � compte ainsi que r�aliser des simulations de cr�dits immobiliers ou de consommation. Les clients (particuliers uniquement) fortun�s peuvent b�n�ficier d'un syst�me de placement en bourse. 
   L'application propose �galement de faire un audit de chaque clients d'une agence.

   L'application doit disposer d'un syst�me d'authentification pour attribuer des droits diff�rents � l'utilisateur, par exemple les g�rants peuvent faire la gestion de 
   tous les clients de leur agence tandis que les conseillers ne peuvent g�rer que leurs propres clients.

---------------------
II. Fonctionnalit�s
---------------------

   ProxiBanqueSI v1.0 dispose des fonctionnalit�s suivantes :

1) L'application est centr�e autour du conseiller (c'est lui qui effectue toutes les op�tations)

2) Gestion Clients : 
   - Creation d'un nouveau client : Renseignement des informations du client sous forme interactif 

   - Modifier un client 

   - Supprimer un client 

   - Lister un client en particulier 

   - Lister tous les clients g�r�s par un conseiller
 
3) Gestion Comptes :
 
   - Creation d'un compte : Renseignement des informations du compte sous forme interactif 
         * Option 1 : Creation d'un compte courant (par d�faut le decouvert est de 1000 euros)
         * Option 2 : Creation d'un compte epargne (par defaut le taux est de 3 %)

   - Modifier un compte : Fonctionnalit�e non implement�e
 
   - Effectuer un virement: 
         
  
   - Effectuer un placement : Cette option est reserv�e pour les clients fortun�s. Lorsque le conseiller liste tout les clients � partir du menu de gestion des clients, L'application lui indique quels sont 
                              les clients �ligibles pour un placement 

   - Supprimer un compte : Supprimer un compte pour un client en particulier 

---------------------
II. Installation 
---------------------

   - Se placer dans le ficher .../Livrable/
   - Lancer la commande 

--------------------------------------
IV. Sc�nario classique d'utilisation
--------------------------------------


   - Au demarrage de l'application 3 clients sont pr�sents dans le systeme: 

      * Client 1 : 

            Nom         : David 
            Prenom      : Messir
            Adresse     : 22 rue de la pompe
            Code Postal : 75016
            Ville       : Paris
            Fonction    : PDG
            Statut      : Particulier
 
      * Client 2 :  

            Nom         : MTS 
            Adresse     : Lourcine
            Code Postal : 75014
            Ville       : Paris
            Statut      : Entreprise

      * Client 3 :  

            Nom         : boutrin
            Prenom      : Nadir 
            Adresse     : 91 trur
            Code Postal : 91120
            Ville       : Palaiseau 
            Statut      : Particulier

   - Le menu principal propose 3 options : 

      * " Gerer Clients "
      * " Gerer Comptes "
      * " Quitter "

   - Le sous-menu de gestion des clients propose les fonctionnalit�s suivantes : 

      * "Creer un client" : Cette option permet de creer un client d'une maniere interactive (a ce stade, le client ne possede aucun compte)
      * "Modifier Compte" : Cette options permet de modifier l'un des attributs (nom, prenom, adresse, ville, code postal, ...) pour les clients : client 1, client 2, client 3 et les autres clients que vous aurez ajout� 
      * "Effectuer virement" : 
                * Option 1 (Virement interne) : Effectu� pour meme client � partir d'un compte courant vers un compte epargne ou inversement
                       Deroul� de l'op�ration : 
                
                 
                * Option 2 (Virement externe) : Effectu� d'un compte x d'un client A vers un compte x d'un client B 
                       Deroul� de l'operation : 
      * Effectuer un placement : Au demarrage de l'application, le client1