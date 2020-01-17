package contador;

public class Contador {

	private int contador;

	public Contador() {

	}



	public Contador(int contador) {
		this.contador = contador;
		if(contador < 0 ) {
			this.contador=0;
		}

	}



	public Contador (final Contador c) {
		contador = c.contador;
	}



	public int getContador() {
		return contador;
	}



	public void setContador(int contador) {
		if (contador < 0) {
			this.contador = 0;
		} else {
			this.contador = contador;
		}
	}

	public void incrementar() {
		contador++;
	}

	public void decrementar () {
		contador--;
		if (contador < 0) {
			contador = 0;		
		}
	}
}
