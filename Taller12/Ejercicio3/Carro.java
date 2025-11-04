package Ejercicio3;

public class Carro implements Lavador, Respirador2 {
    
    @Override
    public void lavar(){
        System.out.println("Un carro no sirve para lavar");
    }
    @Override
    public void respirar(){
        System.out.println("Un carro no respira");
    }
}
