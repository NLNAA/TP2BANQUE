public class Epargne extends Compte{
	private double soldeCompte; // peut �tre n�gatif
	private double tauxInteret;
	
	
	
	public double getSoldeCompte(){
		return soldeCompte*tauxInteret;
	}
	
}
