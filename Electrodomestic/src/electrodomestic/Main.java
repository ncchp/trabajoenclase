package electrodomestic;

public class Main {
	public static void main(String[] args) {
		
		Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];
		
		listaElectrodomesticos[0]=new Electrodomestico(100, 30, 'D', "naranja");
		listaElectrodomesticos[1]=new Lavadora(150, 30);
		listaElectrodomesticos[2]=new Television(400, 60, 'E', "blanco", 42, false);
		listaElectrodomesticos[3]=new Electrodomestico();
		listaElectrodomesticos[4]=new Electrodomestico(500, 30, 'D', "negro");
		listaElectrodomesticos[5]=new Lavadora(300, 40, 'Z', "gris", 40);
		listaElectrodomesticos[6]=new Television(150, 80);
		listaElectrodomesticos[7]=new Lavadora(200, 50, 'C', "gris", 30);
		listaElectrodomesticos[8]=new Television(400,100, 'A', "verde", 14, true);
		listaElectrodomesticos[9]=new Electrodomestico(60, 15);
	
		
		double sumaElectrodomesticos=0;
		double sumaTelevisiones=0;
		double sumaLavadoras=0;
		
		for(int i=0;i<listaElectrodomesticos.length;i++) {
			
			if(listaElectrodomesticos[i] instanceof Electrodomestico) {
				sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
			}
			if(listaElectrodomesticos[i] instanceof Lavadora) {
				sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
			}
			if(listaElectrodomesticos[i] instanceof Television) {
				sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
			}	
		}
		
		System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
		System.out.println("La suma del precio de los lavadoras es de "+sumaLavadoras);
		System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
	
	}
	

	
}
