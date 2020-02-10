package Empresa2018;
//Tiene Coche, lo puede cambiar y aumenta su sueldo 10% Anual.
public class Vendedor extends Empleado{
   String coche;
   String patente;
   String marca;
   String modelo;
   int celular;
   String areaventa;
   double comision;
   
public Vendedor (){
   super();
   this.coche= "Automóvil";
   this.patente="FHK 311";
   this.marca="FIAT";
   this.modelo="Palio";
   this.celular=1559364444;
   this.areaventa="Ventas-Zona Norte";
   this.comision= 5.0;
}      

public Vendedor (String nom, int ant, double sal, Empleado sup, String coche,
       String patente, String marca, String modelo, int celular,
       String areaventa, double comision){
       
       super(nom, ant, sal, sup);
       this.coche = coche;
       this.patente=patente;
       this.marca=marca;
       this.modelo=modelo;
       this.celular=celular;
       this.areaventa=areaventa;
       this.comision=comision;
   }
   @Override
public void mostrarDatos(){
   System.out.println("");
   super.mostrarDatos();
   System.out.println(this.coche+": "+this.marca+" "+this.modelo+", patente: "+
   this.patente);
   System.out.println("El celular es: "+celular+" su area es: "+areaventa+
   " y su comisión es: "+comision+ "% de las ventas.");
}

}//Fin clase de vendedores.