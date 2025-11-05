package Ejercicio3;

public class Camion implements Conducible, Transportable {
   @Override
    public void conducir() {
        System.out.println("Conduciendo el camión por la autopista.");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("Cargando mercancías en el camión.");
    } 
}
