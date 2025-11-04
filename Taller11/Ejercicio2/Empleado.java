package Ejercicio2;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;
 
     public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
   
    }
    public abstract double calcularSalario();
    
    
    public void mostrarSalario(){
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario total:" + calcularSalario());
        
        System.out.println("Siguiente");
        
    }
    }

  

