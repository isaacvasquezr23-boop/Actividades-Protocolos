package Ejercicio2;

public class Pez implements Nadador, Respirador {
    
    @Override
    public void nadar(){
        System.out.println("El pescao nada");
    }
    @Override
    public void respirar(){
        System.out.println("El pescao respira por las branquias");
    }
}
