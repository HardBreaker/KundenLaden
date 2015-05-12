package my.kundenladen;

public class Main {
	public static void main(String[] args) {
		Laden laden = new Laden();
		KundenGenerator kgen = new KundenGenerator( laden);

		Thread kgenThread = new Thread(kgen);
        kgenThread.start();		
	}
}
