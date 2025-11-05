package Ejercicio3;

public class Prueba {
   public static void main(String[] args) {
        Transporte t1 = new Bicicleta(15);
        Transporte t2 = new Coche(80, 10);

        // Ambas se comportan como un Transporte
        t1.mover();
        t2.mover();

        // Podemos cambiar referencias sin alterar la lógica
        t2 = new Bicicleta(20);
        t2.mover();
    }
}
 

