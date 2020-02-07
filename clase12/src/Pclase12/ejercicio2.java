package Pclase12;

import java.util.Scanner;

	  public class ejercicio2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String cadena = sc.nextLine(); //leemos la cadena
	        String cadenaInvertida = "";
	        //iteramos de forma invertida, partimos de la ultima posicion valida
	        //hasta la primera posicion valida que el cero
	        //vamos disminuyendo el valor de i en una unidad -1
	        for (int i = cadena.length() - 1 ; i >= 0; i--) {
	            char car = cadena.charAt(i); //obtenemos el caracter en la posicion i
	            cadenaInvertida = cadenaInvertida + car;
	        }
	        //mostramos por pantalla la cadena invertida
	        System.out.println("La cadena invertida es: " + cadenaInvertida);
	   
	}

}