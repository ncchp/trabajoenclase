package electrodomestic;

public class Television extends Electrodomestico{

	private final static int RESOLUCION_DEF=20;
	
	private int resolucion;
	
	private boolean sintonizadorTDT;
	
	public double precioFinal() {
		double agregar=super.precioFinal();
		
		if (resolucion>40) {
			agregar+=precio*0.3;
		}
		if (sintonizadorTDT) {
			agregar+=50;
		}
		
		return agregar;
	}
	
	public Television() {
		this(PRECIO_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
	}	
	public Television(double precio, double peso) {
		this(precio, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF,RESOLUCION_DEF, false);
	}
	public Television(double precio, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precio, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
	}
	
}
