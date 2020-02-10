package pzoologico;

public class Animales {
	
	private String fecha;
	private String nombre;
	private String paisOrigen;

	public Animales(String fecha, String nombre, String paisOrigen) {
		
    //super();
    
	this.fecha = fecha;
	this.nombre = nombre;
	this.paisOrigen = paisOrigen;
	}
	
	public Animales() {
		
	}
	
	@Override
	public String toString() {
		return "animales [fecha=" + fecha + ", nombre=" + nombre + ", paisOrigen=" + paisOrigen + "]";
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
    
	

}
