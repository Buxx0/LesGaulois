package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "'" + texte + "'");
	}
	
	private	String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abondonne...");
		}
	}
	
	public static void main(String[] args) {
		Romain cesar = new Romain("Cesar", 18);
		System.out.println(cesar.prendreParole());
		cesar.parler("Bonjour");
		cesar.recevoirCoup(10);
		cesar.recevoirCoup(10);
	}
}