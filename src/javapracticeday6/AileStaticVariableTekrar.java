package javapracticeday6;

public class AileStaticVariableTekrar {
	
	static int ailepizasi= 7;
	int bireyselpiza= 6;
	

	public static void main(String[] args) {
		
		AileStaticVariableTekrar pizza = new AileStaticVariableTekrar();
		pizza.ailepizasi+=5;
		pizza.bireyselpiza+=5;
//		System.out.println(pizza.ailepizasi);
//		System.out.println(pizza.bireyselpiza);
		
		
		AileStaticVariableTekrar pizza2= new AileStaticVariableTekrar();
		pizza2.ailepizasi+=2;
		pizza2.bireyselpiza+=2;
		System.out.println(pizza2.ailepizasi);
        System.out.println(pizza2.bireyselpiza);
	}

}
