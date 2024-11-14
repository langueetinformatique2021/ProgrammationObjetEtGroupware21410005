package atelier05;

public class Carafe {
	private int contenu_;
	private int capacite_;
	
	public Carafe(int capacite) {
		this.capacite_ = capacite;
		vider();
	}
	
	public void Remplir() {
	   this.contenu_ = capacite_;	
	}
	
	public void Vider() {
		this.contenu_ = 0;
	}
	
	public void Contenu() {
		return this.contenu_;
	}
	
	public void Capacité() {
		return this.capacite_;
	}
	
	public void Transvaser() {
		
	}
		
}
