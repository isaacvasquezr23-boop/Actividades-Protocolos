
package Ejercicio1;

public class Ave implements Volador, Cantante {
    
    @Override 
    public void volar(){
        System.out.println("El canario vuela muy alto");
        
    }
    
    @Override
    public void cantar(){
        System.out.println("El canario canta bonito");
    }
}
