
public class �grnode {
	String isim;
	String soyism;
	int numara;
	int vize;
	int fin;
	double ort;
	String durum;
	�grnode next;
	public �grnode(String isim, String soyism, int numara, int vize, int fin) {
		
		this.isim = isim;
		this.soyism = soyism;
		this.numara = numara;
		this.vize = vize;
		this.fin = fin;
		ort=vize*0.4+fin*0.6;
		if(ort>=50) {
		durum="ge�ti";
		}else {
			durum="kald�";
		}
		next=null;
	}

}
