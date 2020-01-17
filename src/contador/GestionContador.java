package contador;

import java.util.*;

public class GestionContador {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	       
	        //Utilizar el constructor por defecto
	        Contador contador1 = new Contador();
	      
	        int n;
	        System.out.println("Introduce valor para inicializar el contador: ");
	        n = sc.nextInt();
	       
	        //asignar un valor al contador
	        contador1.setContador(n);
	        //incrementar el contador
	        contador1.incrementar();
	        //mostrar el valor actual
	        System.out.println(contador1.getContador());
	       
	        contador1.incrementar();
	        contador1.incrementar();
	       
	        //mostrar el valor actual
	        System.out.println(contador1.getContador());
	       
	        //restar 1 al valor del contador
	        contador1.decrementar();
	       
	        //mostrar el valor actual
	        System.out.println(contador1.getContador());

	        //crear un nuevo objeto Contador con valor inicial 10
	        Contador contador2 = new Contador(10);
	       
	        //incrementar y decrementar el contador2 y mostrar su valor
	        contador2.incrementar();
	        System.out.println(contador2.getContador());
	        contador2.decrementar();
	        System.out.println(contador2.getContador());

	        //crear un objeto Contador utilizando el constructor copia
	        //se crea el objeto contador3 como copia de contador2
	        Contador contador3 = new Contador(contador2);

	        //mostrar el valor de contador3
	        System.out.println(contador3.getContador());
	        sc.close();
	}

}
