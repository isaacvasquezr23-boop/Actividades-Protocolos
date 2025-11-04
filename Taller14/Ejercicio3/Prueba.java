package Ejercicio3;


public class Prueba {
    public static void main(String[] args) {
        Persona p = new Estudiante();  // Referencia de tipo Persona
        p.presentarse();              // ✅ Válido (existe en Persona y Estudiante)
        p.estudiar();                 // ❌ Error de compilación
    }
}

