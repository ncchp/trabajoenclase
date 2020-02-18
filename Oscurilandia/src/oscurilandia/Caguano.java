package oscurilandia;

public class Caguano extends Carro {
	//atributos
	double  alcanceDeTiro;
	String colorConfeti;
	
	
	public Caguano(int cantidadOcupantes, String fechaIngresoInstitucion, int ubicacionTablero, double alcanceDeTiro,
			String colorConfeti) {
		super(cantidadOcupantes, fechaIngresoInstitucion, ubicacionTablero);
		this.alcanceDeTiro = alcanceDeTiro;
		this.colorConfeti = colorConfeti;
	}


	public double getAlcanceDeTiro() {
		return alcanceDeTiro;
	}


	public void setAlcanceDeTiro(double alcanceDeTiro) {
		this.alcanceDeTiro = alcanceDeTiro;
	}


	public String getColorConfeti() {
		return colorConfeti;
	}


	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}


	@Override
	public String toString() {
		return "Caguano [alcanceDeTiro=" + alcanceDeTiro + ", colorConfeti=" + colorConfeti + "]";
	}
	
	
	


	

}
