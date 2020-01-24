/*
    Ejercicio 1: Construir un programa que calcule el �rea y el per�metro de un  
    cuadril�tero dada la longitud de sus dos lados. Los valores de la longitud deber�n
    introducirse por l�nea de ordenes. Si es un cuadrado, s�lo se proporcionar� la 
    longitud de uno de los lados al constructor.
*/

package ejercicio1;

public class Cuadrilatero {
    //Atributos
    private float lado1;
    private float lado2;
    
    //M�todos

    //M�todo Constructor 1 (Cuadrilatero)
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //M�todo Constructor 2 (Cuadrado)
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    
    public float getPerimetro(){
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
    }
    
    public float getArea(){
        float area = (lado1*lado2);
        return area;
    }
}