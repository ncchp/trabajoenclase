//Tiene despacho, un secretario a cargo, una lista de vendedores a su cargo
//Tiene coche (Patente, marca y modelo)
//Aumenta su sueldo 20% anual
//Puede cambiar de secretario. Cambiar coche
//Puede dar de alta y baja un vendedor en su zona.

package Empresa2018;
import java.util.ArrayList;

public class JefeZona extends Empleado{
   String coche;
   ArrayList<Vendedor> vendedores = new ArrayList<>();
  ArrayList<Secretario> secretarios = new ArrayList<>();
 
public JefeZona(){
   super();
}    
public JefeZona(String nom, int ant, double sal, String coche){
       super(nom, ant, sal, null);
       this.coche = coche;
}
public void asignarVendedor(Vendedor nuevoVendedor){
       this.vendedores.add(nuevoVendedor);//Agrega vendedor a la lista
       nuevoVendedor.cambiarSuperior(this);//Cambia el superior del empleado
}

public void mostrarVendedores(){
   for (int i=0; i< this.vendedores.size(); i++)
   {
       this.vendedores.get(i).mostrarDatos();
   }
}

public void asignarSecretario(Secretario nuevoSecretario){
       this.secretarios.add(nuevoSecretario);
       nuevoSecretario.cambiarSuperior(this);//DENTRO DEL PACKAGE EMPRESA2018
}

public void mostrarSecretario(){
   for (int i=0; i< this.secretarios.size(); i++)
   {
       this.secretarios.get(i).mostrarDatos();
   }    
}
@Override
   public void mostrarDatos(){
   System.out.println("");
   super.mostrarDatos();
   System.out.println("El auto asignado es: "+this.coche);
   }
}//Fin de la clase jefe de zona.

