package Ejercicio3;

class Utilidades {
    public static int sumar(int a, int b){
       return a + b; 
        
    }
    
    public static int restar(int a, int b){
       return a - b;    
}
    
    public static int multiplicar(int a, int b){
       return a * b;  

}
 
    public static int dividir(int a, int b){  
        if (b == 0){
            System.out.println("error, no es posible dividir por cero");
        
}
        return a / b;
}
}