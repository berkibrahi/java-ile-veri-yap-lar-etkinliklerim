package ibob;

public class iþveren {
	private String ad;
	private int maas;
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int id;
	public iþveren(String ad, int maas, int id) {
		super();
		this.ad = ad;
		this.maas = maas;
		this.id = id;
	}
	public void yazdýrma() {
		System.out.println(""+this.ad);
		System.out.println(""+this.id);
		System.out.println(""+this.maas);
	}

}
