package Ejercicio2;


public class Prueba {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop hp", 350, 19);
        CalculoPrecio calculadora = new CalculoPrecio();
        EtiquetaProducto etiqueta = new EtiquetaProducto();

        double precioFinal = calculadora.calcularPrecioFinal(producto);
        System.out.println("Precio final calculado: $" + precioFinal);
        System.out.println(etiqueta.generarEtiqueta(producto));
    }
}

