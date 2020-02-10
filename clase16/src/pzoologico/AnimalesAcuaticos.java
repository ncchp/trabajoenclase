package pzoologico;

public class AnimalesAcuaticos extends Animales {
	 
	private String tipoAmbiente;
	private int cantAletas;
	private int nivelAgresividad;

	
	
	public AnimalesAcuaticos() {
		super();
	}



	public AnimalesAcuaticos(String fecha, String nombre, String paisOrigen, String tipoAmbiente, int cantAletas,
			int nivelAgresividad) {
		super(fecha, nombre, paisOrigen);
		this.tipoAmbiente = tipoAmbiente;
		this.cantAletas = cantAletas;
		this.nivelAgresividad = nivelAgresividad;
	}



	@Override
	public String toString() {
		return "AnimalesAcuaticos [tipoAmbiente=" + tipoAmbiente + ", cantAletas=" + cantAletas + ", nivelAgresividad="
				+ nivelAgresividad + super.toString() + "]";
	}



	public String getTipoAmbiente() {
		return tipoAmbiente;
	}



	public void setTipoAmbiente(String tipoAmbiente) {
		this.tipoAmbiente = tipoAmbiente;
	}



	public int getCantAletas() {
		return cantAletas;
	}



	public void setCantAletas(int cantAletas) {
		this.cantAletas = cantAletas;
	}



	public int getNivelAgresividad() {
		return nivelAgresividad;
	}



	public void setNivelAgresividad(int nivelAgresividad) {
		this.nivelAgresividad = nivelAgresividad;
	}
	
	

}
