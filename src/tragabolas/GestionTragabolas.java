package tragabolas;

import java.util.*;

public class GestionTragabolas {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int opcion, bolas = 0;
		String color = "";


		while(!salir) {
			System.out.println("1-Crear tragabolas\n2-Comer"
					+ "\n3-Trotar\n4-Dormir\n5-Ver estado\n0- Salir");


			try {
				System.out.println("Escribe una de las opciones:");
				opcion = sc.nextInt();

				switch(opcion) {
				case 1:
					color = colorTragabolas();
					TragaBolas tragaBolas = new TragaBolas(color, bolas);



					break;
				case 2:


					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 0:
					salir = true;
					break;
				default:
					System.out.println("Solo numeros entre 1 y 5");
				}//switch

			}//try 
			catch(InputMismatchException e){
				System.out.println("Debes insertar un numero");
				sc.nextInt();
			}//catch
		}//while


	}//main

	public static String colorTragabolas () {
		Scanner teclado = new Scanner(System.in);
		String color;

		do {
			System.out.println("Debes elegir un color entre azul, amarillo, rojo o verde");
			color = teclado.nextLine();
			color = color.toUpperCase();

		}while(color != "AZUL" & color != "AMARILLO" & color != "ROJO" & color != "VERDE" );

		return color;
	}//color

}//class
