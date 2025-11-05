/*

VERSIÓN INICIAL (VIOLAndo el principio de DIP)


public class GestorArchivos {
    public void guardarArchivo(String nombre, String contenido) {
        AlmacenamientoLocal almacenamiento = new AlmacenamientoLocal();
        almacenamiento.guardar(nombre, contenido);
    }

    public String recuperarArchivo(String nombre) {
        AlmacenamientoLocal almacenamiento = new AlmacenamientoLocal();
        return almacenamiento.recuperar(nombre);
    }
}

Problema:
- "GestorArchivos" depende directamente de una clase concreta (AlmacenamientoLocal).
- Si queremos cambiar a almacenamiento en la nube, debemos modificar su código.

*/