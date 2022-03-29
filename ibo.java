package ibob;

public class ibo {

	private int a;
	private double b;
	private String c;
/*public int a;
public double b;
public String c*/
;
public void seta(int a){
	if(a==2 || a==4) {
	this.a=a;}
	else {
		System.out.println("2 ve dort olmalýdýr");
	}
}
public int geta() {
	return this.a;
}


public double getB() {
	return b;
}
public void setB(double b) {
	this.b = b;
}
public String getC() {
	return c;
}
public void setC(String c) {
	this.c = c;
}

}
