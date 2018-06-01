----------------------------------------------------------------------------------------------
				Projet ProxiBanqueSI v1.0
----------------------------------------------------------------------------------------------
Par Boutra Nadir et Kamir El Sisi
le 01/06/2018


---------------------
I. Problématique
---------------------

   L'application ProxibanqueSI permet la gestion des agences et des clients de ProxiBanque "la banque proche de ses clients!". Elle sera utilisée par les conseillers des agences bancaires sous la version 1.0
	
   L'application doit permettre au conseiller clientèle de créer un client, le modifier, lire ses informations et le supprimer. Le conseil doit pouvoir effectuer des virements de  
   compte à compte ainsi que réaliser des simulations de crédits immobiliers ou de consommation. Les clients (particuliers uniquement) fortunés peuvent bénéficier d'un système de placement en bourse. 
   L'application propose également de faire un audit de chaque clients d'une agence.

---------------------
II. Fonctionnalités
---------------------

   ProxiBanqueSI v1.0 dispose des fonctionnalités suivantes :

1) L'application est centrée autour du conseiller (c'est lui qui effectue toutes les opétations)

2) Gestion Clients : 

   - Creation d'un nouveau client : Renseignement des informations du client sous forme interactif 

   - Modifier un client 

   - Supprimer un client 

   - Lister un client en particulier : "fonctionnalitée non implementée !!"  

   - Lister tous les clients gérés par un conseiller
 
3) Gestion Comptes :
 
   - Creation d'un compte : Renseignement des informations du compte sous forme interactif  

         * Option 1 : Creation d'un compte courant (par défaut le decouvert est de 1000 euros)
         * Option 2 : Creation d'un compte epargne (par defaut le taux est de 3 %)
         * Remarque : Le systeme ne gere pas le cas d'ajout d'un compte pour un client qui possede deja un compte du meme type 
   - Modifier un compte : Fonctionnalitée non implementée
 
   - Effectuer un virement: 

         * Option 1 (Virement interne) : Effectué pour meme client à partir d'un compte courant vers un compte epargne ou inversement
                         
         * Option 2 (Virement externe) : Effectué d'un compte x d'un client A vers un compte y d'un client B d'une meme agence  
  
   - Effectuer un placement : Cette option est reservée pour les clients fortunés. Lorsque le conseiller liste tout les clients à partir du menu de gestion des clients, L'application lui indique quels sont 
                              les clients éligibles pour un placement 

   - Supprimer un compte : Supprimer un compte pour un client en particulier 

---------------------
II. Installation 
---------------------

   - Se placer dans le ficher .../Livrable/
   - Lancer la commande java -jar proxiBanque.jar  

--------------------------------------
IV. Scénario classique d'utilisation
--------------------------------------


   - Au demarrage de l'application, 3 clients sont présents dans le systeme: 

      * Client 1 : Possède un compte courant et un compte epargne 

            Nom         : David 
            Prenom      : Messir
            Adresse     : 22 rue de la pompe
            Code Postal : 75016
            Ville       : Paris
            Fonction    : PDG
            Statut      : Particulier
 
      * Client 2 : Possède un compte courant et un compte epargne   

            Nom         : MTS 
            Adresse     : Lourcine
            Code Postal : 75014
            Ville       : Paris
            Statut      : Entreprise

      * Client 3 : Possède un compte courant et un compte epargne   

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

   - Le sous-menu de gestion des clients propose les fonctionnalités suivantes : 

      * "Creer un client" : Cette option permet de creer un client d'une maniere interactive (a ce stade, le client ne possede aucun compte)
      * "Modifier Compte" : Cette options permet de modifier l'un des attributs (nom, prenom, adresse, ville, code postal, ...) pour les clients : client 1, client 2, client 3 et les autres clients que vous aurez ajouté 
      * "Effectuer virement" : 
                * Option 1 (Virement interne) : Effectué pour meme client à partir d'un compte courant vers un compte epargne ou inversement
                       Deroulé de l'opération : 
                       l'application demande l'identient du client débiteur et créditeur 
                       L'application demande le montant du virement 
                * Option 2 (Virement externe) : Effectué d'un compte x d'un client A vers un compte x d'un client B 
                       Deroulé de l'operation : 
      * Effectuer un placement : Au demarrage de l'application, le client1