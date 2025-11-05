package Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        // Usar autenticación local
        GestorAutenticacion gestorLocal = new GestorAutenticacion(new AutenticacionLocal());
        gestorLocal.iniciarSesion("admin", "1234");

        // Usar autenticación OAuth
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(new AutenticacionOAuth());
        gestorOAuth.iniciarSesion("isaac", "tokenValido");
    }
}
