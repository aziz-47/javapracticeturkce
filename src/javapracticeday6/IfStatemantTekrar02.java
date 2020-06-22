package javapracticeday6;

import java.util.Scanner;

public class IfStatemantTekrar02 {
	
	public static void main(String [] args) {
		
		/*Kullanicidan 2 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk olarak konsola yazdiriniz
        int num1 
       int num2 
      */
		Scanner scan= new Scanner (System.in);
		System.out.println("iki numara griniz");
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		
		
		String result= num1>=num2 ? num1 + " en buyuksayidir." + num2 + "en kucuk saydir." : num2 + " en buyuk sayidir." + num1 + 
				"en kucuk sayidir";
		System.out.println(result);
		
	}

}
