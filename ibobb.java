package ibob;

public class ibobb {
	public int a;
	public double b;
	public String c;
 public ibobb(int a,double b,String c){
	 
	 this.a=a;
	 this.b=b;
	 this.c=c;
 }
 public ibobb() {
	// this.a=45;
	//this.b=	70; 
	// this.c="mvf�lv";
	 this(12,23,"selda");
 }
 public ibobb(int a) {
	 this(a,6,"veli");
 }
 public void yazd�rma() {
		System.out.println(""+this.a);
		System.out.println(""+this.b);
		System.out.println(""+this.c);
 }
}
