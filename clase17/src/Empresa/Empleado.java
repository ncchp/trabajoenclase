package Empresa;

public class Empleado {
	
	String nombre;
	String apellido;
	int dni;
	String direccion;
	String aniosantiguedad;
	String telefono;
	double salario;
	String supervisor;

	
	public Empleado() {
		super();
	}


	public Empleado(String nombre,String apellido, int dni, String direccion, String añosantiguedad, String telefono, double salario, String supervisor ) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.aniosantiguedad = añosantiguedad;
		this.telefono = telefono;
		this.salario = salario;
		this.supervisor = supervisor; 
	}
	
	public void mostrarDatos() {
		System.out.println("");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Dni: " + this.dni );
		System.out.println("Direccion: " + this.direccion);
		System.out.println("Años de antiguedad: " + this.aniosantiguedad);
		System.out.println("Telefono: " + this.telefono); 
		System.out.println("Salario: " + this.salario);
		System.out.println("supervisor " + this.supervisor);
	}	
	
	salario
}