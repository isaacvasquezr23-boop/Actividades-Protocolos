package Ejercicio2;

public class Gerente extends Empleado {
     private double sueldo;

    public Gerente(String nombre, double salarioBase, double sueldo) {
        super(nombre, salarioBase);
        this.sueldo = sueldo;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + sueldo;
    }
}
