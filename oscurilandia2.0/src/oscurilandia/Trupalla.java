package oscurilandia;

public class Trupalla extends Carro {
    private int niveldeArmadura;
    private String nombreManipula;
    
    public Trupalla(int cantidadOcupantes, String fechaIngresoInstitucion, int nivelArmadura, String nombreManipula) {
        super(cantidadOcupantes, fechaIngresoInstitucion);
        this.niveldeArmadura = nivelArmadura;
        this.nombreManipula = nombreManipula;
    }
    public int getNiveldeArmadura() {
        return niveldeArmadura;
    }
    public void setNiveldeArmadura(int niveldeArmadura) {
        this.niveldeArmadura = niveldeArmadura;
    }
    public String getNombreManipula() {
        return nombreManipula;
    }
    public void setNombreManipula(String nombreManipula) {
        this.nombreManipula = nombreManipula;
    }
    @Override
    public String toString() {
        return "Trupalla{" + "niveldeArmadura=" + niveldeArmadura + ", nombreManipula=" + nombreManipula + '}';
    }
}