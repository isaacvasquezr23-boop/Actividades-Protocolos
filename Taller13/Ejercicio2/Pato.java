package Ejercicio2;


public class Pato implements Volador, Nadador {
    
    @Override
    
    public void volar(){
        System.out.println("El pato vuela pero no muy alto");
    
    }
    @Override 
    
    public void nadar(){
        System.out.println("El pato es muy buen nadador");
        
    }
}
