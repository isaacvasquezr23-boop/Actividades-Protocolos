package Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("isaac123", "clave123");
        ValidarUsuario validador = new ValidarUsuario();
        ServicioAutenticacion servicioAuth = new ServicioAutenticacion();

        if (validador.validar(usuario)) {
            System.out.println("Datos del usuario válidos.");
            boolean autenticado = servicioAuth.autenticar(usuario, "isaac200723", "clave200723");
            
            if (autenticado) {
                System.out.println("La Autenticación ha sido exitosa. Bienvenido, " + usuario.getNombreUsuario());
            } else {
                System.out.println("Datos incorrectos.");
            }
        } else {
            System.out.println("Datos del usuario no válidos.");
        }
    }
}

