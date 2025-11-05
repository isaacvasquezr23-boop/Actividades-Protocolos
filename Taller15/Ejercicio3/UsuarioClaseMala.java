package Ejercicio3;

public class UsuarioClaseMala {
    private String nombreUsuario;
    private String contrasena;

    public UsuarioClaseMala(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() { return nombreUsuario; }
    public String getContrasena() { return contrasena; }

    public boolean validarDatos() {
        return nombreUsuario != null && !nombreUsuario.isEmpty()
                && contrasena != null && contrasena.length() >= 6;
    }

    public boolean autenticar(String nombreUsuario, String contrasena) {
        return this.nombreUsuario.equals(nombreUsuario) && this.contrasena.equals(contrasena);
    }
}

