package Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        // Generar reporte en PDF
        GestorReportes gestorPDF = new GestorReportes(new ReportePDF());
        gestorPDF.generarReporte("Informe financiero del mes de noviembre.");

        System.out.println("..............................");

        // Generar reporte en Excel
        GestorReportes gestorExcel = new GestorReportes(new ReporteExcel());
        gestorExcel.generarReporte("Estadísticas de ventas y crecimiento anual.");
    }
}
