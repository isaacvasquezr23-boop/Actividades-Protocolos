package Ejercicio1;

public class Vehiculo {
    String marca;
    double velocidadMaxima;
    
    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;

}

     public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " kilómetros por hora");

}
 }    