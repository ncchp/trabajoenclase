package oscurilandia;

public class Kromi extends Carro{
	//atributos
	String anioFabricacion;
	String marca;
	
	//contructors
	public Kromi(int cantidadOcupantes, String fechaIngresoInstitucion, int ubicacionTablero, String anioFabricacion,
			String marca) {
		super(cantidadOcupantes, fechaIngresoInstitucion, ubicacionTablero);
		this.anioFabricacion = anioFabricacion;
		this.marca = marca;
	}
	
	//gettersandsetters
	public String getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(String anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//tostring
	@Override
	public String toString() {
		return "Kromis [anioFabricacion=" + anioFabricacion + ", marca=" + marca + "]";
	}
	
	
	
	
	
	


	
	
	

}
