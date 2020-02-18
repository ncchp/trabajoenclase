package bi;

import java.util.Scanner;

public class Bi {
	
	public static void main(String[] args) {
		Juego j = new Juego();
		
		Scanner sc = new Scanner(System.in);
		String jugada="";
		String mensaje;
		
		while(j.GameOver()) {
			Paint(j.getView());
			jugada=sc.next();
			mensaje=j.Fuego(jugada);
			Paint(mensaje);
		}
		Paint(j.getMensaje());
	}
	
	private static void  Paint(String view) {
		System.out.println(view);
	}

}
