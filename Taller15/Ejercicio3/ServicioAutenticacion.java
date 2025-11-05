package Ejercicio3;


public class ServicioAutenticacion {
  public boolean autenticar(Usuario usuario, String nombreUsuario, String contrasena) {
        return usuario.getNombreUsuario().equals(nombreUsuario) &&
               usuario.getContrasena().equals(contrasena);
    }
}  

