package InstrukcjeZadania;

public class ZadaniaIF {
	
	public ZadaniaIF() {
		zadanie1();
	}
	
	public void zadanie1() {
		System.out.println("======= Zadanie1 =======");
		
		for(int i=0; i<5; i++) {
			int liczba = (int) Math.floor(Math.random()*20+1);
			String odpowiedz;
			
			if(liczba*2+4 < 8)
				odpowiedz = "Tak";
			else
				odpowiedz = "Nie";
			
			System.out.println("\s" + "Liczba: " + liczba +" " + odpowiedz);
		}
		
		System.out.println("========================");
	}	
}
