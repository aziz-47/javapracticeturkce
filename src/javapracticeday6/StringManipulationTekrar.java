package javapracticeday6;

import java.util.Scanner;

public class StringManipulationTekrar {

	public static void main(String[] args) {
		/*
		 * kullanicidan bir cumle isteyiniz ve cumlenin kelimelerini tersten yazdiriniz 
		 * e.g: I love java ==> java love I 
		 * String reverse = ""; 
		 * 
		 * substring method ile yapiniz veya array ile yapiniz
		 * 
		 */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("bir cumle giriniz");
		String str = scan.nextLine();
		String arr1[] = str.split(" ");
		
		for(int i = arr1.length-1; i>=0; i--) {
			System.out.print(arr1[i] + " ");
			
		}
	}

}
