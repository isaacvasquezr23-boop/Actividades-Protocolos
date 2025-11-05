package Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
     @Override
    public boolean autenticar(String usuario, String contrasena) {
        System.out.println("🖥️ Autenticando localmente al usuario: " + usuario);
        return "admin".equals(usuario) && "1234".equals(contrasena);
    }
}
