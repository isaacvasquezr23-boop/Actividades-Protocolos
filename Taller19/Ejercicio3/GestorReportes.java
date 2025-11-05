package Ejercicio3;

public class GestorReportes {
    private GeneradorReporte generador;

    // Inyección de dependencia por constructor
    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void generarReporte(String datos) {
        generador.generar(datos);
    }
}
