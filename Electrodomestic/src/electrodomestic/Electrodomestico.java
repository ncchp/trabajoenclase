package electrodomestic;

public class Electrodomestico {

	protected final static double PRECIO_DEF=100000;
	protected final static String COLOR_DEF="blanco";
	protected final static char CONSUMO_ENERGETICO_DEF='F';
	protected final static double PESO_DEF=5;
	
	protected double precio;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	private void comprobarColor(String color) {
		
		String colores[]= {"blanco", "negro", "rojo", "azul", "gris"};
		boolean encontrado=false;
		
		for(int i=0;i<colores.length && !encontrado;i++){
			
			if(colores[i].contentEquals(color)) {
				encontrado=true;
			}
	
		}
	
		if(encontrado){
			this.color=color;
		}else {
			this.color=COLOR_DEF;
		}
	}

	public void comprobarConsumoEnergetico(char consumoEnergetico){
		
		if(consumoEnergetico>=65 && consumoEnergetico<=70) {
			this.consumoEnergetico=consumoEnergetico;
		}else{
			this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
		}
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String color() {
		return color;
	}
	
	public char getconsumoEnergetico() {
		return consumoEnergetico;
	}
	
	public double getPeso() {
		return peso;
	}
	
	
	public double precioFinal(){
		double agregar=0;
		switch(consumoEnergetico) {
		case 'A':
			agregar+=100;
			break;
		case 'B':
			agregar+=80;
			break;
		case 'C':
			agregar+=60;
			break;
		case 'D':
			agregar+=50;
			break;
		case 'E':
			agregar+=30;
			break;
		case 'F':
			agregar+=10;
			break;
	}
	
	if(peso>=0 && peso<19) {
		agregar+=10;
	}else if(peso>=20 && peso<49) {
		agregar+=50;
	}else if(peso>=50 && peso<79) {
		agregar+=80;
	}else if(peso>80) {
		agregar+=100;
	}
	
	return precio+agregar;
	}
	public Electrodomestico() {
		this(PRECIO_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF );
	}
	public Electrodomestico(double precio,double peso) {
		this(precio, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
	}
			
	public Electrodomestico(double precio, double peso, char consumoEnergetico, String color){
	       this.precio=precio;
	       this.peso=peso;
	       comprobarConsumoEnergetico(consumoEnergetico);
	       comprobarColor(color);		
	}	
}



