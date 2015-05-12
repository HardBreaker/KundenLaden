package my.kundenladen;

public class KundenGenerator implements Runnable {

	private Laden laden;

	public KundenGenerator(Laden laden) {
		this.laden = laden;
	}

	void generiereKunden(Laden laden) {
		// TODO generiere Kunden
		// TODO ändern die Methode entsprechend der Aufgabenstellung
		while (true) {

		}

	}

	@Override
	public void run() {
		generiereKunden(this.laden);
	}
}
