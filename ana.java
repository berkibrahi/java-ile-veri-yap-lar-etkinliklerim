
public class ana {

	public static void main(String[] args) {
		s�n�f a=new s�n�f();
		s�n�f b=new s�n�f();
		s�n�f c=new s�n�f();
		a.say�=4;
		b.say�=5;
		c.say�=6;
		a.ok=b;
		b.ok=c;
		c.ok=null;
		s�n�f temp=a;
		while(temp!=null) {
			System.out.println(temp.say�);
			temp=temp.ok;
		}
	}

}
