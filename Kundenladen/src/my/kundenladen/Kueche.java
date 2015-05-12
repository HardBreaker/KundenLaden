package my.kundenladen;

public class Kueche {
	
	private final int maxanzahlbuerger = 5;

	private int anzahlVonProduktenAufmlaufband;
	private int anzahlZufertigendeBuerger;

	public Kueche() {
		for (int i = 0; i < 3; i++) {
			KuechenHilfe k = new KuechenHilfe(this);
			k.run();
		}
	}

	public synchronized void bestellungInDieKuecheBringen() {

	}

	public synchronized void aufsLAufbandLegen() {

	}

	public synchronized void vomLAufbandNehmen() {

	}

	public int getAnzahlZufertigendeBuerger() {
		return anzahlZufertigendeBuerger;
	}

	public void setAnzahlZufertigendeBuerger(int anzahlZufertigendeBuerger) {
		this.anzahlZufertigendeBuerger = anzahlZufertigendeBuerger;
	}

	public int getAnzahlVonProduktenAufmlaufband() {
		return anzahlVonProduktenAufmlaufband;
	}

	public void setAnzahlVonProduktenAufmlaufband(
			int anzahlVonProduktenAufmlaufband) {
		this.anzahlVonProduktenAufmlaufband = anzahlVonProduktenAufmlaufband;
	}


}
