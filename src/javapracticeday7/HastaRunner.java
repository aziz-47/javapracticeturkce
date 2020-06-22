package javapracticeday7;

public class HastaRunner {

	public static void main(String[] args) {
		
		Hasta hasta1= new Hasta();
		
		
		Case durum  = new Case();
		
		durum.setActualCase("Romatizma");
		durum.setEmergency("normal");
		
		System.out.println("su anki durumu: " + durum.getActualCase());
		System.out.println("Aciliyet durumu: " + durum.getEmergency());
		
		
		hasta1.setIsim("Nevzat");
		hasta1.setSoyIsim("Toprak");
		hasta1.setSuankiDurum(durum);
		
		
		System.out.println("Hatsatnin isimi: " +  hasta1.getIsim());
		System.out.println("Hastanin soyIsmi : " +hasta1.getSoyIsim());
		System.out.println("Hastanin acyuel durumu: " + hasta1.getSuankiDurum().getActualCase());
		System.out.println("Hastanin aciliyet durumu: " + hasta1.getSuankiDurum().getEmergency());

	}

}
