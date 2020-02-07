package clase14;

public class imc {
	private static final int PESO_IDEAL = 0;
	private static final int INFRAPESO = 0;
	private static final int SOBREPESO = 0;

	public int calcularIMC() {
        //Calculamos el peso de la persona
        int peso = 0;
		double altura = 0;
		double pesoActual = peso / (Math.pow(altura, 2));
        //Segun el peso, devuelve un codigo
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_IDEAL;
        } else if (pesoActual < 20) {
            return INFRAPESO;
        } else {
            return SOBREPESO;
        }

}
}
