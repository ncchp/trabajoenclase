package oscurilandia;

public class Carro {
	
    private int cantidadOcupantes;
    private String fechaIngresoInstitucion;
    private int filaC;
    private int columnaC;
    
    public Carro () {
        }
    
    public Carro(int cantidadOcupantes, String fechaIngresoInstitucion) {
        this.cantidadOcupantes = cantidadOcupantes;
        this.fechaIngresoInstitucion = fechaIngresoInstitucion;
    }
        
    public int getCantidadOcupantes() {
        return cantidadOcupantes;
    }
    public void setCantidadOcupantes(int cantidadOcupantes) {
        this.cantidadOcupantes = cantidadOcupantes;
    }
    public String getFechaIngresoInstitucion() {
        return fechaIngresoInstitucion;
    }
    public void setFechaIngresoInstitucion(String fechaIngresoInstitucion) {
        this.fechaIngresoInstitucion = fechaIngresoInstitucion;
    }
    public int getFilaC() {
        return filaC;
    }
    public void setFilaC(int filaC) {
        this.filaC = filaC;
    }
    public int getColumnaC() {
        return columnaC;
    }
    public void setColumnaC(int columnaC) {
        this.columnaC = columnaC;
    }
    @Override
    public String toString() {
        return "Carro{" + "cantidadOcupantes=" + cantidadOcupantes + ", fechaIngresoInstitucion=" + fechaIngresoInstitucion + '}';
    }
}