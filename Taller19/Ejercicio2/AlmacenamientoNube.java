package Ejercicio2;


public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardar(String nombre, String contenido) {
        System.out.println(" Subiendo archivo a la nube: " + nombre);
    }

    @Override
    public String recuperar(String nombre) {
        System.out.println(" Descargando archivo desde la nube: " + nombre);
        return "Contenido del archivo en la nube: " + nombre;
    }
}
