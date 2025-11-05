package Ejercicio2;

public class cuentaAhorros extends CuentaBancaria {
     private double interesAnual;

    public cuentaAhorros(double saldoInicial, double interesAnual) {
        super(saldoInicial);
        this.interesAnual = interesAnual;
    }

    public void aplicarInteres() {
        double interes = saldo * (interesAnual / 100);
        saldo += interes;
    }

    @Override
    public void retirar(double monto) {
        // Se mantiene el mismo comportamiento base, sin restricciones inesperadas
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes en cuenta de ahorros.");
        }
    }
}

