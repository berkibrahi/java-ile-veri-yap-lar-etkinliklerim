package ibob;

public class ib {
	 public static void main(String args[]) {
		/* ibobb deger1= new ibobb(1,2,"ali");
		 ibobb deger2= new ibobb();
		 ibobb deger3= new ibobb(5);
		 ibobb deger2=deger;
		 deger.yazd�rma();
		 deger2.yazd�rma();
		 deger3.yazd�rma();*/
		 ibobb deger1= new ibobb(1,2,"ali");
		 ibobb deger2=deger1;
		 deger1.yazd�rma();
		 String s1=new String("anne");
		 String s2=new String("anne");
		 if(s1.equals(s2)) {
			 System.out.println("e�it");
		 }
		 else
			 System.out.println("e�it de�il");
	 }

}
