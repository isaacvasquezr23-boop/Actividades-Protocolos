package Ejercicio2;

public class ExportadorWord implements ExportadorDocumento {
   @Override
    public void exportar(String contenido) {
        System.out.println("Exportando documento a Word...");
        System.out.println("Contenido: " + contenido);
    }
} 

