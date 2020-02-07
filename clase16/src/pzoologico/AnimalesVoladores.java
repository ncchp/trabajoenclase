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
		return "AnimalesVoladores [plumas=" + plumas + ", tamaño=" + tamaño + ", migrante=" + migrante + super.toString() + "]";
	}
	
	

}
