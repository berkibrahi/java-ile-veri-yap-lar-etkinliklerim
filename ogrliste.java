import java.util.Scanner;

public class ogrliste {
	�grnode ba�=null;
	�grnode son=null;
	�grnode temp=null;
	�grnode temp2=null;
	String isim;
	String soyism;
	int numara;
	int vize;
	int fin;
	double ort;
	String durum;
	
	Scanner scan=new Scanner(System.in);
	
	void ekle() {




		System.out.println("yaz�l�m m�hensli�i ��rencileri bilgilerini giriniz ");
		
		System.out.println("ad:");isim=scan.nextLine();
		System.out.println("soyad:");soyism=scan.nextLine();
		System.out.println("no:");numara=scan.nextInt();
		System.out.println("vizenotu:");vize=scan.nextInt();
		System.out.println("finalnotu:");fin=scan.nextInt();
		
		�grnode yeni=new �grnode(isim,soyism, numara, vize, fin);
		if(ba�==null) {
			ba�=yeni;
			System.out.println("ilk ��renci kayd� olu�turuldu");
		}
	
		else {
			yeni.next=ba�;
			ba�=yeni;
			System.out.println(numara + "��renci listeye eklendi");
		}
		
	}
	void sil() {
		if(ba�==null) {
			System.out.println("liste kayd� bo�tur");
		}
		else {
			System.out.println("silmek istedi�niz �prenci nosu:");
			numara=scan.nextInt();
			if(numara==ba�.numara && ba�.next==null) {
				ba�=null;
			}
			else if(numara==ba�.numara && ba�.next!=null) {
				ba�=ba�.next;
				
			}else {
				temp=ba�;
				temp2=ba�;
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
	if(ba�==null) {
		System.out.println("yazdur�lacak bi�ey yok");
	}
	else {
		
		 temp=ba�;
		while(temp!=null) {
			System.out.print(temp.numara+ "l� ��renci bilgikeri  ");
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
