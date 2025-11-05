package Ejercicio3;


public class ReportePDF implements GeneradorReporte {
    @Override
    public void generar(String datos) {
        System.out.println("Generando reporte en formato PDF...");
        System.out.println("Contenido del reporte: " + datos);
    }
}
