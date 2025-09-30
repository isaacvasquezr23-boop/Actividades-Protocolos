package Ejercicio3;

public class Animal {
private String especie; 

public Animal(String especie) {
        this.especie = especie;

}
}
    public class Perro extends Animal {
    public void mostrarEspecie() {
        System.out.println(super.especie); 
    }
}