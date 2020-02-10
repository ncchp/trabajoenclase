package Empresa2018;
//Demostrar sobre todo que el metodo de aumento de sueldo funciona
//para cada tipo de empleado
public class Plantel {

public static void main(String[] args) {

JefeZona JefeZonaNorte, JefeZonaSur;
Vendedor Vendedor1, Vendedor2;
Secretario Secretario1, Secretario2;

JefeZonaNorte = new JefeZona ( "Mauro Scolapio",4,60000,
"Peugeot 308, Patente AA234");
JefeZonaSur = new JefeZona ("Hugo Prado",3,55000, "Citroen c4, Patente AB234");
Vendedor1 = new Vendedor ("Miguel Angel Zorzoni",10,30000,null,"Automovil",
"FHK 311", "Fiat", "Palio",1559364444, "Ventas-Zona Norte", 5.0);
Vendedor2 = new Vendedor ("Maximo Sarago",5,25000,null,"Camioneta","BOT 831",
"Renaul", "Kangoo", 1559365555, "Ventas-Zona Sur",5.0);
Secretario1 = new Secretario ("Rodrigo Ruiz",5,25000,null,1146385026,
"Oficina N° 5");
Secretario2 = new Secretario ("Mario Jerez",2,25000,null,1146385027,
"Oficina N° 9");

System.out.println("\n"+"-LISTADO DE JEFES DE ZONA-");
JefeZonaNorte.mostrarDatos();
JefeZonaSur.mostrarDatos();
System.out.println("\n"+"-LISTADO DE SECRETARIOS-");
Secretario1.mostrarDatos();
Secretario2.mostrarDatos();
System.out.println("\n"+"-LISTADO DE VENDEDORES-");
Vendedor1.mostrarDatos();
Vendedor2.mostrarDatos();
System.out.println("\n"+"=============================");
System.out.println("\n"+"-SE ASIGNAN JEFES A LOS VENDEDORES-");
JefeZonaNorte.asignarVendedor(Vendedor2);
JefeZonaSur.asignarVendedor(Vendedor1);
System.out.println("");
JefeZonaNorte.mostrarVendedores();
JefeZonaSur.mostrarVendedores();
System.out.println("\n"+"-SE ASIGNAN JEFES A LOS SECRETARIOS-");
JefeZonaNorte.asignarSecretario(Secretario2);
JefeZonaSur.asignarSecretario(Secretario1);
JefeZonaNorte.mostrarSecretario();
JefeZonaSur.mostrarSecretario();
System.out.println("\n"+"============================="+"\n");
System.out.println("\n"+"-SE AUMENTAN LOS SUELDOS A TODOS-");
System.out.println("\n"+"-A LOS VENDEDORES SOLO UN 10,0% ANUAL-");
Vendedor1.incrementarSalario(0.10);
Vendedor2.incrementarSalario(0.10);
System.out.println("\n"+"-A LOS SECRETARIOS SOLO 5,0% ANUAL-");
Secretario1.incrementarSalario(0.05);
Secretario2.incrementarSalario(0.05);
System.out.println("\n"+"-A LOS SECRETARIOS 20,0% ANUAL-");
JefeZonaNorte.incrementarSalario(0.20);
JefeZonaSur.incrementarSalario(0.20);
System.out.println("\n"+"============================="+"\n");
System.out.println("SE LES ASIGNA NUEVO AUTO A LOS JEFES"+"\n");
JefeZonaNorte.cambiarAuto("Citroen C5 Experience, Patente AA835");
JefeZonaSur.cambiarAuto("Peugeot 508 XL, Patente AA125"+"\n");
}

}
