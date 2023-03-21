package TA08_Ex3;

public class Electrodomestico {

	// Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico; // range A-F
	protected double peso;

	final double PRECIODEFECTO = 100;
	final String COLORDEFECTO = "blanco";
	final char CONSUMODEFECTO = 'F';
	final double PESODEFECTO = 5;

	// Constructores
	public Electrodomestico() {
		this.precioBase = PRECIODEFECTO;
		this.color = COLORDEFECTO;
		this.consumoEnergetico = CONSUMODEFECTO;
		this.peso = PESODEFECTO;
	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLORDEFECTO;
		this.consumoEnergetico = CONSUMODEFECTO;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	// Métodos
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}
}
