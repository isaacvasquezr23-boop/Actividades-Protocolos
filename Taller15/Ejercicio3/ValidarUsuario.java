package Ejercicio3;

public class ValidarUsuario {
    public boolean validar(Usuario usuario) {
        return usuario.getNombreUsuario() != null && !usuario.getNombreUsuario().isEmpty()
                && usuario.getContrasena() != null && usuario.getContrasena().length() >= 6;
    }
}

