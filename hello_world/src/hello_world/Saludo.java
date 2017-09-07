package hello_world;

public class Saludo {

	private static String nombre="Pp";

	public static void main(String[] args) {
		System.out.println("hola  "+ getNombre());
	}
	
	
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Saludo.nombre = nombre;
	}

}
