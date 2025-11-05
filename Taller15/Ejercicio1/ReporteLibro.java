package Ejercicio1;

public class ReporteLibro {
    public String generarReporte(Libro1 libro) {
        return "Reporte del libro: " + libro.getTitulo() + 
               " - " + libro.getAutor() + 
               " ($" + libro.getPrecio() + ")";
    }
}

