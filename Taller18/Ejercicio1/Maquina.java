package Ejercicio1;

public class Maquina implements Reparable, Limpieza {
    @Override
    public void reparar() {
        System.out.println("Reparando la máquina...");
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando la máquina...");
    }
}

