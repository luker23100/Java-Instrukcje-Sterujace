import java.util.Scanner;

import InstrukcjeZadania.ZadaniaFOR;
import InstrukcjeZadania.ZadaniaIF;
import InstrukcjeZadania.ZadaniaSWITCH;
import InstrukcjeZadania.ZadaniaWHILE;

public class Gui {
	private int wybranyTemat = -1;
	
	public Gui() {
		otwarcieAplikacji();
	}
	
	private void otwarcieAplikacji() {
		wyborTematu();
		przejdzDoZadan();
	}
	
	private void wyborTematu() {
		final String[] tematy = {"[1] Instrukcja IF",
								 "[2] Instrukcja SWITCH",
								 "[3] Instrukcja WHILE",
								 "[4] Instrukcja DO-WHILE",
								 "[5] Instrukcja FOR",
								 "[6] Instrukcja FOREACH",
								 "[7] Instrukcje skoku",
								 "[8] Ci¹g Fibonacciego"};
		
		System.out.println("==== Instrukcje-Sterujace ====" + "\n");
		for(String s : tematy)
			System.out.println("\s" + s);
		
		wybranyTemat = wybierak(1, tematy.length);
	}
	
	private int wybierak(int from, int to) {
		Scanner skan = new Scanner(System.in);
		int wybor = from-1;
		while(wybor < from || wybor > to) {
			try {
				System.out.print("Wybór: ");
				wybor = Integer.parseInt(skan.next());
			} catch(Exception e) {}
		}
		skan.close();
		return wybor;
	}
	
	private void przejdzDoZadan() {
		System.out.println();
		
		switch(wybranyTemat){
		case 1:
			new ZadaniaIF();
			break;
		case 2:
			new ZadaniaSWITCH();
			break;
		case 3:
			new ZadaniaWHILE();
			break;
		case 5:
			new ZadaniaFOR();
			break;
		}
	}
}
