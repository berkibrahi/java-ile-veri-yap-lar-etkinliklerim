package daireselbagl�;

public class daireselliste {
nod ba�=null;
nod son= null;
void dbasaekle(int x) {
	nod yeni=new nod(x);
	
	
	
	if(ba�==null) {
		
		ba�=yeni;
		son=yeni;
		son.next=ba�;
	}
	else {
		yeni.next=ba�;
		ba�=yeni;
		son.next=ba�;
		
	}
	
}
void dsonaekle(int x) {
	nod yeni=new nod(x);
	
	
	
	if(ba�==null) {
		
		ba�=yeni;
		son=yeni;
		son.next=ba�;
	}
	else {
		son.next=yeni;
		son=yeni;
		son.next=ba�;
		
	}
	
}
void idarayaekle(int indis,int x) {
	nod yeni=new nod(x);
	
	if(ba�==null && indis==0) {
		
		
		ba�=yeni;
		son=yeni;
		son.next=ba�;
	}
	else if(ba�!=null && indis==0) {
		yeni.next=ba�;
		ba�=yeni;
		son.next=ba�;
	}
	else {
		int n=0;
		nod temp2=ba�;
		nod temp=ba�;
		while(temp!=son) {
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
void dbasasil() {
	
	
	
	
	if(ba�==null) {
		
		System.out.println("silincek yok");
	}
	else if(ba�==son) {
		ba�=null;
		son=null;
	}
	else {
		ba�=ba�.next;
		
		son.next=ba�;
		
	}
	
}
void sonsilme(){
	if(ba�==null) {
		System.out.println("silinecek eleman yok");
	}
	else if(ba�==son){
		ba�=null;
		son=null;
		
	}
	else {
		nod temp2=ba�;
		nod temp=ba�;
		while(temp!=son) {
			temp2=temp;
			temp=temp.next;
		}
		son=temp2;
		son.next=ba�;
		
	}
}
void aradansilme(int indis) {
	if(ba�==null) {
		System.out.println("silinecek eleman yok");
	}
	else if(ba�==son && indis==0) {
		ba�=null;
		son=null;
	}
	else if(ba�!=son && indis==0) {
		ba�=ba�.next;
		son.next=ba�;
	}
	else {
		nod temp2=ba�;
		nod temp=ba�;
		int i=0;
		while(temp!=son) {
			i++;
			temp2=temp;
			temp=temp.next;
			
		}
		if(i==indis) {
			son=temp2;
			son.next=ba�;
			
			
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
void yazd�r() {
	
	nod temp=ba�;
	while(temp!=son) {
		System.out.print(temp.x+ "  ");
		temp=temp.next;
		
	}
	if(ba�!=null) {
		System.out.print(temp.x+ "  ");
	}
	
}
}
