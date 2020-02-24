package oscurilandia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Tablero {
    public static List<Kromi> Lista_Kromi = new ArrayList<Kromi>();
    public static List<Caguano> Lista_Caguano = new ArrayList<Caguano>();
    public static List<Trupalla> Lista_Trupalla = new ArrayList<Trupalla>();
    public static List<Huevo> Lista_Huevo = new ArrayList<Huevo>();    
    private static int puntaje = 0;
    private static char[][] tablero;
    
    public static void iniciarMatriz() {
        tablero = new char[15][15];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                tablero[i][j] = '0';
            }
        }
    }
    
    public static void mostrar() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void verificarDestruidos() {
    	
    	for (Kromi kro:Lista_Kromi) {
    		int fila = kro.getFilaC();
    		int columna = kro.getColumnaC();
    		
    		if (tablero[fila][columna] == 'H' && tablero[fila+1][columna] == 'H' && tablero[fila+2][columna] == 'H') {
    			puntaje += 10;
    		}
    	}

    	for (Caguano cag:Lista_Caguano) {
    		int fila = cag.getFilaC();
    		int columna = cag.getColumnaC();
    		
    		if (tablero[fila][columna] == 'H' && tablero[fila][columna+1] == 'H') {
    			puntaje += 7;
    		}
    	}
    	
    }
    
    public static void lanzarHuevo() {
        //pedir fila por teclado
        //pedir columna por teclado
        //verificar si en la celda de la matriz hay un K, C o T
        //si hay alguno de los tres anteriores, se suma puntos al atributo puntaje
        Scanner lector = new Scanner(System.in);
        System.out.println("INGRESE LA FILA QUE DECEA LANZAR EL HUEVO 0 - 14");
        int filaC = lector.nextInt();
        System.out.println("INGRESE LA CULUMNA QUE DECEA LANZAR EL HUEVO 0 - 14 ");
        int columnaC = lector.nextInt();
        Huevo huevo1 = new Huevo(filaC,columnaC);
        Lista_Huevo.add(huevo1);
        System.out.println("la lista es : " + Lista_Huevo);
        if (tablero[filaC][columnaC] == 'K') {
            tablero[filaC][columnaC] = 'H';
            puntaje = puntaje + 3;
        } else if (tablero[filaC][columnaC] == 'C') {
            tablero[filaC][columnaC] = 'H';
            puntaje = puntaje + 2;
        } else if (tablero[filaC][columnaC] == 'T') {
            tablero[filaC][columnaC] = 'H';
            puntaje = puntaje + 2;
        }
        System.out.println("... lanzando huevo ... ");
    }
    
    public static void verPuntaje() {
        System.out.println("EL PUNTAJE TOTAL ES : " + puntaje);
    }
    
    public static void agregar() {
        /*INGRESO EN LA SENTENCIA*/
        System.out.println("ELIGA OPCION PARA INGRESAR UN CARRO");
        System.out.println("1. KROMI");
        System.out.println("2. CAGUANO");
        System.out.println("3. TRUPALLA");
        System.out.println("4. Volver");
        Scanner lector = new Scanner(System.in);
        boolean disponible;
        int opcion = lector.nextInt();
        /*INGRESO EN LA SENTENCIA SWITCH*/
        switch (opcion) {
            case 1:
                System.out.println("INGRESE AÑO DE FABRICACION");
                String anioFabricacion = lector.next(); //se lee la opcion ingresada
                System.out.println("INGRESE MARCA");
                String marca = lector.next(); //se lee la opcion ingresada
                System.out.println("CANTIDAD DE OCUPANTES");
                int cantidadOcupantes = lector.nextInt(); //se lee la opcion ingresada
                System.out.println("FECHA DE INGRESO A LA INSTITUCION");
                String fechaIngresoInstitucion = lector.next(); //se lee la opcion ingresada
                int filaK, columnaK;
                disponible = false;
                do{
                    filaK = (int)(Math.random()*13);
                    columnaK = (int)(Math.random()*15);
                    if (tablero[filaK][columnaK] == '0' && tablero[filaK+1][columnaK] == '0' && tablero[filaK+2][columnaK] == '0'){
                        disponible = true;
                    }
                }while (disponible == false);
                System.out.println("La kromi quedo en la fila: " + filaK + " y columna: " + columnaK);
                Kromi kromi = new Kromi(cantidadOcupantes, fechaIngresoInstitucion, anioFabricacion, marca);
                kromi.setFilaC(filaK);
                kromi.setColumnaC(columnaK);
                tablero[filaK][columnaK] = 'K';
                tablero[filaK+1][columnaK] = 'K';
                tablero[filaK+2][columnaK] = 'K';
                Lista_Kromi.add(kromi);//se guarda objeto en lista kromi
                break;
            case 2:
                System.out.println("CANTIDAD DE OCUPANTES");
                int cantidadOcupantesCaguano = lector.nextInt(); //se lee la opcion ingresada
                System.out.println("FECHA DE INGRESO A LA INSTITUCION");
                String fechaIngresoInstitucionCaguano = lector.next(); //se lee la opcion ingresada
                System.out.println("INGRESE EL ALCANCE DE TIRO");
                int alcanceTiro = lector.nextInt(); //se lee la opcion ingresada
                System.out.println("COLOR DE CONFETI");
                String colorConfeti = lector.next(); //se lee la opcion ingresada
                //System.out.println("FILA: ");
                //int filaC = lector.nextInt(); //se lee la opcion ingresada
                //System.out.println("COLUMNA: ");
                //int columnaC = lector.nextInt(); //se lee la opcion ingresada
                Caguano caguano = new Caguano(cantidadOcupantesCaguano, fechaIngresoInstitucionCaguano, alcanceTiro, colorConfeti);
                //int filaC = (int) (Math.random()*15);
                //int columnaC = (int) (Math.random()*14);
                int filaC, columnaC;
                disponible = false;
                do{
                    filaC = (int)(Math.random()*15);
                    columnaC = (int)(Math.random()*14);
                    if (tablero[filaC][columnaC] == '0' && tablero[filaC][columnaC+1] == '0'){
                        disponible = true;
                    }
                }while (disponible == false);
                System.out.println("El caguano quedo en la fila " + filaC + " y columna" + columnaC);
                caguano.setFilaC(filaC);
                caguano.setColumnaC(columnaC);
                tablero[filaC][columnaC] = 'C';
                tablero[filaC][columnaC+1] = 'C';
                Lista_Caguano.add(caguano);//se guarda objeto en lista carro
                break;
            case 3:
                System.out.println("CANTIDAD DE OCUPANTES");
                int cantidadOcupantesTrupalla = lector.nextInt(); //se lee la opcion ingresada
                System.out.println("FECHA DE INGRESO A LA INSTITUCION");
                String fechaIngresoInstitucionTrupalla = lector.next(); //se lee la opcion ingresada
                System.out.println("INGRESE NIVEL DE ARMADURA DE 1 - 5");
                int niveldeArmadura = lector.nextInt(); //se lee la opcion ingresada
                System.out.println("INGRESE NOMBRE DE QUIEN MANIPULA");
                String nombreManipula = lector.next(); //se lee la opcion ingresada
              //  System.out.println("FILA: ");
               // int filaT = lector.nextInt(); //se lee la opcion ingresada
                //System.out.println("COLUMNA: ");
                //int columnaT = lector.nextInt(); //se lee la opcion ingresada
                Trupalla trupalla = new Trupalla(cantidadOcupantesTrupalla, fechaIngresoInstitucionTrupalla, niveldeArmadura, nombreManipula);
                //int filaT = (int) (Math.random()*15);
                //int columnaT = (int) (Math.random()*15);
                int filaT, columnaT;
                disponible = false;
                do{
                    filaT = (int)(Math.random()*15);
                    columnaT = (int)(Math.random()*15);
                    if (tablero[filaT][columnaT] == '0'){
                        disponible = true;
                    }
                }while (disponible == false);
               trupalla.setFilaC(filaT);
               trupalla.setColumnaC(columnaT);
               System.out.println("El trupalla quedo en la fila: " + filaT + " y columna: " + columnaT);
                tablero[filaT][columnaT] = 'T';
                Lista_Trupalla.add(trupalla);//se guarda objeto en lista carro
                break;
            default:
                System.out.println("Opcion no valida");
        }//cierra Switch
    }//cierra metodo

    private static void salir() {
    	verificarDestruidos();
    	verPuntaje();
        System.out.println("Salida ");
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Menu del programa y lector de variables.
        iniciarMatriz();
        Scanner lector = new Scanner(System.in);
        int opcionMenu1;
        do {
            System.out.println("Menu");
            System.out.println(" ");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar matriz");
            System.out.println("3. Lanzar huevo");
            System.out.println("4. Ver puntaje");
            System.out.println("5. Salir");
            System.out.println(" ");
            System.out.print("Elija su opcion: ");
            opcionMenu1 = lector.nextInt(); //se lee la opcion ingresada
            switch (opcionMenu1) {
                case 1:
                    agregar();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    lanzarHuevo();
                    break;
                 case 4:
                    verPuntaje();
                    break;
                case 5:
                    salir();
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (opcionMenu1 != 5);
        
    }
}