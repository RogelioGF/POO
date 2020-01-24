package ejercicio1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float lado1 = 0, lado2 = 0;
		Cuadrilatero c1;
		
		System.out.print("Dime cuanto mide el primer lado: ");
		lado1=teclado.nextFloat();
		System.out.print("Dime cuanrto mide el segundo lado: ");
		lado2= teclado.nextFloat();
		
		
		if (lado1==lado2) { //es un cuadrado
			c1 = new Cuadrilatero(lado1);
		}else { //es un cuadrilatero
			c1 = new Cuadrilatero(lado1, lado2);
		}
		
		System.out.println("El perimetro del cuadrilatero es: " + c1.getPerimetro());

		System.out.println("El area del cuadrilatero es: " + c1.getArea());
		
		
		teclado.close();
	}

}
