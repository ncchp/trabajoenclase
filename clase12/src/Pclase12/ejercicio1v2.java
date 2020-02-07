package Pclase12;

import java.util.Scanner;

public class ejercicio1v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//char vocales [] = {'a','e','i','o','u'};
		char vocales[] = new char[10];
		vocales[0] = 'a';
		vocales[1] = 'e';
		vocales[2] = 'i';
		vocales[3] = 'o';
		vocales[4] = 'u';
		vocales[5] = 'A';
		vocales[6] = 'E';
		vocales[7] = 'I';
		vocales[8] = 'O';
		vocales[9] = 'U';
        Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese cadena a evaluar: ");
		String cadena = "";
		cadena = scanner.next();	
		
		cadena = cadena.toLowerCase();
		
		int contvocales = 0, pos;
		for (int i=0; i < vocales.length; i++) {
	    	pos = -1;
	    		do {
	    			pos = cadena.indexOf(vocales[i],pos+1);
	    			if (pos > -1) {
	    			    System.out.println("La posicion de la letra  " + vocales[i] + " es " + pos);
	    			    contvocales++;
	    			}
	   } while (pos > -1);
	   }
	    		
	   System.out.println("La cantidad de vocales es: " + contvocales);
	   scanner.close();

	
	}

}
