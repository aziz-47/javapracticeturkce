package javapracticeday5;

public class ObjectOrnekTekrar {

	public static void main(String[] args) {
		// BIR kelimeyi tertesn yazdirniz
		
		StringBuilder str= new StringBuilder();
		str.append("bayram");
		System.out.println(str);
		System.out.println(str.reverse());
		System.out.println(str.equals(str.reverse()));
		System.out.println(str.toString());

	}

}
