package InstrukcjeZadania;

import java.util.ArrayList;
import java.util.Collections;

public class ZadaniaFOR {
	public ZadaniaFOR() {
		zadanie1();
		System.out.println();
		zadanie2();
		System.out.println();
		zadanie3();
		System.out.println();
		zadanie4();
	}
	
	public void zadanie1() {
		System.out.println("======= Zadanie1 =======");
		
		int[] oceny = {1, 3, 5, 4, 5};
		int[] oceny2 = {3, 4, 4, 4, 4, 3, 3, 5};
		int licznik = 0;
		for(int i=0; i<oceny.length; i++)
			licznik += oceny[i];
		
		double srednia = licznik/(double) oceny.length;
		
		licznik = 0;
		for(int i=0; i<oceny2.length; i++)
			licznik += oceny2[i];
		
		double srednia2 = licznik/(double) oceny2.length;
		
		System.out.println("Œrednia1 = " + srednia);
		System.out.println("Œrednia2 = " + srednia2);
		
		System.out.println("========================");
	}
	
	public void zadanie2() {
		System.out.println("======= Zadanie2 =======");
		
		String znaki = "aodfmOijoijpaIJ;IJF;ASKDIANUIaLFMB;DI,OC[KAWX.PAKSAADSIJ,P;PAKDFKOSA'OPK,CAOA.Xpajfk.zpaki,c";
		char[] tablicaZnakow = znaki.toCharArray();
		int ilosca = 0;
		int iloscA = 0;
		
		for(int i=0; i<tablicaZnakow.length; i++) {
			if(tablicaZnakow[i] == 'a')
				ilosca++;
			if(tablicaZnakow[i] == 'A')
				iloscA++;
		}
		
		System.out.println("Iloœæ a = " + ilosca);
		System.out.println("Iloœæ A = " + iloscA);
		System.out.println("£¹cznie = " + (ilosca+iloscA));
		
		System.out.println("========================");
	}
	
	public void zadanie3() {
		System.out.println("======= Zadanie3 =======");
		
		int[] liczby = {2, 5, 7, 4, 3, 7, 4, 9, 6, 1, 5, 2, 8, 5, 9, 1, 3, 4, 3};
		int suma = 0;
		int iloczyn = 1;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int mediana;
		
		for(int i=0; i<liczby.length; i++) {
			suma += liczby[i];
			iloczyn *= liczby[i];
			if(liczby[i] < min)
				min = liczby[i];
			if(liczby[i] > max)
				max = liczby[i];
		}
		
		ArrayList<Integer> listaLiczb = new ArrayList<>();
		for(int i=0; i<liczby.length; i++)
			listaLiczb.add(liczby[i]);
		Collections.sort(listaLiczb, Collections.reverseOrder());
		
		System.out.println("Suma: " + suma);
		System.out.println("Iloczyn: " + iloczyn);
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		
		System.out.print("Lista malej¹ca: ");
		for(Integer i : listaLiczb)
			System.out.print(i + ", ");
		System.out.println();
		mediana = listaLiczb.get((listaLiczb.size()/2)+1);
		
		System.out.println("Mediana: " + mediana);
		
		System.out.println("========================");
	}
	
	public void zadanie4() {
		System.out.println("======= Zadanie4 =======");
		
		String imie = "Jurek";
		char[] tab = imie.toCharArray();
		String odwroconeImie = "";
		for(int i=tab.length-1; i>=0; i--)
			odwroconeImie += tab[i];
		System.out.println(imie + " -> " + odwroconeImie);
		
		System.out.println("========================");
	}
}
