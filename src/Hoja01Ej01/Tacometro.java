package Hoja01Ej01;

		/*Desarrollar un programa en Java que utilice una clase que se llame Indicador que sea la
		representaci�n de un indicador de la vida real (indicadores de nivel, de velocidad,
		tac�metros, etc).
		La clase deber� tener los atributos valorMinimo, valorMaximo, valorActual,
		unidades y nombre del indicador. En el momento de la creaci�n de cada objeto se
		asignar�n todos los elementos salvo el valorActual. Entre los m�todos que se
		programar�n deber�n estar el de asignaci�n del valorActual, imprimir el valor, imprimir el
		indicador e incrementar y disminuir el valorActual con el que cuentan.
		En ese programa (el principal), crear�s un vector de elementos de tipo Indicador y se podr�
		escoger el indicador a tratar.*/

	/*atributos*/

public class Tacometro {

	private int valorMinimo;
	private int valorMaximo;
	private int valorActual;
	private String unidades;
	private String nombre;
	
	/*constructor*/
	
	public Tacometro(int valorMinimo, int valorMaximo, int valorActual, String unidades, String nombre) {
		super();
		this.valorMinimo = valorMinimo;
		this.valorMaximo = valorMaximo;
		this.valorActual = valorActual;
		this.unidades = unidades;
		this.nombre = nombre;
	}

	/*getters and setters*/

	public int getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(int valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public int getValorMaximo() {
		return valorMaximo;
	}

	public void setValorMaximo(int valorMaximo) {
		this.valorMaximo = valorMaximo;
	}

	public int getValorActual() {
		return valorActual;
	}

	public void setValorActual(int valorActual) {
		this.valorActual = valorActual;
	}

	public String getUnidades() {
		return unidades;
	}

	public void setUnidades(String unidades) {
		this.unidades = unidades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
}
