package oscurilandia;

public class Trupalla extends Carro {
	//atributos
	String nivelArmadura;
	String persona;
	
	
	public Trupalla(int cantidadOcupantes, String fechaIngresoInstitucion, int ubicacionTablero, String nivelArmadura,
			String persona) {
		super(cantidadOcupantes, fechaIngresoInstitucion, ubicacionTablero);
		this.nivelArmadura = nivelArmadura;
		this.persona = persona;
	}


	public String getNivelArmadura() {
		return nivelArmadura;
	}


	public void setNivelArmadura(String nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}


	public String getPersona() {
		return persona;
	}


	public void setPersona(String persona) {
		this.persona = persona;
	}


	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", persona=" + persona + "]";
	}

	
	

}
