package Ejercicio2;

public class ProductoClaseMala {
    private String nombre;
    private double precioBase;
    private double impuesto;

    public ProductoClaseMala(String nombre, double precioBase, double impuesto) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + ", Precio base: $" + precioBase + ", Impuesto: " + impuesto + "%");
    }

    public String generarEtiqueta() {
        return "Etiqueta: " + nombre + " - Precio Final: $" + calcularPrecioFinal();
    }

    public double calcularPrecioFinal() {
        return precioBase + (precioBase * (impuesto / 100));
    }
}

