package Ejercicio2;


public class CuentaCorriente implements Transferencia, Retiro, PagoFactura {
     @Override
    public void transferir(double monto, String destino) {
        System.out.println("Transferencia de $" + monto + " a " + destino + " desde cuenta corriente.");
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retiro de $" + monto + " desde cuenta corriente.");
    }

    @Override
    public void pagarFactura(String empresa, double monto) {
        System.out.println("Pago de factura a " + empresa + " por $" + monto + " desde cuenta corriente.");
    }
}
