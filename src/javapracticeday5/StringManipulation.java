package javapracticeday5;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		/*
		Kullanicidan bir e-mail addressi  isteyiniz eger email id de "hotmail" varsa  "gmail" ile degistiriniz
		e.g: mesutyaman@hotmail.com  ==> mesutyaman@gmail.com
		*/
         
//		*
//        * Kullanicidan bir e-mail addressi isteyiniz eger email id de "hotmail" varsa
//        * "gmail" ile degistiriniz e.g: mesutyaman@hotmail.com ==> mesutyaman@gmail.com
//        * 
//        */
       Scanner scan = new Scanner(System.in);
       System.out.println("Lutfen email adresinizi giriniz");
       String email = scan.next();
       if (email.contains("hotmail")) {
           email = email.replace("hotmail", "gmail");
       }
       System.out.println(email);

		
		

	}

}
