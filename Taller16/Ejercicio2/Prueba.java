package Ejercicio2;

public class Prueba {
   public static void main(String[] args) {
        Documento doc1 = new Documento("Informe mensual de ventas", new ExportadorPDF());
        Documento doc2 = new Documento("Plan de proyecto", new ExportadorWord());
        Documento doc3 = new Documento("Balance financiero", new ExportadorExcel());

        doc1.exportar();
        doc2.exportar();
        doc3.exportar();
    }
}


