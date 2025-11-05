package Ejercicio2;

public class ExportadorExcel implements ExportadorDocumento   {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando documento a Excel...");
        System.out.println("Contenido: " + contenido);
    }
}

