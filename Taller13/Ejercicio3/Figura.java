package Ejercicio3;

public abstract class Figura {
    
    default void mostrarFigura() {
    
   System.out.println("Mostremos firgura");
 }

    public abstract double calcularArea();
}