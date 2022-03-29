
public class liste {
	node baþ=null;
	node son=null;
	void basaekle(int x) {
		node yeni=new node();
		yeni.veri=x;
		
		if(baþ==null) {
			yeni.next=null;
			baþ=yeni;
			son=yeni;
		}
		else {
			yeni.next=baþ;
			baþ=yeni;
			
		}
		
	}
	void sonaekle(int x) {
		node yeni=new node();
		yeni.veri=x;
		
		if(baþ==null) {
			yeni.next=null;
			baþ=yeni;
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
		if(baþ==null && indis==0) {
			
			yeni.next=null;
			baþ=yeni;
			son=yeni;
		}
		else if(baþ!=null && indis==0) {
			yeni.next=baþ;
			baþ=yeni;
			
		}
		else {
			int n=0;
			node temp2=baþ;
			node temp=baþ;
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
				temp2=baþ;
				temp=baþ;
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
	void baþsilme() {
		if(baþ==null) {
			System.out.println("silinecek eleman yok");
		}
		else if(baþ.next==null) {
			baþ=null;
			
		}
		else {
			baþ=baþ.next;
		}
	}
	void sonsilme(){
		if(baþ==null) {
			System.out.println("silinecek eleman yok");
		}
		else if(baþ.next==null){
			baþ=null;
			son=null;
			
		}
		else {
			node temp2=baþ;
			node temp=baþ;
			while(temp.next!=null) {
				temp2=temp;
				temp=temp.next;
			}
			temp2.next=null;
			son=temp2;
		}
	}
	void aradansilme(int indis) {
		if(baþ==null) {
			System.out.println("silinecek eleman yok");
		}
		else if(baþ.next==null && indis==0) {
			baþ=null;
		}
		else if(baþ.next!=null && indis==0) {
			baþ=baþ.next;
		}
		else {
			node temp2=baþ;
			node temp=baþ;
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
			else {temp2=baþ;
			 temp=baþ;
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
		
		if(baþ==null) {
			
			baþ=yeni;
			son=yeni;
			
		}
		else {
			yeni.next=baþ;
			baþ=yeni;
			son.next=baþ;
			
		}
		
	}
void yazdýr() {
		
		node temp=baþ;
		while(temp!=null) {
			System.out.print(temp.veri+ "  ");
			temp=temp.next;
		}
	}
}
