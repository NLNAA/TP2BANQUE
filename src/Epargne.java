public class Epargne extends Compte{
	private double soldeCompte; // peut être négatif
	private double tauxInteret;
	
	
	
	public double getSoldeCompte(){
		return soldeCompte*tauxInteret;
	}
	
}
