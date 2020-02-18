package oscurilandia;

public class Kromi extends Carro{
    private String anioFabricacion;
    private String marca;
    public Kromi(int cantidadOcupantes, String fechaIngresoInstitucion, String anioFabricacion, String marca) {
        super(cantidadOcupantes, fechaIngresoInstitucion);
        this.anioFabricacion = anioFabricacion;
        this.marca = marca;
    }
    public String getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "Kromi{" + "anioFabricacion=" + anioFabricacion + ", marca=" + marca + '}';
    }
}
