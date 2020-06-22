package javapracticeday6;

public class StaticVariableTekrar {
	
	static int num1= 10;
	int num2= 20;
	

	public static void main(String[] args) {
		/*
	    Iki tane instance int variable olusturunuz ve biri static digeri non-static olsun
	    sonra bu class tan iki farkli object olusturunuz
	    Her objectle instance variable lara rakam ekleyiniz
	    */
		
		StaticVariableTekrar obj1= new StaticVariableTekrar();
		
		obj1.num1+=15;
		obj1.num2+=15;
//		System.out.println(obj1.num1);
//		System.out.println(obj1.num2);
		
		StaticVariableTekrar obj2= new StaticVariableTekrar();
		
		obj2.num1+=15;
		obj2.num2+=15;
		
		System.out.println(obj2.num1);
		System.out.println(obj2.num2);
		
		
		

	}

}
