package clasePOO;

public class PruebaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta cuenta1 = new Cuenta("Fulano", 10000);
		System.out.println(cuenta1.toString());
		
		cuenta1.ingresar(5000);
		System.out.println(cuenta1.toString());
		
		cuenta1.ingresar(-10000);
		System.out.println(cuenta1.toString());
		
		cuenta1.setTitular("Sutano");
		
		cuenta1.retirar(2000);
		System.out.println(cuenta1.toString());
		
		cuenta1.titular = "Mengano";
		
		cuenta1.retirar(7000);
		System.out.println(cuenta1.toString());


		
		
	}

}
