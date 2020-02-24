package electrodomestic;

public class Lavadora extends Electrodomestico {

	private final static int CARGA_DEF=5;
	
	private int carga;
	
	public int getCarga()  {
		return carga;
	}
	
	public double precioFinal() {
		double agregar=super.precioFinal();
		
		if(carga>30) {
			agregar+=50;
		}
		
		return agregar;
		
	}
	
	public Lavadora() {
		this(PRECIO_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF );
	}
	
	public Lavadora(double precio, double peso) {
		this(precio, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
	}
	
	public Lavadora(double precio, double peso, char consumoEnergetico, String color, int carga ) {
		super(precio, peso, consumoEnergetico, color);
		this.carga=carga;
	}
	
	
}
