package Empresa2018;
//Tiene despacho, numero de fax y aumenta su sueldo 5% anual
//Debe mostrar su puesto. Lo resuelvo con el sout"Puesto: tal"

import java.util.ArrayList;


public class Secretario extends Empleado {
   String Despacho;
   int numFax;
public Secretario (){
       super();
       this.Despacho = "Oficina N°5";
       this.numFax = 1146385026;
}
public Secretario(String nom, int ant, double sal, Empleado sup,
       int numFax, String Despacho){  
       super(nom, ant, sal, sup);
       this.Despacho = Despacho;
       this.numFax = numFax;
}  
   @Override
   public void mostrarDatos(){
   System.out.println("");
   super.mostrarDatos();
   System.out.println("Despacho: "+this.Despacho);
   System.out.println("El Fax es: "+this.numFax);
}

}//Fin Clase secretario.
