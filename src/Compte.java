public class Compte {
	private Client unClient;
	private double numeroCompte;
	private double soldeCompte;
	
	public Compte(){
		
	}
	public Compte(Client unClient, double unNumCompte, double unSoldeCompte){
		this.unClient = unClient;
		numeroCompte = unNumCompte;
		soldeCompte = unSoldeCompte;
	}
	
	public String toString() {
		return "Compte [unClient=" + unClient + ", numeroCompte="
				+ numeroCompte + ", soldeCompte=" + soldeCompte + "]";
	}
	public Client getUnClient() {
		return unClient;
	}
	public void setUnClient(Client unClient) {
		this.unClient = unClient;
	}
	public double getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(double numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public double getSoldeCompte() {
		return soldeCompte;
	}
	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	public void crediterSolde(double unMontant){
		soldeCompte += unMontant;
	}
	public boolean debiterSolde(){
		boolean boolDebit=true;
		return boolDebit; //true si le debit est OK, sinon False
	}
	public boolean transfererArgent(Compte unCompte){
		boolean boolTransfert=true;
		return boolTransfert;//true si le transfert est OK, sinon False
	}
	public boolean comparerCompte(Compte unCompte){
		boolean boolCompare=true;
		return boolCompare;
	}
}
