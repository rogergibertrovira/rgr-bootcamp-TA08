package TA08_Ex1;

public class PersonaApp {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona("Roger", 28, 'H');
		Persona p3 = new Persona("Rigoberta", 36, "45678492K", 'M', 67, 175);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
