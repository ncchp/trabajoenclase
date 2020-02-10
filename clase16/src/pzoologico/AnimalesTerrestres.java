package pzoologico;

public class AnimalesTerrestres extends Animales {
	
	private int cantidadPatas;
	private int horasSueno;
	private String alimentacion;
	
	
	
	public AnimalesTerrestres() {
		super();
		
	}

	public AnimalesTerrestres(String fecha, String nombre, String paisOrigen,  int cantidadPatas,  int horasSueno, String alimentacion) {
		super(fecha, nombre, paisOrigen);
		this.cantidadPatas =  cantidadPatas;
		this.horasSueno = horasSueno;
		this.alimentacion = alimentacion;
	}

	@Override
	public String toString() {
		return "AnimalesTerrestres [cantidadPatas=" + cantidadPatas + ", horasSueno=" + horasSueno + ", alimentacion="
				+ alimentacion + super.toString() + "]";
	}

	public int getCantidadPatas() {
		return cantidadPatas;
	}

	public void setCantidadPatas(int cantidadPatas) {
		this.cantidadPatas = cantidadPatas;
	}

	public int getHorasSueno() {
		return horasSueno;
	}

	public void setHorasSueno(int horasSueno) {
		this.horasSueno = horasSueno;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}	
	
	
	
	

	
}
