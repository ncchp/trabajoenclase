package pzoologico;

public class AnimalesVoladores {
	
	private String plumas;
	private double tama�o;
	private boolean migrante;
	
	
	
	public AnimalesVoladores() {
		super();
	}

	public AnimalesVoladores(String plumas, double tama�o, boolean migrante) {
		super();
		this.plumas = plumas;
		this.tama�o = tama�o;
		this.migrante = migrante;
	}

	@Override
	public String toString() {
		return "AnimalesVoladores [plumas=" + plumas + ", tama�o=" + tama�o + ", migrante=" + migrante + super.toString() + "]";
	}
	
	

}
