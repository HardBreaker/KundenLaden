package my.kundenladen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Laden {

	
	//alle Listen durch Queues ersetzen
	List<Kunde> linkeSchlange = new ArrayList<>();
	List<Kunde> rechtechlange = new ArrayList<>();
	
	List<Kunde> bedienteKunden = new ArrayList<>();
	
	private Kueche kueche = new Kueche();
	
	public Laden() {
		for (int i = 0; i < 2; i++) {
			ServiceKraft s = new ServiceKraft(kueche, this);
			s.run();
			
		}
	}
	
    // diese kannst durch eine andere Queue ersetzen
	private Queue<Kunde> bestellteKunden = new LinkedList<Kunde>();
	
	public synchronized void eintreten(Kunde kunde) {
		// verteilen kunden
	}
    public synchronized void kundenBediengen() {
    	
    }
	public Queue<Kunde> getBestellteKunden() {
		return bestellteKunden;
	}
	public void setBestellteKunden(Queue<Kunde> bestellteKunden) {
		this.bestellteKunden = bestellteKunden;
	}
	public Kueche getKueche() {
		return kueche;
	}
	public void setKueche(Kueche kueche) {
		this.kueche = kueche;
	}
}
