package Pclase13;

public class Password {

	int longitud;
	String contrasena;
	
	boolean esFuerte() {  
		boolean resultado = false;
		
		String clave = this.contrasena;
		
		int cmayusc = 0, cminusc = 0, cnum = 0;
		for (int i = 0; i < clave.length(); i++) {
			int valor = (int)clave.charAt(i);
			
			if (valor >= 65 && valor <= 90)
			    cmayusc++;
			
			if (valor >= 97 && valor <= 122)
			    cminusc++;
			
			if (valor >= 48 && valor <= 57)
				cnum++;
		}
		
		if (cmayusc >= 2 && cminusc >= 1 && cnum >= 5);
		resultado = true;
		
		return resultado;
	}
	
	void generarPassword() {
		int largo = this.longitud;
		
		String clave = "";
		
		for (int i = 0; i < largo; i++) {
		
			int num;
			do {
				num = (int)(Math.random()*(122-48+1)+48); 	
			}while(num < 48 || (num > 57 && num < 65) || (num > 90 && num < 97) || num > 122);
				
			  clave = clave + (char)num;
		}
		
		this.contrasena = clave;
	}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	Password(){   //contructo
		this.longitud = 8;  //largo 8
		this.generarPassword();
	}
	
    Password(int _longitud){   
		this.longitud = _longitud;  
		this.generarPassword();
	}

}

