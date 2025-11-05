/*
 
package Ejercicio2;

public interface OperacionBancaria {
     void transferir(double monto, String destino);
    void retirar(double monto);
    void pagarFactura(String empresa, double monto);

}
public class CuentaCorriente implements OperacionBancaria {
    @Override
    public void transferir(double monto, String destino) {
        System.out.println("💸 Transferencia de $" + monto + " a " + destino + " desde cuenta corriente.");
    }

    @Override
    public void retirar(double monto) {
        System.out.println("🏧 Retiro de $" + monto + " desde cuenta corriente.");
    }

    @Override
    public void pagarFactura(String empresa, double monto) {
        System.out.println("🧾 Pago de factura a " + empresa + " por $" + monto + " desde cuenta corriente.");
    }
}
  Imaginemo que ahora, queremos una clase que maneje pagos automaticos
Con un nombre: ServicioPagoFacturas 

public class ServicioPagoFacturas implements OperacionBancaria {
    @Override
    public void transferir(double monto, String destino) {
        //  No aplica
        throw new UnsupportedOperationException("No se pueden hacer transferencias desde este servicio.");
    }

    @Override
    public void retirar(double monto) {
        //  No aplica
        throw new UnsupportedOperationException("No se pueden hacer retiros desde este servicio.");
    }

    @Override
    public void pagarFactura(String empresa, double monto) {
        System.out.println(" Pagando factura a " + empresa + " por $" + monto);
    }
} 
 La clase implementa metodos que no necesita, lo cual viola el principiio de ISP
*/