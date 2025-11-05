package Ejercicio2;

public class EtiquetaProducto {
    private CalculoPrecio calculadora = new CalculoPrecio();

    public String generarEtiqueta(Producto producto) {
        double precioFinal = calculadora.calcularPrecioFinal(producto);
        return "Etiqueta: " + producto.getNombre() + " - Precio Final: $" + precioFinal;
    }
} 

