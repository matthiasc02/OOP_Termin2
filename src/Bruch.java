
public class Bruch {
	private int nenner;
	private int zaehler;
	public static int counter = 0;

	public Bruch(int zaehler, int nenner) {
		this.nenner = nenner;
		this.zaehler = zaehler;
		counter++;
	}

	public int getnenner() {
		return nenner;
	}

	public int getzaehler() {
		return zaehler;
	}

	public void print() {
		System.out.println(zaehler + "/" + nenner);
	}

	public double toDecimal() {
		double wert = (double) zaehler / nenner;
		return wert;
	}

	public Bruch multiplicate(Bruch b2) {
		int neu_nenner = this.nenner * b2.getnenner();
		int neu_zaehler = this.zaehler * b2.getzaehler();

		Bruch ergebnis = new Bruch(neu_zaehler, neu_nenner);
		return ergebnis;
	}

	public Bruch multiplicate(Bruch b2, Bruch b3) {
		return new Bruch(this.nenner * b2.getnenner() * b3.getnenner(),
				this.zaehler * b2.getzaehler() * b3.getzaehler());
	}
}
