package Ejercicio1;

public class Edificio implements Reparable, Limpieza {
    @Override
    public void reparar() {
        System.out.println("Reparando el edificio...");
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando el edificio...");
    }
}


