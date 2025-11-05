package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(1000);
        CuentaBancaria cuenta2 = new cuentaAhorros(2000, 5); // Sustitución válida

        cuenta1.depositar(500);
        cuenta2.depositar(300);

        cuenta1.retirar(700);
        cuenta2.retirar(1000);

        System.out.println("Saldo Cuenta Bancaria: $" + cuenta1.getSaldo());
        System.out.println("Saldo Cuenta Ahorros: $" + cuenta2.getSaldo());

        // Aplicar interés solo si es una cuenta de ahorros
        if (cuenta2 instanceof cuentaAhorros) {
            ((cuentaAhorros) cuenta2).aplicarInteres();
            System.out.println("Saldo tras aplicar interés: $" + cuenta2.getSaldo());
        }
    }
}

