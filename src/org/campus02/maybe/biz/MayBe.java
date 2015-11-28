package org.campus02.maybe.biz;

public class MayBe <T> {
	private T data;
	private int status;
	
	public static final int ZugriffErlaubt = 1;
	public static final int ZugriffVerboten = 2;
	public static final int NichtVorhanden = 3;
	
	public MayBe(T data, int status) {
		this.data = data;
		this.status = status;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public void print(){
		switch (status){
		case ZugriffErlaubt:
			System.out.println("Zugriff erlaubt, Daten: "+data);
			break;
		case ZugriffVerboten:
			System.out.println("Zugriff verweigert");
			break;
		case NichtVorhanden:
			System.out.println("Keine Daten Vorhanden");
			break;
		}
	}
	
	
}
