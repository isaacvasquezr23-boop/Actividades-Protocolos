package Ejercicio3;

public abstract class Transporte {
    protected double velocidad; // en km/h

    public Transporte(double velocidad) {
        this.velocidad = velocidad;
    }

    public abstract void mover(); // comportamiento general

    public double getVelocidad() {
        return velocidad;
    }
}

