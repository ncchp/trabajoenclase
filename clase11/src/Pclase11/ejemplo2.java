package Pclase11;

import java.util.Scanner;

public class ejemplo2 {

	public static void main(String[] args) {Scanner leer = new Scanner(System.in); int n1; int n2; System.out.println("Ingresa el primer número"); n1 = leer.nextInt(); System.out.println("Ingresa el segundo número"); n2 = leer.nextInt(); if (n1>n2) System.out.println(n1 + " es mayor que " + n2);  else if (n1<n2) System.out.println(n1 + " es menor que " + n2); else if (n1==n2)  System.out.println(n1 + " es igual que " + n2);leer.close();} }



