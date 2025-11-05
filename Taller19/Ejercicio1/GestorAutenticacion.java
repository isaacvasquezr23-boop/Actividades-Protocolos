package Ejercicio1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicio;

    // Inyección de dependencia mediante el constructor
    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public void iniciarSesion(String usuario, String contrasena) {
        if (servicio.autenticar(usuario, contrasena)) {
            System.out.println("Acceso concedido a " + usuario);
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
