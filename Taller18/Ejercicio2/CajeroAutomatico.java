package Ejercicio2;

public class CajeroAutomatico implements Retiro, Transferencia {
    @Override
    public void retirar(double monto) {
        System.out.println("Retiro de $" + monto + " desde cajero automático.");
    }

    @Override
    public void transferir(double monto, String destino) {
        System.out.println("Transferencia de $" + monto + " a " + destino + " desde cajero automático.");
    }
}
