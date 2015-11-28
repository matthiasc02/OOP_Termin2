package org.campus02.zinsen.app;

import org.campus02.zinsen.biz.ZinsenRechnen;

public class DemoZinsen {

	public static void main(String[] args) {
		
		ZinsenRechnen Wert1 = new ZinsenRechnen (10000.0,365.0,0.75);
		System.out.println(Wert1.Zinsen());
		
		ZinsenRechnen Wert2 = new ZinsenRechnen (100000.0,365.0,1.15);
		System.out.println(Wert2.Zinsen());
		
		

	}

}
