package arabaprojesiday6;

public class HondaTekrar1 {
	
	protected String make= "Honda";
	protected String model= "Accord";
	protected int year =2012;
	
	
	public  HondaTekrar1() {
		
	}
	
	public  HondaTekrar1(String model , int year) {
		this.model= model;
	
	}

	public static void main(String[] args) {
		 /*
	    Bir class olusturunuz adi Honda olsun
	    icerisinde 3 instance variable olsun 
	    protected String make = "Honda";
	    protected String model = "Accord";
	    protected int year = 2012;
	    Sonra 3 tane String return tipinden method olusturunuz
	    arabaMarkasi
	    arabaModeli
	    arabaYili
	    Son olarak bir oject olusturup method lari main method da print ediniz
	    */
		   
		 HondaTekrar1 newHonda = new  HondaTekrar1();
		 
		 System.out.println("araba markasi: " + newHonda.arabaMarkasi());
		 System.out.println("araba  modeli: " + newHonda.model);
		 System.out.println("araba yili: " + newHonda.year);
		 
		 
		 HondaTekrar1 newHonda2 = new  HondaTekrar1("Civik", 2009);
		 System.out.println("araba markasi: " + newHonda2.arabaMarkasi());
		 System.out.println("araba modlei :" +  newHonda2.model);
		 System.out.println("araba yili: " +  newHonda2.year);
		
		
		
		

	}
	
	public String arabaMarkasi () {
		return make;
	}
	
	public String arabaModeli() {
		return model ;
	}
	
	public int arabaYili() {
		return year;
	}

}
