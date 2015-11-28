
public class Demo {

	public static void main(String[] args) {
		//generiert den Bruch b1
		Bruch b1 = new Bruch(2, 4); 
		
		//Ruft die print Funktion mit b1 (Bruch 1) auf
		b1.print();
		//gibt mir auf wie oft schon ein Bruch erstellt wurde, Counter im Konstruktor
		System.out.println("Aufrufe: " + Bruch.counter);
		
		//ruft für den Bruch b1 die umrechnung zu dezimal auf
		System.out.println(b1.toDecimal());

		b1.print();

		Bruch b2 = new Bruch(5, 7);
		System.out.println("Aufrufe: " + Bruch.counter);

		Bruch erg = b1.multiplicate(b2);
		erg.print();

		Bruch b3 = new Bruch(1, 2);
		System.out.println("Aufrufe: " + Bruch.counter);

		Bruch erg2 = b1.multiplicate(b2, b3);
		erg2.print();
		// Klassenname. Wert Merke!!!
		System.out.println("Aufrufe: " + Bruch.counter);
	}

}
