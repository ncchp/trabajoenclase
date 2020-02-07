package Pclase12;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String cadena = "";
		cadena = scanner.next();	
		
		int pos;
		pos = -1;
		int contvocales = 0;
		do {
			pos = cadena.indexOf('a',pos+1);
			if (pos > -1) {
			System.out.println("La posicion de la letra 'a' es: " + pos);
			contvocales++;
			}
		} while (pos > -1);
		
		pos = -1;
		do {
			pos = cadena.indexOf('e',pos+1);
			if (pos > -1) {
			System.out.println("La posicion de la letra 'e' es: " + pos);
			contvocales++;
			}
		} while (pos > -1);
		
		pos = -1;
		do {
			pos = cadena.indexOf('i',pos+1);
			if (pos > -1) {
			System.out.println("La posicion de la letra 'i' es: " + pos);
			contvocales++;
			}
		} while (pos > -1);
		
		pos = -1;
		do {
			pos = cadena.indexOf('o',pos+1);
			if (pos > -1) {
			System.out.println("La posicion de la letra 'o' es: " + pos);
			contvocales++;
			}
		} while (pos > -1);
		
		pos = -1;
		do {
			pos = cadena.indexOf('u',pos+1);
			if (pos > -1) {
			System.out.println("La posicion de la letra 'u' es: " + pos);
			contvocales++;
			}
		} while (pos > -1);
		
		
		System.out.println("La cantidad de vocales es: " + contvocales);
		scanner.close();

	
	}
}
