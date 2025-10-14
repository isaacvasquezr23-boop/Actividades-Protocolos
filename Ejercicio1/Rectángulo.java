package Ejercicio1;

public class Rectángulo extends Figura {
    
    private double altura;
    private double base;
    
    public Rectángulo(double altura, double base){
        this.altura = altura;
        this.base = base;
        
    }
    
    @Override
    public double calcularArea(){
        return base * altura ;
        
    }
}
