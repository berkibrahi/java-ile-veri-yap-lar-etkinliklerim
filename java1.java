package ibob;
import java.util.ArrayList;
public class java1 {
	/*public static void fonk(int[] arrey) {
		double total=0;
		//int i;
		for(int i=0;i<arrey.length;i++) {
			total+=arrey[i];
		}
		for(int i=0;i<arrey.length;i++) 
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arrey= {10,20,100,40};
/*fonk(arrey);
		int[][] arr= {{1,2,3},{4,5,6},{9,2,1}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(""+arr[i][j]);	
			}
			System.out.println();
		}*/
		ArrayList<String> ekle=new ArrayList<String>();
		ekle.add("ali");
		ekle.add("veli");
		ekle.add("mehmet");
		//ekle.remove(0);
		//System.out.println(ekle.indexOf("mehmet"));
		//System.out.println(""+ekle.get(0));
	//	System.out.println(""+ekle.get(1));
		//System.out.println(""+ekle.get(2));
		//System.out.println(""+ekle.size());
		//for(int i=0;i<ekle.size();i++) {
			//System.out.println(""+ekle.get(i));}
	for(String a:ekle) {
		System.out.println(""+a);
	}
	for(int a:arrey) {
		System.out.println(""+a);
	}
	
	}

}
