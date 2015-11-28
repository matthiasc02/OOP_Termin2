package org.campus02.zinsen.biz;

public class ZinsenRechnen {
	double Geldbetrag;
	double Laufzeit;
	double Zinssatz;
	
	public ZinsenRechnen(double Geldbetrag, double Laufzeit, double Zinssatz){
		this.Geldbetrag=Geldbetrag;
		this.Laufzeit=Laufzeit;
		this.Zinssatz=Zinssatz;
	}
	
	public double Zinsen(){
		double Zinsen=(Geldbetrag*Laufzeit*Zinssatz)/36000.0;
		return Zinsen;
	}

}
