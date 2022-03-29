
public class çiftliste {
	çiftnod baþ=null;
	çiftnod son=null;
	void basaekle(int veri) {
		çiftnod yeni=new çiftnod(veri);
	
		
		if(baþ==null) {
			
			baþ=yeni;
			son=yeni;
		}
		else {
			yeni.sonraki=baþ;
			baþ.önceki=yeni;
			baþ=yeni;
			
		}
	}
	void sonaekle(int veri) {
		çiftnod yeni=new çiftnod(veri);
	
		
		if(baþ==null) {
			
			
			baþ=yeni;
			son=yeni;
		}
		else {
			
			son.sonraki=yeni;
			yeni.önceki=son;
			son=yeni;
			
		}
	}
	void arayaekle(int indis,int veri) {
		çiftnod yeni=new çiftnod(veri);
		
		if(baþ==null && indis==0) {
			
			baþ=yeni;
			son=yeni;
			
		}
		else if(baþ!=null && indis==0) {
			yeni.sonraki=baþ;
			baþ.önceki=yeni;
			baþ=yeni;
			
		}
		else {
			int n=0;
			çiftnod temp2=baþ;
			çiftnod temp=baþ;
			while(temp.sonraki!=null) {
				
			temp2=temp;
				temp=temp.sonraki;
				n++;
			}
			
			if(n==indis){
				
				
				yeni.sonraki=temp;
				temp.önceki=yeni;
				temp2.sonraki=yeni;
				yeni.önceki=temp2;
				
				
				
			}
			else {
				
				temp=baþ;
				int i=0;
				while(i!=indis) {
					temp2=temp;
					temp=temp.sonraki;
					i++;
				}
			

				yeni.sonraki=temp;
				temp.önceki=yeni;
				temp2.sonraki=yeni;
				yeni.önceki=temp2;
					
				
			}
				
		}
	}
void baþtansil() {
if(baþ==null) {
	System.out.println("silinecek eleman yoktur");
}else if(baþ.önceki==null&&baþ.sonraki==null) {
	baþ=null;
	son=null;
	
}else {
	baþ=baþ.sonraki;
	baþ.önceki=null;
}
}
void sondansil() {
	if(son.önceki==null&&son.sonraki==null) {
	son=null;
	baþ=null;
	}else {
		son=son.önceki;
		son.sonraki=null;
	}
}
void çaradansilme(int indis) {
	if(baþ==null) {
		System.out.println("silinecek eleman yok");
	}
	else if(baþ.sonraki==null && indis==0 && baþ.önceki==null) {
		baþ=null;
		son=null;
	}
	else if(baþ.sonraki!=null && indis==0 && baþ.önceki==null) {
		baþ=baþ.sonraki;
		baþ.önceki=null;
	}
	else {
		çiftnod temp2=baþ;
		çiftnod temp=baþ;
		int i=0;
		while(temp.sonraki!=null) {
			i++;
			temp2=temp;
			temp=temp.sonraki;
			
		}
		if(i==indis) {
			sondansil();
			
		}
		else {temp2=baþ;
		 temp=baþ;
		 int j=0;
			while(j!=indis) {
				temp2=temp;
				temp=temp.sonraki;
				j++;
			}
			temp2.sonraki=temp.sonraki;
		temp.sonraki.önceki=temp2;
		
			
		}
	}
}
void yazdýr() {
	
	çiftnod temp=baþ;
	while(temp!=null) {
		System.out.print(temp.veri+ "  ");
		temp=temp.sonraki;
	}
}
void sondanyazdýr() {
	
	çiftnod temp=son;
	while(temp!=null) {
		System.out.print(temp.veri+ "  ");
		temp=temp.önceki;
	}
}
}