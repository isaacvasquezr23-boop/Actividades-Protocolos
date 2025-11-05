/*

public interface Vehiculo {
    void conducir();
    void cargarMercancia();
}

public class Automovil implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el automóvil por la carretera.");
    }

    @Override
    public void cargarMercancia() {
        // No aplica para automóviles
        throw new UnsupportedOperationException("El automóvil no transporta mercancías.");
    }
}

public class Camion implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el camión por la autopista.");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("Cargando mercancías en el camión.");
    }
}

Problema:
La clase Automóvil implementa un método innecesario (cargarMercancia).
Esto viola el Principio de Segregación de Interfaces (ISP).

*/
