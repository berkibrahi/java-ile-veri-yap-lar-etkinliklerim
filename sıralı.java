
public class s�ral� {
	d���m ba� = null;
	d���m son=null;
	d���m a=null;
	d���m b;
	d���m temp2;
	d���m temp;
	
	void s�raliekle(int x) {
			d���m yenid�m=new d���m();
			yenid�m.veri=x;
			yenid�m.next=null;
			if(ba�==null) {
				ba�=yenid�m;
				son=yenid�m;
				System.out.println("liste olu�turuldu ve ilk d���m olu�turuldu");
			}
			else {
			if(ba�.veri>yenid�m.veri) {
				yenid�m.next=ba�;
				ba�=yenid�m;
				System.out.println("listenin ba�ina yeni d���m eklendi");
			}
			
			else
				
			{ b=ba�;
				a=ba�;
			while(a.next!=null && yenid�m.veri >a.veri) {
				b=a;
				a=a.next;}
			
					
			}if(yenid�m.veri>=b.veri && yenid�m.veri<=a.veri && a.next!=null ) {
			yenid�m.next=a;
			b.next=yenid�m;
				
				
			}
			
		
				
			yenid�m.next=a;
			b.next=yenid�m;
			
			}
			}
		void ikis�ral�ekle(int x)
		{
			d���m yenid�m=new d���m();
			yenid�m.veri=x;
			yenid�m.next=null;
			yenid�m.�n=null;
			if(ba�==null) {
				ba�=yenid�m;
				son=yenid�m;
				System.out.println("liste olu�turuldu ve ilk d���m olu�turuldu");
			}
			else if(yenid�m.veri<ba�.veri) {
		 
				yenid�m.next=ba�;
				ba�.�n=yenid�m;
				ba�=yenid�m;
				System.out.println("listenin ba�ina yeni d���m eklendi");
			}
		
			else
				
			{
				 temp=ba�;
				
			while(temp.next!=null && yenid�m.veri >temp.next.veri) {
			
				temp=temp.next;}
		if(temp.next==null){
			temp.next=yenid�m;
			yenid�m.�n=temp;
			son=yenid�m;
		}else {
		
		
			
			yenid�m.next=temp.next;
			temp.next.�n=yenid�m;
			yenid�m.�n=temp;
			temp.next=yenid�m;
			
			
		}
			}
		}
			
			
		

		void yazd�r() {
			
			d���m temp=ba�;
			while(temp!=null) {
				System.out.print(temp.veri +" ");
				temp=temp.next;
			}
		}
	void sonyazd�r() {
			
			d���m temp=son;
			while(temp!=null) {
				System.out.print(temp.veri +" ");
				temp=temp.�n;
			}
		}
}
