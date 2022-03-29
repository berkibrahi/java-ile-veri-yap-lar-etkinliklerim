package daireselbaglý;

public class daireselliste {
nod baþ=null;
nod son= null;
void dbasaekle(int x) {
	nod yeni=new nod(x);
	
	
	
	if(baþ==null) {
		
		baþ=yeni;
		son=yeni;
		son.next=baþ;
	}
	else {
		yeni.next=baþ;
		baþ=yeni;
		son.next=baþ;
		
	}
	
}
void dsonaekle(int x) {
	nod yeni=new nod(x);
	
	
	
	if(baþ==null) {
		
		baþ=yeni;
		son=yeni;
		son.next=baþ;
	}
	else {
		son.next=yeni;
		son=yeni;
		son.next=baþ;
		
	}
	
}
void idarayaekle(int indis,int x) {
	nod yeni=new nod(x);
	
	if(baþ==null && indis==0) {
		
		
		baþ=yeni;
		son=yeni;
		son.next=baþ;
	}
	else if(baþ!=null && indis==0) {
		yeni.next=baþ;
		baþ=yeni;
		son.next=baþ;
	}
	else {
		int n=0;
		nod temp2=baþ;
		nod temp=baþ;
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
void dbasasil() {
	
	
	
	
	if(baþ==null) {
		
		System.out.println("silincek yok");
	}
	else if(baþ==son) {
		baþ=null;
		son=null;
	}
	else {
		baþ=baþ.next;
		
		son.next=baþ;
		
	}
	
}
void sonsilme(){
	if(baþ==null) {
		System.out.println("silinecek eleman yok");
	}
	else if(baþ==son){
		baþ=null;
		son=null;
		
	}
	else {
		nod temp2=baþ;
		nod temp=baþ;
		while(temp!=son) {
			temp2=temp;
			temp=temp.next;
		}
		son=temp2;
		son.next=baþ;
		
	}
}
void aradansilme(int indis) {
	if(baþ==null) {
		System.out.println("silinecek eleman yok");
	}
	else if(baþ==son && indis==0) {
		baþ=null;
		son=null;
	}
	else if(baþ!=son && indis==0) {
		baþ=baþ.next;
		son.next=baþ;
	}
	else {
		nod temp2=baþ;
		nod temp=baþ;
		int i=0;
		while(temp!=son) {
			i++;
			temp2=temp;
			temp=temp.next;
			
		}
		if(i==indis) {
			son=temp2;
			son.next=baþ;
			
			
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
void yazdýr() {
	
	nod temp=baþ;
	while(temp!=son) {
		System.out.print(temp.x+ "  ");
		temp=temp.next;
		
	}
	if(baþ!=null) {
		System.out.print(temp.x+ "  ");
	}
	
}
}
