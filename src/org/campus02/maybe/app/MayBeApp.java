package org.campus02.maybe.app;

import java.util.GregorianCalendar;

import org.campus02.maybe.biz.MayBe;

public class MayBeApp {

	public static void main(String[] args) {
		
		MayBe<String> wert1 = new MayBe<String>(new String ("Martin"),MayBe.ZugriffErlaubt);
		//MayBe<String> wert1 = new MayBe<String>("Martin",1);
		
		//ohne Konsturktor so zu machen, wenn Konstruktor Daten direkt bei der Eingabe
		//wert1.setData("Martin");
		//wert1.setStatus(1);
		wert1.print();
		
		MayBe<Integer> gehalt= new MayBe<Integer>(new Integer (4340),MayBe.ZugriffVerboten);
		//MayBe<Integer> gehalt= new MayBe<Integer>(4340,2);
		
		//ohne Konsturktor so zu machen, wenn Konstruktor Daten direkt bei der Eingabe
		//gehalt.setData(4340);
		//gehalt.setStatus(2);		
		gehalt.print();
	}

}
