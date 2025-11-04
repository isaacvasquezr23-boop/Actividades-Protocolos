package Ejercicio3;


public class Estudiante extends Persona {
    public void estudiar() {
        System.out.println("Estoy estudiando programación.");
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante.");
    }
}

