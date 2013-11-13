import java.util.ArrayList;


public class Banque {
ArrayList<Client> mesClients = new ArrayList<Client>();

	public Client clientLePlusRiche(){
		return null;
	}
	
	public ArrayList<Client> clientsADecouvert(){
		ArrayList<Client> lesClientsADecouvert = new ArrayList<Client>();
		return lesClientsADecouvert;
	}
	
	public void ajouterClient(Client unClient){
		mesClients.add(unClient);
	}
	
}
