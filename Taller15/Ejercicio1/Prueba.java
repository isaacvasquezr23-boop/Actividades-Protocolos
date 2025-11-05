package Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        Libro1 libro = new Libro1("Libro cualquiera", "Desconocido", 1000);
        ReporteLibro reporte = new ReporteLibro();
        PersistenciaLibro persistencia = new PersistenciaLibro();

        System.out.println(reporte.generarReporte(libro));
        persistencia.guardarEnArchivo(libro);
    }
}
