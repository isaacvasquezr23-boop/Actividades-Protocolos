package Ejercicio1;

public class clasePrueba {

    public static void main(String[] args) {
    
    Rectangulo r = new Rectangulo(4, 6);
    Triangulo t = new Triangulo(8, 5);
    
        System.out.println("El area del rectangulo es: " + r.calcularArea());
        System.out.println("El area del triangulo es: " + t.calcularArea());
}

}
