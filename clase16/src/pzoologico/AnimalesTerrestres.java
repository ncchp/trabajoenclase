package pzoologico;

public class AnimalesTerrestres extends Animales {
	
	private byte cantidadPatas;
	private int horasSueno;
	private String alimentacion;
	
	
	
	public AnimalesTerrestres() {
		super();
		
	}

	public AnimalesTerrestres(String fecha, String nombre, String paisOrigen,  byte cantidadPatas,  int horasSueno, String alimentacion) {
		super(fecha, nombre, paisOrigen);
		this.cantidadPatas = cantidadPatas;
		this.horasSueno = horasSueno;
		this.alimentacion = alimentacion;
	}

	@Override
	public String toString() {
		return "AnimalesTerrestres [cantidadPatas=" + cantidadPatas + ", horasSueno=" + horasSueno + ", alimentacion="
				+ alimentacion + super.toString() + "]";
	}	
	
	
	
	

	
}
