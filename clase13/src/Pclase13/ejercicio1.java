package Pclase13;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("creo instancia de la clase");
		Password pass = new Password();
		System.out.println("Datos: " );
		System.out.println("Largo: " + pass.getLongitud());
		System.out.println("clave: " + pass.getContrasena());
		System.out.println("Es fuerte: " + pass.esFuerte());
		

		Password amor = new Password(15);
		System.out.println("Datos amor: ");
		System.out.println("Largo: " + amor.getLongitud());
		System.out.println("Clave: " + amor.getContrasena());
		System.out.println("Es fuerte: " + amor.esFuerte());
		
	}

}
