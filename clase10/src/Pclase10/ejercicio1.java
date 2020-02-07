package Pclase10;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int A[] = new int[14];
	    
	    Scanner sc =new Scanner(System.in);
	    int i;
	    for (i=0;i<14;i++) {
	    	System.out.println("ingrese valor en posicion " + i);
	    	A[i] = sc.nextInt();
	    }
	    
	    i=0;
	    while (i<14) {
	    	System.out.println("El elemento en la posicion " + i + "es: " + A[i]);
	    i=i+1;
	    }
	    sc.close();
   
	}

}
