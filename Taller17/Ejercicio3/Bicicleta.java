package Ejercicio3;

public class Bicicleta extends Transporte {
    public Bicicleta(double velocidad) {
        super(velocidad);
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta avanza pedaleando a " + velocidad + " km/h.");
    }
}

