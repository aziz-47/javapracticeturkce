package javapracticeday5;

import java.util.Scanner;

public class SubstringOrnek {

	public static void main(String[] args) {
		/*
		Kullanicidan iki isim isteyiniz eger ilk isim uzunlugu cift sayi ise ikinci ismi ilk ismin ortasina ekleyiniz
		e.g: 
		mehmet ==>   mehahmetmet
		ahmet 
		*/
         
		Scanner scan= new Scanner (System.in);
		System.out.println("iki isim giriniz");
		String str1= scan.nextLine();
		String str2= scan.nextLine();
		
		if(str1.length()%2==0) {
			System.out.println(str1.substring(0, str1.length()/2) + str2+ str1.substring(str1.length()/2 ));
		}
		
		
	}

}
