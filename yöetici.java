package ibob;

public class y�etici extends i�veren {
private  int i�verenn_numaras�;
	public y�etici(String ad, int maas, int id,int i�verenn_numaras�)  {
		super(ad,maas,id);
		this.i�verenn_numaras�=i�verenn_numaras�;
	}
	public void zam(int miktar) {
		System.out.println("�al��anlara"+miktar+"zam yap�ld�");
	}
	@Override
	public void yazd�rma() {
		System.out.println("ki�i say�s�:"+this.i�verenn_numaras�);
		System.out.println(""+getAd());
		System.out.println(""+getId());
		System.out.println(""+getMaas());
	}
	public int getI�verenn_numaras�() {
		return i�verenn_numaras�;
	}
	public void setI�verenn_numaras�(int i�verenn_numaras�) {
		this.i�verenn_numaras� = i�verenn_numaras�;
	}
	@Override
	public String toString() {
		return "ibonun cal��masi";
	}
	

}
