package TA08_Ex3;

public class ElectrodomesticoApp {

	public static void main(String[] args) {
		Electrodomestico electrodomestico1 = new Electrodomestico();
		Electrodomestico electrodomestico2 = new Electrodomestico(430, 20);
		Electrodomestico electrodomestico3 = new Electrodomestico(560, "gris", 'A', 35);

		System.out.println(electrodomestico1);

		System.out.println(electrodomestico2);

		System.out.println(electrodomestico3);
	}

}
