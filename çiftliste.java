
public class �iftliste {
	�iftnod ba�=null;
	�iftnod son=null;
	void basaekle(int veri) {
		�iftnod yeni=new �iftnod(veri);
	
		
		if(ba�==null) {
			
			ba�=yeni;
			son=yeni;
		}
		else {
			yeni.sonraki=ba�;
			ba�.�nceki=yeni;
			ba�=yeni;
			
		}
	}
	void sonaekle(int veri) {
		�iftnod yeni=new �iftnod(veri);
	
		
		if(ba�==null) {
			
			
			ba�=yeni;
			son=yeni;
		}
		else {
			
			son.sonraki=yeni;
			yeni.�nceki=son;
			son=yeni;
			
		}
	}
	void arayaekle(int indis,int veri) {
		�iftnod yeni=new �iftnod(veri);
		
		if(ba�==null && indis==0) {
			
			ba�=yeni;
			son=yeni;
			
		}
		else if(ba�!=null && indis==0) {
			yeni.sonraki=ba�;
			ba�.�nceki=yeni;
			ba�=yeni;
			
		}
		else {
			int n=0;
			�iftnod temp2=ba�;
			�iftnod temp=ba�;
			while(temp.sonraki!=null) {
				
			temp2=temp;
				temp=temp.sonraki;
				n++;
			}
			
			if(n==indis){
				
				
				yeni.sonraki=temp;
				temp.�nceki=yeni;
				temp2.sonraki=yeni;
				yeni.�nceki=temp2;
				
				
				
			}
			else {
				
				temp=ba�;
				int i=0;
				while(i!=indis) {
					temp2=temp;
					temp=temp.sonraki;
					i++;
				}
			

				yeni.sonraki=temp;
				temp.�nceki=yeni;
				temp2.sonraki=yeni;
				yeni.�nceki=temp2;
					
				
			}
				
		}
	}
void ba�tansil() {
if(ba�==null) {
	System.out.println("silinecek eleman yoktur");
}else if(ba�.�nceki==null&&ba�.sonraki==null) {
	ba�=null;
	son=null;
	
}else {
	ba�=ba�.sonraki;
	ba�.�nceki=null;
}
}
void sondansil() {
	if(son.�nceki==null&&son.sonraki==null) {
	son=null;
	ba�=null;
	}else {
		son=son.�nceki;
		son.sonraki=null;
	}
}
void �aradansilme(int indis) {
	if(ba�==null) {
		System.out.println("silinecek eleman yok");
	}
	else if(ba�.sonraki==null && indis==0 && ba�.�nceki==null) {
		ba�=null;
		son=null;
	}
	else if(ba�.sonraki!=null && indis==0 && ba�.�nceki==null) {
		ba�=ba�.sonraki;
		ba�.�nceki=null;
	}
	else {
		�iftnod temp2=ba�;
		�iftnod temp=ba�;
		int i=0;
		while(temp.sonraki!=null) {
			i++;
			temp2=temp;
			temp=temp.sonraki;
			
		}
		if(i==indis) {
			sondansil();
			
		}
		else {temp2=ba�;
		 temp=ba�;
		 int j=0;
			while(j!=indis) {
				temp2=temp;
				temp=temp.sonraki;
				j++;
			}
			temp2.sonraki=temp.sonraki;
		temp.sonraki.�nceki=temp2;
		
			
		}
	}
}
void yazd�r() {
	
	�iftnod temp=ba�;
	while(temp!=null) {
		System.out.print(temp.veri+ "  ");
		temp=temp.sonraki;
	}
}
void sondanyazd�r() {
	
	�iftnod temp=son;
	while(temp!=null) {
		System.out.print(temp.veri+ "  ");
		temp=temp.�nceki;
	}
}
}