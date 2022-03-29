package ibob;

import java.util.Scanner;

public class ibob {
	 public static void main(String args[]) {
		 ibo ibo1=new ibo();
		ibo1.seta(0);
		ibo1.setB(1.8);
		ibo1.setC("ibor");
		/* ibo1.a=5;
		 ibo1.b=1.4;
		 ibo1.c="ibo";
		 System.out.println(""+ ibo1.a);
		System.out.println(""+ ibo1.b);
	 System.out.println(""+ ibo1.c);
		//ibo1.ana();*/
		System.out.println(""+ibo1.geta());
		System.out.println(""+ibo1.getB());
		System.out.println(""+ibo1.getC());
		Scanner ad=new Scanner(System.in);
		String z=ad.nextLine();
	 }
}
