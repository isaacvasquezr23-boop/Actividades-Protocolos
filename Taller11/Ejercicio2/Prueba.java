package Ejercicio2;


public class Prueba {
    public static void main(String[] args) {
        Empleado n1 = new Gerente("Isaac Vasquez", 2500000, 800000);
        Empleado n2 = new Vendedor("Cristian Vasquez", 1500000, 500000);

        n1.mostrarSalario();
        n2.mostrarSalario();
    }
}
