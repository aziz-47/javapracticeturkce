package javapracticeday5;

import java.util.Scanner;

public class SubstringOrnekTekrar {

	public static void main(String[] args) {
     /*
		Kullanicidan iki isim isteyiniz eger ilk isim uzunlugu cift sayi ise ikinci ismi ilk ismin ortasina ekleyiniz
		e.g: 
		mehmet ==>   mehahmetmet
		ahmet 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("iki isim giriniz");
		String isim1= scan.nextLine();
		String isim2= scan.nextLine();
		
		if(isim1.length()%2==0) {
			System.out.println(isim1.substring(0, isim1.length()/2) + isim2 + isim1.substring(isim1.length()/2));
		}
		

	}

}
