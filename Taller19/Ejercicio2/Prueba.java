package Ejercicio2;


public class Prueba {
    public static void main(String[] args) {
        // Usamos almacenamiento local
        GestorDeArchivos gestorLocal = new GestorDeArchivos(new AlmacenamientoLocal());
        gestorLocal.guardar("informe.txt", "Datos importantes");
        gestorLocal.recuperar("informe.txt");

        System.out.println(".......................");

        // Usamos almacenamiento en la nube
        GestorDeArchivos gestorNube = new GestorDeArchivos(new AlmacenamientoNube());
        gestorNube.guardar("backup.zip", "Copia de seguridad");
        gestorNube.recuperar("backup.zip");
    }
}

