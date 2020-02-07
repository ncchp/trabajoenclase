package Pclase10;

import java.util.ArrayList;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ArrayList listaNums= new ArrayList();
			listaNums.add(8); 
			listaNums.add(3); 
			listaNums.add(5); 
			System.out.println("Lista de numeros: " + listaNums);
			System.out.println("Numero posicion 2:" + listaNums.get(2)); 
			listaNums.set(0,15); 
			System.out.println("Numero posicion 2:" + listaNums.get(1));
			System.out.println("Lista de numeros: "+listaNums); 
			}  
	}


