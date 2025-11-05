package Ejercicio2;


public class CalculoPrecio {
   public double calcularPrecioFinal(Producto producto) {
        return producto.getPrecioBase() + (producto.getPrecioBase() * (producto.getImpuesto() / 100));
    }
} 

