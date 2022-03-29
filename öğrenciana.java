import java.util.Scanner;

public class öðrenciana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ogrliste liste=new ogrliste();
		Scanner scanner=new Scanner(System.in);
		int seçim=1;
		while(seçim!=0) {
			System.out.println();
		System.out.println("1yeni kayýt");
		System.out.println(" 2kayýt silt");
		System.out.println("3 kayýtlarý listele");
		
		System.out.println(" 0 çýkýþ");
		System.out.println("seçiminiz:");
		seçim=scanner.nextInt();

			
		
		switch (seçim) {
		case 1: 
			liste.ekle();break;

		case 2:liste.sil();break;
			
			
		case 3:liste.yaz();break;
		
		
	
		case 0:break;

		default:
			System.out.println("sonlandý");break;
		}
		
		

			}

	}

}
