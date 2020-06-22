package javapracticeday5;

public class OCASorusuTekrar {

	public static void main(String[] args) {
		 String str = "M ";//M 
	      str = str.concat("E ");//M E 
	      String add = "S ";//S 
	      str = str.concat(add);//M E S 
	      str = str.replace("S","T");
	      str = str.concat(add);//M E S S
	      System.out.println(str.replace("S", "T"));
	      System.out.println(str);
	
	       //Netice nasil olur?
	      
	     System.out.println( str.concat("E "));
	     System.out.println(str.concat(add));
	     System.out.println(str.replace("S", "T"));
	     System.out.println(str.concat(add));
	      

	}

}
