
public class Bruch {
	private int nenner;
	private int zaehler;
	
	public Bruch(int zaehler, int nenner)
	{
		this.nenner=nenner;
		this.zaehler=zaehler;
	}
	
	public int getnenner()
	{
		return nenner;
	}
	
	public int getzaehler()
	{
		return zaehler;
	}
	
	public void print()
	{
		System.out.println(zaehler+"/"+nenner);
	}
	
	public double toDezimal()
	{
		double wert = (double)zaehler/nenner;
		return wert;
	}
	
	public Bruch multiplicate(Bruch b2)
	{
		int nennerneu = this.nenner*b2.getnenner();
		int zaehlerneu = this.zaehler*b2.getzaehler();
		Bruch bx1 = new Bruch(zaehlerneu,nennerneu);
		return bx1;
	}
	


}
