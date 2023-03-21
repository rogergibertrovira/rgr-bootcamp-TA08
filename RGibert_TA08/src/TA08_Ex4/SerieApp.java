package TA08_Ex4;

public class SerieApp {

	public static void main(String[] args) {
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("Los juegos de la Sepia", "Esteban Espilberiano");
		Serie serie3 = new Serie("Galaxias en Guerra", 6, true, "Ciencia ficcion", "Jorge Lucas");

		System.out.println(serie1);

		System.out.println(serie2);

		System.out.println(serie3);
	}

}
