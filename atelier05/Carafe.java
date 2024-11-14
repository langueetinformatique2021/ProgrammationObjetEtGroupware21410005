package atelier05;

public class Carafe {
	private int contenu_;
	private int capacite_;
	
	public Carafe(int capacite) {
		this.capacite_ = capacite;
		Vider();
	}
	
	public void Remplir() {
	   this.contenu_ = capacite_;	
	}
	
	public void Vider() {
		this.contenu_ = 0;
	}
	
	public int Contenu() {
		return this.contenu_;
	}
	
	public void Contenu(int contenu) {
		this.contenu_ = contenu;
	}
	
	public void Capacité() {
		return this.capacite_;
	}
	
	public void Transvaser(Carafe c) {
		int reste = this.capacite_ - this.contenu_;
		if (c.Contenu() <= reste) {
			this.Contenu(Contenu() + c.Contenu());
			c.Vider();
		}
		else {
			c.Contenu(c.Contenu() - reste);
			this.Remplir();
	}
		
}
