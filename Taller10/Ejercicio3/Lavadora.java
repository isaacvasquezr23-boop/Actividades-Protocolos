package Ejercicio3;

public class Lavadora extends Objeto {
    public void HacerUnaAccion (String tipo) {
        System.out.println("La lavadora hace un sonido de tipo: " + tipo);
}


   public void HacerUnaAccion() { 
        System.out.println("Guau Guau!");
    }
}