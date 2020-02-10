package Empresa2018;

import java.util.Scanner;

class Empleado {
   String     nombre;
   int  antiguedad;
   double     salario;
   Empleado superior;

public Empleado(){
   nombre= "nombre y apellido";
   antiguedad= 0;
   salario= 0;
   superior = this;
}

public Empleado(String nom,int ant,double sal,Empleado sup){

   this.nombre=nom;
   this.antiguedad=ant;
   this.salario=sal;
   this.superior=sup;
}

public void mostrarDatos(){
   System.out.println("");
   System.out.println("Nombre: " + this.nombre);
   System.out.println("Antiguedad: " + this.antiguedad);
   System.out.println("Salario: $" + this.salario);

   if(this.superior == null)
       {
       System.out.println("Superior: " + "no tiene superior");
       }
   else
       {
       System.out.println("Superior: " + this.superior.nombre );
       }
}

public void cambiarSuperior(Empleado nuevoSuperior){
   this.superior = nuevoSuperior;
   }

public void cambiarSecretario(Empleado nuevoSecretario){
   this.superior = nuevoSecretario;
   }
public void cambiarAuto(String nuevoAuto){
   System.out.println("El nuevo auto asignado de "+this.nombre+
   " es: "+nuevoAuto);
   }

public void incrementarSalario(Double incrementoSalarial){
   System.out.println("");
   System.out.println("El sueldo previo al aumento: $"+this.salario);
   this.salario = this.salario + incrementoSalarial*this.salario;
   System.out.println("El sueldo con el aumento de: "+this.nombre+
   " es: $ "+this.salario);
   }
}//Fin clase empleado.