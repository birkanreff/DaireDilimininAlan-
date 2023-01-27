import java.util.Scanner;

public class AlanHesabı {

	public static void main(String[] args) {
		
		int r;
		int aci;
		double pi = 3.14;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Alanını hesaplamak istediğinizi dairenin yarıçapını giriniz: ");
		r=input.nextInt();
		System.out.println("Daire diliminin merkez açısını giriniz: ");
		aci = input.nextInt();
		
		double alan = (pi * r * r * aci) / 360 ;
		
		System.out.println("Alanını hesaplamak istediğiniz daire diliminin alanı: " + alan);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
