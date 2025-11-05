package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente();
        CajeroAutomatico cajero = new CajeroAutomatico();
        ServicioPagoFacturas servicio = new ServicioPagoFacturas();

        cuenta.transferir(50000, "Cuenta Ahorros 1234");
        cajero.retirar(200000);
        servicio.pagarFactura("Electricaribe", 150000);
    }
}
