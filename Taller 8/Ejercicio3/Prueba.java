package Ejercicio3;

public class Prueba {
    
public static void main(String[] args) {
       
        Empleado empleado1 = new Empleado("Isaac", 3500000);
        
        
        Gerente gerente1 = new Gerente("Cristian", 5500000, "Recursos Humanos");

        
        System.out.println("Detalles del empleado:");
        empleado1.mostrarDetalles();

        System.out.println("Detalles del gerente:");
        gerente1.mostrarDetalles();
    }
}
