package my.kundenladen;

public class KuechenHilfe implements Runnable{

	private Kueche kueche; 
	
	public KuechenHilfe(Kueche kueche) {
		super();
		this.setKueche(kueche);
	}
	
	@Override
	public void run() {
		
	}
	
	public Kueche getKueche() {
		return kueche;
	}
	public void setKueche(Kueche kueche) {
		this.kueche = kueche;
	}
}
