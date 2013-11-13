import java.util.ArrayList;

public class Client {

	private String nom, prenom;
	ArrayList<Compte> mesComptes = new ArrayList<Compte>();
	
	public double soldeCompte(){
		 double solde=0;
		
		return solde;
	}
	public boolean compteDansLeRouge(){
		boolean bool=false;
		return bool;
	}
	public void ajouterCompte(Compte unCompte){
		mesComptes.add(unCompte);
	}
}
