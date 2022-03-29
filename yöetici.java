package ibob;

public class yöetici extends işveren {
private  int işverenn_numarası;
	public yöetici(String ad, int maas, int id,int işverenn_numarası)  {
		super(ad,maas,id);
		this.işverenn_numarası=işverenn_numarası;
	}
	public void zam(int miktar) {
		System.out.println("çalışanlara"+miktar+"zam yapıldı");
	}
	@Override
	public void yazdırma() {
		System.out.println("kişi sayısı:"+this.işverenn_numarası);
		System.out.println(""+getAd());
		System.out.println(""+getId());
		System.out.println(""+getMaas());
	}
	public int getIşverenn_numarası() {
		return işverenn_numarası;
	}
	public void setIşverenn_numarası(int işverenn_numarası) {
		this.işverenn_numarası = işverenn_numarası;
	}
	@Override
	public String toString() {
		return "ibonun calışmasi";
	}
	

}
