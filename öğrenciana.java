import java.util.Scanner;

public class ��renciana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ogrliste liste=new ogrliste();
		Scanner scanner=new Scanner(System.in);
		int se�im=1;
		while(se�im!=0) {
			System.out.println();
		System.out.println("1yeni kay�t");
		System.out.println(" 2kay�t silt");
		System.out.println("3 kay�tlar� listele");
		
		System.out.println(" 0 ��k��");
		System.out.println("se�iminiz:");
		se�im=scanner.nextInt();

			
		
		switch (se�im) {
		case 1: 
			liste.ekle();break;

		case 2:liste.sil();break;
			
			
		case 3:liste.yaz();break;
		
		
	
		case 0:break;

		default:
			System.out.println("sonland�");break;
		}
		
		

			}

	}

}
