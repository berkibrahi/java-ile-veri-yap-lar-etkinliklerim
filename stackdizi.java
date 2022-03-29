package stack;

public class stackdizi {
	int dizi[];
	int indis;
	int size;
	public stackdizi(int size) {
		
		this.size = size;
		dizi=new int[size];
		indis=-1;
	}
	void push(int deger) {
		if(dol()) {
			System.out.println("yigin dolodur");
			return ;
		}
		indis++;
		dizi[indis]=deger;
		System.out.println("= " + dizi[indis]);
		
	}
	int pop() {
		
			if(!bos()) {
	
		return	dizi[indis--];
		
			}
			System.out.println("bostur");
return 0;
	}
		boolean dol(){
			return (indis==size-1) ;
				
		
		}
		boolean bos() {
			return indis==-1;
		}
	

		}
