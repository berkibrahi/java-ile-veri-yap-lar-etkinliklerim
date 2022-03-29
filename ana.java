
public class ana {

	public static void main(String[] args) {
		sýnýf a=new sýnýf();
		sýnýf b=new sýnýf();
		sýnýf c=new sýnýf();
		a.sayý=4;
		b.sayý=5;
		c.sayý=6;
		a.ok=b;
		b.ok=c;
		c.ok=null;
		sýnýf temp=a;
		while(temp!=null) {
			System.out.println(temp.sayý);
			temp=temp.ok;
		}
	}

}
