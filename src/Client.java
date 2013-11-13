import java.util.ArrayList;

public class Client {

	private String nom, prenom;
	ArrayList<Compte> mesComptes = new ArrayList<Compte>();
	
	public Client(){
		
	}
	
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", mesComptes="
				+ mesComptes + "]";
	}
	
	public double soldeCompte(){
		double soldeTotalCompte=0;
		for(Compte c : mesComptes){
			soldeTotalCompte += c.getSoldeCompte();
		}
		return soldeTotalCompte;
	}
	public boolean compteDansLeRouge(){
		boolean bool=false;
		for(Compte c : mesComptes){
			if(c.getSoldeCompte() < 0){
				bool = true;
			}
		}
		return bool;
	}
	public void ajouterCompte(Compte unCompte){
		mesComptes.add(unCompte);
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
}
