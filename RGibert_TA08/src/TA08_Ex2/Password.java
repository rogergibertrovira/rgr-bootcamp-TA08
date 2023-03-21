package TA08_Ex2;

public class Password {

	// Atributos
	private int longitud;
	private String contraseña;

	// Constructores
	public Password() {
		this.longitud = 8;
		this.contraseña = "";
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = "";

		for (int i = 0; i < longitud; i++) {
			this.contraseña += randomChar();
		}
	}

	private char randomChar() {
		char alfabeto[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
				'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c',
				'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
				'y', 'z' };

		char nextChar = alfabeto[(int) (Math.random() * alfabeto.length)];
		return nextChar;
	}

	// Métodos
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getContraseña() {
		return contraseña;
	}

}