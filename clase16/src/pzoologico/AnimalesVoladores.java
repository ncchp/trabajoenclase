package pzoologico;

public class AnimalesVoladores {
	
	private String plumas;
	private double tamaño;
	private boolean migrante;
	
	
	
	public AnimalesVoladores() {
		super();
	}

	public AnimalesVoladores(String plumas, double tamaño, boolean migrante) {
		super();
		this.plumas = plumas;
		this.tamaño = tamaño;
		this.migrante = migrante;
	}

	@Override
	public String toString() {
		return "AnimalesVoladores [ super.toString() + plumas=" + plumas + ", tamaño=" + tamaño + ", migrante=" + migrante  + "]";
	}

	public String getPlumas() {
		return plumas;
	}

	public void setPlumas(String plumas) {
		this.plumas = plumas;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public boolean isMigrante() {
		return migrante;
	}

	public void setMigrante(boolean migrante) {
		this.migrante = migrante;
	}
	
	

}
