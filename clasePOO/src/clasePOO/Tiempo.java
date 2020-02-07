package clasePOO;

public class Tiempo {

		private int hora;
		private int minuto;
		private int segundo;
		
		Tiempo(){
			
		}
		
		Tiempo(int _hora, int _minuto, int _segundo){
			this.hora = _hora;
			this.minuto = _minuto;
			this.segundo = _segundo;
		}
		
		Tiempo(int _hora2, int _minuto2){
			this.hora = _hora2;
			this.minuto = _minuto2;
			
		}
		
		Tiempo(int _hora3){
			this.hora = _hora3;
		}

		public void validacion() {
			if (hora < 24 && hora >= 0) {
				if (minuto < 60 && minuto >= 0) {
					if (segundo < 60 && segundo >= 0){
					
						  System.out.println(segundo);
					        System.out.println(minuto);
					        System.out.println(hora);
					}else {
						System.out.println("error");
					}
				}else {
					System.out.println("error");
				}
				
				
				
	     	}else {
				System.out.println("error");
			}
		
		
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//------------------------------------------------------------------------------------------
		//setters y getters
		public int getHora() {
			return hora;
		}

		public void setHora(int hora) {
			this.hora = hora;
		}

		public int getMinuto() {
			return minuto;
		}

		public void setMinuto(int minuto) {
			this.minuto = minuto;
		}

		public int getSegundo() {
			return segundo;
		}

		public void setSegundo(int segundo) {
			this.segundo = segundo;
		}
		
		//----------------------------------------------------------------------------
		
		
		
}


