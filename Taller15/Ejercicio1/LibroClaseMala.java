package Ejercicio1;

public class LibroClaseMala {
    
private String titulo;
    private String autor;
    private double precio;

    public LibroClaseMala(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Precio: $" + precio);
    }

    public String generarReporte() {
        return "Reporte del libro: " + titulo + " - " + autor + " ($" + precio + ")";
    }

    public void guardarEnArchivo() {
      
        System.out.println("Guardando libro en archivo...");
    }
}
