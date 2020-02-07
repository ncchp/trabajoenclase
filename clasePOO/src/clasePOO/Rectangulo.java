package clasePOO;

public class Rectangulo {
	
	int base;
	int altura;
	
	Rectangulo(){
		
	}
	
	
	
	
	Rectangulo(int _base, int _altura){
		this.base = _base;
		this.altura = _altura;
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int calcularArea() {
		int area = altura * base;
		return area;
	}
	
	public int calcularPerimetro() {
		int perimetro = altura * 2 + base * 2;
		return perimetro;
	}
}
