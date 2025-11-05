package Ejercicio1;


public class Libro1 {
    private String titulo;
    private String autor;
    private double precio;

    public Libro1(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public double getPrecio() { return precio; }
}


