package Ejercicio2;


public class ServicioPagoFacturas implements PagoFactura {
   @Override
    public void pagarFactura(String empresa, double monto) {
        System.out.println("Pagando factura a " + empresa + " por $" + monto);
    }
}
