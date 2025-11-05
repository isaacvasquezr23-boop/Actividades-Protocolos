package Ejercicio1;


public class Prueba {
    public static void main(String[] args) {
        Descuento descuentoPorcentaje = new Descuento(15); // 15%
        Descuento descuentoFijo = new DescuentoFijo(20000); // $20,000 fijos

        double precioOriginal = 100000;

        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Descuento del 15%: $" + descuentoPorcentaje.aplicarDescuento(precioOriginal));
        System.out.println("Descuento fijo de $20,000: $" + descuentoFijo.aplicarDescuento(precioOriginal));
    }
}

