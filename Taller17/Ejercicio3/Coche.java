package Ejercicio3;

public class Coche extends Transporte {
     private double combustible; // en litros

    public Coche(double velocidad, double combustible) {
        super(velocidad);
        this.combustible = combustible;
    }

    @Override
    public void mover() {
        if (combustible > 0) {
            System.out.println("El coche avanza a " + velocidad + " km/h con " + combustible + " litros de combustible.");
        } else {
            System.out.println("El coche no puede moverse, no tiene combustible.");
        }
    }

    public void repostar(double litros) {
        combustible += litros;
    }
}

