import java.util.ArrayList;


public class Banque {
ArrayList<Client> mesClients = new ArrayList<Client>();

	public Banque(){
		
	}

	
	public Client clientLePlusRiche(){
		Client clientLPR = null;
		double soldeCli = 0;
		for(Client unCli : mesClients){
			if(unCli.soldeCompte() > soldeCli){
				clientLPR = unCli;
				soldeCli = unCli.soldeCompte();
			}
		}
		return clientLPR;
	}
	
	public ArrayList<Client> clientsADecouvert(){
		ArrayList<Client> lesClientsADecouvert = new ArrayList<Client>();
		for(Client unCli : mesClients){
			if(unCli.compteDansLeRouge()==true){
				lesClientsADecouvert.add(unCli);
			}
		}
		return lesClientsADecouvert;
	}
	
	public void ajouterClient(Client unClient){
		mesClients.add(unClient);
	}
	
	public String toString() {
		return "Banque [mesClients=" + mesClients + "]";
	}
	public ArrayList<Client> getMesClients() {
		return mesClients;
	}
	public void setMesClients(ArrayList<Client> mesClients) {
		this.mesClients = mesClients;
	}
	
}
