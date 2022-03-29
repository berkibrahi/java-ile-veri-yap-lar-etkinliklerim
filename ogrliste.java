import java.util.Scanner;

public class ogrliste {
	ögrnode baþ=null;
	ögrnode son=null;
	ögrnode temp=null;
	ögrnode temp2=null;
	String isim;
	String soyism;
	int numara;
	int vize;
	int fin;
	double ort;
	String durum;
	
	Scanner scan=new Scanner(System.in);
	
	void ekle() {




		System.out.println("yazýlým mühensliði öðrencileri bilgilerini giriniz ");
		
		System.out.println("ad:");isim=scan.nextLine();
		System.out.println("soyad:");soyism=scan.nextLine();
		System.out.println("no:");numara=scan.nextInt();
		System.out.println("vizenotu:");vize=scan.nextInt();
		System.out.println("finalnotu:");fin=scan.nextInt();
		
		ögrnode yeni=new ögrnode(isim,soyism, numara, vize, fin);
		if(baþ==null) {
			baþ=yeni;
			System.out.println("ilk öðrenci kaydý oluþturuldu");
		}
	
		else {
			yeni.next=baþ;
			baþ=yeni;
			System.out.println(numara + "öðrenci listeye eklendi");
		}
		
	}
	void sil() {
		if(baþ==null) {
			System.out.println("liste kaydý boþtur");
		}
		else {
			System.out.println("silmek istediðniz öprenci nosu:");
			numara=scan.nextInt();
			if(numara==baþ.numara && baþ.next==null) {
				baþ=null;
			}
			else if(numara==baþ.numara && baþ.next!=null) {
				baþ=baþ.next;
				
			}else {
				temp=baþ;
				temp2=baþ;
				while(temp.next!=null) {
					
					if(numara==temp.numara) {
						temp2.next=temp.next;}
					
						temp2=temp;
						temp=temp.next;
						
					}
					if(numara==temp.numara) {
						temp2.next=null;
						temp2=son;
						
					}
					
				
				}
			}
				
		}
	
void yaz() {
	if(baþ==null) {
		System.out.println("yazdurýlacak biþey yok");
	}
	else {
		
		 temp=baþ;
		while(temp!=null) {
			System.out.print(temp.numara+ "lý öðrenci bilgikeri  ");
			System.out.println("----------------------------------");
			System.out.println("ad"+temp.isim);
			System.out.println("soyadad"+temp.soyism);
			System.out.println("vize" + temp.vize);
			System.out.println("final" + temp.fin);
			System.out.println("durum "+ temp.durum);
			System.out.println("ort"+ temp.ort);
			System.out.println("----------------------------------");
			temp=temp.next;
	}
}
}
}
