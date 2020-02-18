package bi;

import java.util.Arrays;





class Juego {

	private final String[][]tablero=new String[10][10];
	private final int[]JugadaActual= {-1,-1};
	private final int Level = 0;
	private String msg;
	private short disparos=3;
	private int inpactos=0;
	private int aux_inpactos=0;
	
	public void juego() {
		Init();
	}
	
	private void Init() {
		for(int i=0;i<tablero.length;i++) {
			Arrays.fill(tablero[i]," .");
		}
		Levels();
	}
	
	private void Levels() {
		switch(Level){
			case 0:
				tablero[1][3]="H";
				tablero[2][3]="H";	
				tablero[3][3]="H";
				
				tablero[6][4]="H";
				tablero[7][3]="H";
				tablero[8][2]="H";
				tablero[9][1]="H";
				
				tablero[8][7]="H";
				tablero[8][8]="H";
				inpactos=9;
				break;
			case 1:
				break;
			default:
		}		
	}
	
	public  boolean GameOver() {
		if(aux_inpactos==inpactos) {
			
			Init();
			aux_inpactos=0;
		}
		boolean rt=(disparos > 0);
		if(!rt) {
			msg = "Fin del juego";
		}
		return rt;
	}
	
	public String getView() {
		String sTablero= "--";
		for(int r=0;r<tablero.length;r++) {
			sTablero+= r + "-";
		}
		for (int s=0;s<tablero.length;s++) {
			sTablero+= "\n" + s + "|";
			for(String arg : tablero[s]){
				sTablero+=arg+"";
			}
		}
		return sTablero;
	}
	
	String getMensaje() {
		return msg;
	}
	
	public String Fuego(String jugada) {
		if(ValidaJugada(jugada)) {
			int x = JugadaActual[0];	
			int y = JugadaActual[1];
		if(tablero[x][y].equals("H")) {
			tablero[x][y]="X";
			aux_inpactos++;
		}else {
			tablero[x][y]="O";
			disparos--;
			}
		}
		return "Disparos" + disparos +"\n"+ msg;
	}
	
	private boolean ValidaJugada(String jugada) {
		try {
			msg="";
			if(jugada.length()>=3) {
				JugadaActual[0]=-1;
				JugadaActual[1]=-1;
				String[]arrayJugada=jugada.split(",");
				if(arrayJugada.length==2) {
					JugadaActual[0]=Integer.parseInt(arrayJugada[0]);
					JugadaActual[1]=Integer.parseInt(arrayJugada[1]);
					if (JugadaActual[0]<tablero.length && JugadaActual[1]<tablero[0].length) {
						disparos++;
						return true;
					}
				}
			}
			msg = "Jugada Invalida";
			disparos--;
			return false;
		}catch(Exception e) {
			msg ="Jugada Invalida";
			disparos--;
			return false;	
		}
	}
}
