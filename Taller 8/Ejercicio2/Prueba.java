package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Isaac", 18, "12345");
        Estudiante estudiante2 = new Estudiante("Juan", 19, "67890");

        
        estudiante1.mostrarInfo();
        System.out.println();
        estudiante2.mostrarInfo();
    }
}

