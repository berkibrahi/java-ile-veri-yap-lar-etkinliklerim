
public class liste {
	node ba�=null;
	node son=null;
	void basaekle(int x) {
		node yeni=new node();
		yeni.veri=x;
		
		if(ba�==null) {
			yeni.next=null;
			ba�=yeni;
			son=yeni;
		}
		else {
			yeni.next=ba�;
			ba�=yeni;
			
		}
		
	}
	void sonaekle(int x) {
		node yeni=new node();
		yeni.veri=x;
		
		if(ba�==null) {
			yeni.next=null;
			ba�=yeni;
			son=yeni;
		}
		else {
			yeni.next=null;
			son.next=yeni;
			son=yeni;
			
		}
	}
	void arayaekle(int indis,int x) {
		node yeni=new node();
		yeni.veri=x;
		if(ba�==null && indis==0) {
			
			yeni.next=null;
			ba�=yeni;
			son=yeni;
		}
		else if(ba�!=null && indis==0) {
			yeni.next=ba�;
			ba�=yeni;
			
		}
		else {
			int n=0;
			node temp2=ba�;
			node temp=ba�;
			while(temp.next!=null) {
				n++;
				temp2=temp;
				temp=temp.next;
				
			}
			
			if(n==indis){
				
				yeni.next=temp;
				temp2.next=yeni;
				
				
			}
			else {
				temp2=ba�;
				temp=ba�;
				int i=0;
				while(i!=indis) {
					temp2=temp;
					temp=temp.next;
					i++;
				}
				
				yeni.next=temp;
				temp2.next=yeni;
					
					
				
			}
				
		}
	}
	void ba�silme() {
		if(ba�==null) {
			System.out.println("silinecek eleman yok");
		}
		else if(ba�.next==null) {
			ba�=null;
			
		}
		else {
			ba�=ba�.next;
		}
	}
	void sonsilme(){
		if(ba�==null) {
			System.out.println("silinecek eleman yok");
		}
		else if(ba�.next==null){
			ba�=null;
			son=null;
			
		}
		else {
			node temp2=ba�;
			node temp=ba�;
			while(temp.next!=null) {
				temp2=temp;
				temp=temp.next;
			}
			temp2.next=null;
			son=temp2;
		}
	}
	void aradansilme(int indis) {
		if(ba�==null) {
			System.out.println("silinecek eleman yok");
		}
		else if(ba�.next==null && indis==0) {
			ba�=null;
		}
		else if(ba�.next!=null && indis==0) {
			ba�=ba�.next;
		}
		else {
			node temp2=ba�;
			node temp=ba�;
			int i=0;
			while(temp.next!=null) {
				i++;
				temp2=temp;
				temp=temp.next;
				
			}
			if(i==indis) {
				temp2.next=null;
				temp2=son;
				
			}
			else {temp2=ba�;
			 temp=ba�;
			 int j=0;
				while(j!=indis) {
					temp2=temp;
					temp=temp.next;
					j++;
				}
				temp2.next=temp.next;
			
				
			}
		}
	}
	void dbasaekle(int x) {
		node yeni=new node();
		
		yeni.veri=x;
		yeni.next=null;
		
		if(ba�==null) {
			
			ba�=yeni;
			son=yeni;
			
		}
		else {
			yeni.next=ba�;
			ba�=yeni;
			son.next=ba�;
			
		}
		
	}
void yazd�r() {
		
		node temp=ba�;
		while(temp!=null) {
			System.out.print(temp.veri+ "  ");
			temp=temp.next;
		}
	}
}
