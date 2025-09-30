package Ejercicio2;

public class CuentaBancaria {
    
    private int numeroCuenta;
    private double saldo;
    public String tipoCuenta;
    
    public CuentaBancaria (int numeroCuenta, double saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo);
        this.tipoCuenta = tipoCuenta;
}

    public double getSaldo(){
       return saldo;
       
   }
   
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: saldo no puede ser negativo.");
            this.saldo = 0;
        }
    }
    
    public void mostrarDetalles() {
        System.out.println("Cuenta: " + numeroCuenta +
                           " | Tipo: " + tipoCuenta +
                           " | Saldo: " + saldo);
    }
}