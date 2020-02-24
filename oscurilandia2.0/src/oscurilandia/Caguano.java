package oscurilandia;
public class Caguano extends Carro {
    private int	alcanceTiro;
    private String colorConfeti;
    
    public Caguano(int cantidadOcupantes2, String fechaIngresoInstitucion, int alcanceTiro, String colorConfeti) {
        super(cantidadOcupantes2, fechaIngresoInstitucion);
        this.alcanceTiro = alcanceTiro;
        this.colorConfeti = colorConfeti;
    }
    public int getAlcanceTiro() {
        return alcanceTiro;
    }
    public void setAlcanceTiro(int alcanceTiro) {
        this.alcanceTiro = alcanceTiro;
    }
    public String getColorConfeti() {
        return colorConfeti;
    }
    public void setColorConfeti(String colorConfeti) {
        this.colorConfeti = colorConfeti;
    }
    public String toStrinsg() {
        return "Caguano{" + "alcanceTiro=" + alcanceTiro + ", colorConfeti=" + colorConfeti + '}';
    }
}
