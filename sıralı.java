
public class sýralý {
	düðüm baþ = null;
	düðüm son=null;
	düðüm a=null;
	düðüm b;
	düðüm temp2;
	düðüm temp;
	
	void sýraliekle(int x) {
			düðüm yenidüm=new düðüm();
			yenidüm.veri=x;
			yenidüm.next=null;
			if(baþ==null) {
				baþ=yenidüm;
				son=yenidüm;
				System.out.println("liste oluþturuldu ve ilk düðüm oluþturuldu");
			}
			else {
			if(baþ.veri>yenidüm.veri) {
				yenidüm.next=baþ;
				baþ=yenidüm;
				System.out.println("listenin baþina yeni düðüm eklendi");
			}
			
			else
				
			{ b=baþ;
				a=baþ;
			while(a.next!=null && yenidüm.veri >a.veri) {
				b=a;
				a=a.next;}
			
					
			}if(yenidüm.veri>=b.veri && yenidüm.veri<=a.veri && a.next!=null ) {
			yenidüm.next=a;
			b.next=yenidüm;
				
				
			}
			
		
				
			yenidüm.next=a;
			b.next=yenidüm;
			
			}
			}
		void ikisýralýekle(int x)
		{
			düðüm yenidüm=new düðüm();
			yenidüm.veri=x;
			yenidüm.next=null;
			yenidüm.ön=null;
			if(baþ==null) {
				baþ=yenidüm;
				son=yenidüm;
				System.out.println("liste oluþturuldu ve ilk düðüm oluþturuldu");
			}
			else if(yenidüm.veri<baþ.veri) {
		 
				yenidüm.next=baþ;
				baþ.ön=yenidüm;
				baþ=yenidüm;
				System.out.println("listenin baþina yeni düðüm eklendi");
			}
		
			else
				
			{
				 temp=baþ;
				
			while(temp.next!=null && yenidüm.veri >temp.next.veri) {
			
				temp=temp.next;}
		if(temp.next==null){
			temp.next=yenidüm;
			yenidüm.ön=temp;
			son=yenidüm;
		}else {
		
		
			
			yenidüm.next=temp.next;
			temp.next.ön=yenidüm;
			yenidüm.ön=temp;
			temp.next=yenidüm;
			
			
		}
			}
		}
			
			
		

		void yazdýr() {
			
			düðüm temp=baþ;
			while(temp!=null) {
				System.out.print(temp.veri +" ");
				temp=temp.next;
			}
		}
	void sonyazdýr() {
			
			düðüm temp=son;
			while(temp!=null) {
				System.out.print(temp.veri +" ");
				temp=temp.ön;
			}
		}
}
