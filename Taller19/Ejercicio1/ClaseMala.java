/*
public class GestorAutenticacion {
    public void autenticarUsuario(String usuario, String contrasena) {
        // La clase depende directamente de una implementación específica
        AutenticacionLocal auth = new AutenticacionLocal();
        auth.autenticar(usuario, contrasena);
    }
}

Problema:
- "GestorAutenticacion" depende de una clase concreta (AutenticacionLocal).
- Si queremos usar otro método (como OAuth), debemos modificar su código.

*/