package javapracticeday6;

import java.util.Scanner;

public class IfStatemenTekrar01 {

	public static void main(String[] args) {
		/*Kullanicidan 2 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk olarak konsola yazdiriniz
        int num1 
       int num2 
      */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Iki rakam giriniz");
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		
		if(num1>=num2) {
			System.out.println(num1 + " En buyuk sayidir");
			System.out.println(num2 + " En kucuk sayidr");
		}else {
			System.out.println(num2 + " en buyuk saydir");
			System.out.println(num1 + " en kucuk sayidr");
		}

	}

}
