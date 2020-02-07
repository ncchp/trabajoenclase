package clasePOO;

public class Cuenta {
	String titular;
	double cantidad;
	Cuenta(String _titular){
		this.titular = _titular;
		this.cantidad = 0;
	}
	Cuenta (String _titular, double _cantidad){
		this.titular = _titular;
		this.cantidad = _cantidad;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	public void ingresar (double _cantidad) {
		if (_cantidad > 0) {
			this.cantidad = this.cantidad + _cantidad;
		}
	}
	public void retirar (double cantidad) {
		if (this.cantidad - cantidad < 0) {
			this.cantidad = 0;
		}
		else {
			this.cantidad = this.cantidad - cantidad;
		}
	}
}
