package Ejercicio2;

public class ExportadorPDF implements ExportadorDocumento {
     @Override
    public void exportar(String contenido) {
        System.out.println("Exportando documento a PDF...");
        System.out.println("Contenido: " + contenido);
    }
}

