package pzoologico;

import java.util.ArrayList;

public class Zoologico {
	private static ArrayList<AnimalesTerrestres> aniterrestre = new ArrayList<AnimalesTerrestres>();
	ArrayList<AnimalesAcuaticos> aniacuatico = new ArrayList<AnimalesAcuaticos>();
	ArrayList<AnimalesVoladores> anivoladores = new ArrayList<AnimalesVoladores>();
	
	public static void addAnimalTerrestre(AnimalesTerrestres aniter) {
		aniterrestre.add(aniter);
	}
	
	public static void mostrarTerrestre() {
		for (AnimalesTerrestres ani:aniterrestre) {
			System.out.println("Nombre: " + ani.getNombre() + ", ORIGEN: " + ani.getPaisOrigen() + ", FECHA: " + ani.getFecha()  + ", ALIMENTACION: " + ani.getAlimentacion()  + ", Horas Sueño: " + ani.getHorasSueno() + ", cantidad patas: " + ani.getCantidadPatas());
		}
	}
	
	public static void main(String[] args) {
		AnimalesTerrestres ani1 = new AnimalesTerrestres("12-01-2020","perro","chile",4,5,"carne");
		addAnimalTerrestre(ani1);
		mostrarTerrestre();
	}
}
