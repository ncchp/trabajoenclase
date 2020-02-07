package Pclase10;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner lector = new Scanner(System.in);
	int N = 0;
	int suma = 0 ;
	
	System.out.println("Ingrese el tamaño del arreglo ");
	
	N = lector.nextInt();
	
    int matriz [] = new int [N];
	
	for (int i = 0; i < matriz.length; i++) {
		int num=0;
				
		num = (int) (Math.random()*9);
		
		matriz[i] = num;
		
		suma=suma+num;
			}	for (int i = 0; i < matriz.length; i++)  {  
		System.out.println("En el indice "+i + " se encuentra el numero "+ matriz[i] );
	}
	System.out.println("la suma total es: " + suma);
	lector.close();		
	}
}
