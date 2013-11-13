public class Compte {
	private Client unClient;
	private double numeroCompte;
	private double soldeCompte;
	
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
