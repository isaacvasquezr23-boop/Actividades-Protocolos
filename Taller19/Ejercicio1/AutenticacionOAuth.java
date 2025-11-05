package Ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        System.out.println("Autenticando con OAuth para el usuario: " + usuario);
        return "tokenValido".equals(contrasena);
    }
}
