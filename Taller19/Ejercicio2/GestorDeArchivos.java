package Ejercicio2;


public class GestorDeArchivos {
     private Almacenamiento almacenamiento;

    // Inyección de dependencia mediante el constructor
    public GestorDeArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombre, String contenido) {
        almacenamiento.guardar(nombre, contenido);
    }

    public void recuperar(String nombre) {
        String datos = almacenamiento.recuperar(nombre);
        System.out.println(" " + datos);
    }
}
