package Ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardar(String nombre, String contenido) {
        System.out.println(" Guardando archivo localmente: " + nombre);
    }
    
     @Override
    public String recuperar(String nombre) {
        System.out.println(" Recuperando archivo local: " + nombre);
        return "Contenido del archivo local: " + nombre;
    }
}

