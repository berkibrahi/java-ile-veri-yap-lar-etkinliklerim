
public class listeyap�s� {
	d���m ba� = null;

void ekle(int x) {
		d���m yenid�m=new d���m();
		yenid�m.veri=x;
		yenid�m.next=null;
		if(ba�==null) {
			ba�=yenid�m;
			System.out.println("liste olu�turuldu ve ilk d���m olu�turuldu");
		}
		else {
			yenid�m.next=ba�;
			ba�=yenid�m;
			System.out.println("listenin ba�ina yeni d���m eklendi");
		}
	}
	void yazd�r() {
		
		d���m temp=ba�;
		while(temp!=null) {
			System.out.println(temp.veri);
			temp=temp.next;
		}
	}
}
