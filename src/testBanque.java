
public class testBanque {

	public static void main(String[] args) {
		Client unClient = new Client();
		Client deuxClient = new Client();
		Compte unCompte = new Compte(unClient, 01, 2222);
		Compte deuxCompte = new Compte(deuxClient, 02, 3333);
		Compte unCompteCourant = new Courant();
		Compte unCompteEpargne = new Epargne();
		Banque uneBanque = new Banque();
		
		unClient.ajouterCompte(unCompte);
		unClient.compteDansLeRouge();
		unClient.soldeCompte();
		//unClient.toString();
		unCompte.comparerCompte(deuxCompte);
		unCompte.crediterSolde(30);
		unCompte.debiterSolde(40);
		unCompte.getNumeroCompte();
		deuxCompte.getSoldeCompte();
		//deuxCompte.toString();
		unCompte.getUnClient();
		deuxCompte.transfererArgent(unCompte, 40);
		
		
	}

}
