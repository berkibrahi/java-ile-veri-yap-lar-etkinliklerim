
public class listeyapýsý {
	düðüm baþ = null;

void ekle(int x) {
		düðüm yenidüm=new düðüm();
		yenidüm.veri=x;
		yenidüm.next=null;
		if(baþ==null) {
			baþ=yenidüm;
			System.out.println("liste oluþturuldu ve ilk düðüm oluþturuldu");
		}
		else {
			yenidüm.next=baþ;
			baþ=yenidüm;
			System.out.println("listenin baþina yeni düðüm eklendi");
		}
	}
	void yazdýr() {
		
		düðüm temp=baþ;
		while(temp!=null) {
			System.out.println(temp.veri);
			temp=temp.next;
		}
	}
}
