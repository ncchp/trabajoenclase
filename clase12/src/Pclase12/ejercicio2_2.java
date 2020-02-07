package Pclase12;

import javax.swing.JOptionPane;

public class ejercicio2_2 {

	public static void main(String[] args) {
		String invertido = " ";
		String palabra = JOptionPane.showInputDialog("Ingresa una palabra");
		
		int word = palabra.length();
		
		for(int cont = word-1; cont>=0; cont--) {
			invertido = invertido + palabra.charAt(cont);
		}
		
		System.out.println(invertido);

	}
}
