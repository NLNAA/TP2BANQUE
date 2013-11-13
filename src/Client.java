import java.util.ArrayList;

public class Client {

	private String nom, prenom;
	ArrayList<Compte> mesComptes = new ArrayList<Compte>();
	
	public Client(){
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public ArrayList<Compte> getMesComptes() {
		return mesComptes;
	}
	public void setMesComptes(ArrayList<Compte> mesComptes) {
		this.mesComptes = mesComptes;
	}
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
