package Ejercicio3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generar(String datos) {
        System.out.println("Generando reporte en formato Excel...");
        System.out.println("Contenido del reporte: " + datos);
    }
}
