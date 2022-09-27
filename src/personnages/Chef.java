package personnages;

public class Chef {
	private String nom;
	private int force;
	private int effetPotion = 1;
	public Chef(String nom, int force, int effetPotion) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
	}
	
	public String getNom() {
		return nom;
	}
}
