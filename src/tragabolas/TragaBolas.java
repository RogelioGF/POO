package tragabolas;

public class TragaBolas {
	
	private String color;
	private Integer bolasComidas;
	private Integer maxBolas;
	
	public TragaBolas(String color, Integer maxBolas) {
		this.color = color;
		this.maxBolas = maxBolas;
		bolasComidas=0;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getBolasComidas() {
		return bolasComidas;
	}

	public Integer getMaxBolas() {
		return maxBolas;
	}
	

	public void visualizar() {
		System.out.println("Color:" + color + " Numero de bolas comidas: " + bolasComidas + " Bolas maximas: " + maxBolas);
	}
	
	
	public void comer() {
		if (bolasComidas < maxBolas) {
			bolasComidas++;
			System.out.println("He comido una bola");
		}
	}
	
	public void trotar() {
		if(bolasComidas >= 1) {
			bolasComidas--;
			System.out.println("Estoy trotando");
		}
	}
	
	public void dormir () {
		if(bolasComidas==maxBolas) {
			System.out.println("Tripa llena. ZZZZZZZ");
			bolasComidas = bolasComidas/2;
		}else {
			System.out.println("No quiero dormir");
		}
	}
	
	
	
}
