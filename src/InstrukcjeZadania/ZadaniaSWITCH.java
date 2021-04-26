package InstrukcjeZadania;

import java.text.DecimalFormat;

public class ZadaniaSWITCH {
	
	
	public ZadaniaSWITCH() {
		zadanie1();
		System.out.println();
		zadanie2();
	}
	
	public void zadanie1() {
		System.out.println("======= Zadanie1 =======");
		
		Character[] options = {'+', '-', '*', '/'};
		
		for(int i=1; i<=4; i++) {
			float a = (float) (Math.random()*100+1);
			float b = (float) (Math.random()*100+1);
			
			System.out.println("Przypadek " + i + ": " + "\"" + options[i-1] + "\"");
			DecimalFormat format = new DecimalFormat("#0.00");
			
			float wynik = 0;
			switch(options[i-1]) {
			case '+':
				wynik = a + b;
				break;
			case '-':
				wynik = a - b;
				break;
			case '*':
				wynik = a * b;
				break;
			case '/':
				wynik = a / b;
				break;
			}
			
			System.out.println("Wynik operacji: " + format.format(a) + options[i-1] + format.format(b) + " = " + format.format(wynik));
		}
			
		
		System.out.println("========================");
	}
	
	public void zadanie2() {
		System.out.println("======= Zadanie2 =======");
		
		int[] pensja = {100, 2000, 2500};
		int podwyzka = 0;
		double oIleProcentWzrosla = 0;
		
		for(int i : pensja) {
			switch(i) {
			case 100:
				podwyzka = 1000;
				break;
			case 2000:
				podwyzka = 2200;
				break;
			case 2500:
				podwyzka = 2525;
				break;
			}
			
			oIleProcentWzrosla = (double) (((podwyzka-i)/(double)i)*100.0);
			System.out.println("Pensja podstawowa: " + i);
			System.out.println("Pensja po podwy¿ce: " + podwyzka);
			System.out.println("Pensja wzros³a o: " + oIleProcentWzrosla + "%");
			System.out.println("************************");
		}
		
		System.out.println("========================");
	}
}
