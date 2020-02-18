package oscurilandia;

public class Carro {
	//atributos
	private int cantidadOcupantes;
	private String fechaIngresoInstitucion;
	private int ubicacionTablero;
	
	//contructors
	
	public Carro(int cantidadOcupantes, String fechaIngresoInstitucion, int ubicacionTablero) {
		super();
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngresoInstitucion = fechaIngresoInstitucion;
		this.ubicacionTablero = ubicacionTablero;
	}
	
	//getters and setters
	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}
	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}
	public String getFechaIngresoInstitucion() {
		return fechaIngresoInstitucion;
	}
	public void setFechaIngresoInstitucion(String fechaIngresoInstitucion) {
		this.fechaIngresoInstitucion = fechaIngresoInstitucion;
	}
	public int getUbicacionTablero() {
		return ubicacionTablero;
	}
	public void setUbicacionTablero(int ubicacionTablero) {
		this.ubicacionTablero = ubicacionTablero;
	}
	
	//tostring
	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaIngresoInstitucion=" + fechaIngresoInstitucion
				+ ", ubicacionTablero=" + ubicacionTablero + "]";
	}
	
	
	

}
