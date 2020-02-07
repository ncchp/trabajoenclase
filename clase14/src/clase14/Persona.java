package clase14;

public class Persona {
	
	private String nombre;
	private int edad;
	private String rut;
	private char sexo;
	private double peso;
	private double altura;
	
	Persona(){
		this.nombre = "";
		this.edad = 0;
		this.sexo = 'H';
	    this.peso = 0;
	    this.altura = 0;
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	
    public int calcularIMC() {
    	double imc = (this.peso / (this.altura * this.altura));
    	int retorno = 0;
    			
    	if (imc > 20) {
    		retorno = -1;
    	}
    	else if (imc >= 20 && imc <= 25) {
    		retorno = 0;
    	}
    	else {
    		retorno = 1;
    	}	
    	return retorno;
    }
    
    public boolean esMayorDeEdad() {
    	boolean esmayor = false;
    	
    	if (this.edad >=18) {
    		esmayor = true;
    	}
    	
    	return esmayor;
    }
    
    private char comprobarSexo(char sexo) {
    	
    	if ( sexo != 'M' && sexo != 'M' ) {
    		sexo = 'H' ;
    	}
    	
    	return sexo;
    }

	
    @Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", rut=" + rut + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
    
    
    
    
    
}
