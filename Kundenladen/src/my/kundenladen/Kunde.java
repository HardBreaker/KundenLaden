package my.kundenladen;

public class Kunde implements Runnable {

	private Laden laden;
	
	// dies ist auch entsprechend zu korrigieren
    private int anzahlVonZubestellendenBuerger = (int) (Math.random()+1);
    
    private long warteZeit;
    
    
	public Kunde(Laden laden) {
		this.setLaden(laden);
	}

	@Override
	public void run() {
      laden.eintreten(this);
	}

	public Laden getLaden() {
		return laden;
	}

	public void setLaden(Laden laden) {
		this.laden = laden;
	}

	public int getAnzahlVonZubestellendenBuerger() {
		return anzahlVonZubestellendenBuerger;
	}

	public void setAnzahlVonZubestellendenBuerger(
			int anzahlVonZubestellendenBuerger) {
		this.anzahlVonZubestellendenBuerger = anzahlVonZubestellendenBuerger;
	}

	public long getWarteZeit() {
		return warteZeit;
	}

	public void setWarteZeit(long warteZeit) {
		this.warteZeit = warteZeit;
	}

}
