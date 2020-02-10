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
		return "AnimalesVoladores [ super.toString() + plumas=" + plumas + ", tama�o=" + tama�o + ", migrante=" + migrante  + "]";
	}

	public String getPlumas() {
		return plumas;
	}

	public void setPlumas(String plumas) {
		this.plumas = plumas;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	public boolean isMigrante() {
		return migrante;
	}

	public void setMigrante(boolean migrante) {
		this.migrante = migrante;
	}
	
	

}
