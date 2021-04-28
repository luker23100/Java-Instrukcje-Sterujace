package InstrukcjeZadania;

import java.awt.Point;

public class ZadaniaWHILE {

	public ZadaniaWHILE() {
		zadanie1();
		System.out.println();
		zadanie2();
		System.out.println();
		zadanie3();
		System.out.println();
		zadanie4();
		System.out.println();
		zadanie5();
	}

	public void zadanie1() {
		System.out.println("======= Zadanie1 =======");

		int start = 427;
		int koniec = 529;

		while (start <= koniec) {
			if (start % 3 == 0 && start % 5 == 0)
				System.out.println(start + " TikTak");
			else if (start % 3 == 0)
				System.out.println(start + " Tik");
			else if (start % 5 == 0)
				System.out.println(start + " Tak");
			start++;
		}

		System.out.println("========================");
	}

	public void zadanie2() {
		System.out.println("======= Zadanie2 =======");

		int n = 4;
		String gwiazdki = "";

		System.out.println("Dla n = " + n);
		while (n != 0) {
			gwiazdki += "*";
			System.out.println(gwiazdki);
			n--;
		}

		n = 6;
		gwiazdki = "";
		System.out.println("Dla n = " + n);
		while (n != 0) {
			gwiazdki += "*";
			System.out.println(gwiazdki);
			n--;
		}

		System.out.println("========================");
	}

	public void zadanie3() {
		System.out.println("======= Zadanie3 =======");
		
		System.out.print(piramida(5));
		System.out.print(piramida(7));

		System.out.println("========================");
	}
	
	private String piramida(int n) {
		if(n % 2 == 0)
			return "Liczba musi byæ nieparzysta\n";
		
		System.out.println("Piramida dla n = " + n);
		String piramida = "";
		int odstep = n/2;
		int liczbaGwiazdek = 1;
		while(odstep != -1) {
			for(int i=0; i<odstep; i++)
				piramida += "\s";
			for(int i=0; i<liczbaGwiazdek; i++)
				piramida += "*";
			piramida += "\n";
			odstep--;
			liczbaGwiazdek += 2;
		}
		
		return piramida;
	}
	
	public void zadanie4() {
		System.out.println("======= Zadanie4 =======");
		
		String liczby = "";
		Point punkt = null;
		int kolumna = 0;
		int[][] sudoku = {{1,0,3}, {0,1,2}, {2,3,0}};
		
		for (int wiersz = 0; wiersz < 3; wiersz++) {
			for (int i = 0; i < 3; i++) {
				if (sudoku[wiersz][i] == 0) {
					punkt = new Point(wiersz, i);
					kolumna = i;
				}
				liczby += sudoku[wiersz][i];
			}
			for (int i = 0; i < 3; i++)
				liczby += sudoku[i][(int) punkt.getY()];

			if (!liczby.contains("1"))
				sudoku[(int) punkt.getX()][(int) punkt.getY()] = 1;
			else if (!liczby.contains("2"))
				sudoku[(int) punkt.getX()][(int) punkt.getY()] = 2;
			else
				sudoku[(int) punkt.getX()][(int) punkt.getY()] = 3;
			liczby = "";
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
				System.out.print(sudoku[i][j]);
			System.out.println();
		}
		System.out.println("========================");
	}
	
	public void zadanie5() {
		System.out.println("======= Zadanie5 =======");
		
		int[][] sudoku = {{2,0,0},{0,1,2},{1,2,0}};
		int wiersz = 0;
		int x = 0;
		int y = 0;
		String liczby = "";
		
		boolean koniec = false;
		while(!koniec) {
			for(int i=0; i<3;i++)
				liczby += sudoku[wiersz][i];				
			
			for(int i=0; i<3; i++)
				if(sudoku[wiersz][i] == 0) {
					x = wiersz;
					y = i;
					i = 3;
				}
			
			for(int i=0; i<3; i++)
				liczby += sudoku[i][y];
			
			if (!liczby.contains("1"))
				sudoku[x][y] = 1;
			else if (!liczby.contains("2"))
				sudoku[x][y] = 2;
			else
				sudoku[x][y] = 3;
			
			liczby = "";
			
			for(int i=0; i<3;i++)
				liczby += sudoku[wiersz][i];
			if(!liczby.contains("0"))
				wiersz++;
			
			if(wiersz == 3)
				koniec = true;
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
				System.out.print(sudoku[i][j]);
			System.out.println();
		}
		
		System.out.println("========================");
	}
}