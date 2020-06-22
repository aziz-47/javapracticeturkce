package javapracticeday6;

import java.util.Scanner;

public class StrinManipulationTekrar02 {

	public static void main(String[] args) {
		/*
		 * kullanicidan bir cumle isteyiniz ve cumlenin kelimelerini tersten yazdiriniz 
		 * e.g: I love java ==> java love I 
		 * String reverse = ""; 
		 * 
		 * substring method ile yapiniz veya array ile yapiniz
		 * 
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String str= scan.nextLine();
		
		int ilkBosluk= str.indexOf(" ");
		int sonBosluk= str.lastIndexOf(" ");
		
		System.out.println(str.substring(sonBosluk+1) + (str.substring(ilkBosluk, sonBosluk+1 ) + str.substring(0, ilkBosluk)));
		
	}

}
