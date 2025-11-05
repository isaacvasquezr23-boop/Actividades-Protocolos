package Ejercicio1;

public class PruebaClaseMala {
     public static void main(String[] args) {
        Descuento descuento = new Descuento(10); // 10% de descuento
        double precioFinal = descuento.aplicarDescuento(100000);
        System.out.println("Precio final con descuento del 10%: $" + precioFinal);
    }
}

