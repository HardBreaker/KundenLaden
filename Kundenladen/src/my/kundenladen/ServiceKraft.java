package my.kundenladen;

public class ServiceKraft implements Runnable {
	private Kueche kueche;
	private Laden laden;

	public ServiceKraft(Kueche kueche, Laden laden) {
		super();
		this.kueche = kueche;
		this.laden = laden;
	}

	public Kueche getKueche() {
		return kueche;
	}

	public void setKueche(Kueche kueche) {
		this.kueche = kueche;
	}

	@Override
	public void run() {
    while (true) {
      laden.kundenBediengen();		
	}
	}

	public Laden getLaden() {
		return laden;
	}

	public void setLaden(Laden laden) {
		this.laden = laden;
	}
}
