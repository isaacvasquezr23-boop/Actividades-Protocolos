package Ejercicio2;

public class Prueba {
    
    public static void main(String[] args) {
        
     
        CuentaBancaria cuenta1 = new CuentaBancaria(123456, 5000, "Ahorros");
        cuenta1.mostrarDetalles();
        
        // Acceder directamente a tipoCuenta (esto sí funciona porque es público)
        cuenta1.tipoCuenta = "Corriente";
        cuenta1.mostrarDetalles();
        
        // Acceder directamente a numeroCuenta (esto dará ERROR de compilación)
        // cuenta1.numeroCuenta = "999999";  
    }
}
