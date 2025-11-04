package Ejercicio3;

public class PruebaMetodoAbstractsSobre {
    
    public static void main(String[] args) {
        Animal P = new Perro();
        Animal G = new Gato();

        P.hacerUnSonido();
        G.hacerUnSonido();
    }
}
