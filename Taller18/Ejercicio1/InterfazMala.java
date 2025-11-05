/*
 
package Ejercicio1;


public interface Mantenimiento {
    void reparar();
    void limpiar();
}

public class Maquina implements Mantenimiento {
    @Override
    public void reparar() {
        System.out.println("Reparando la máquina...");
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando la máquina...");
    }
}

  public class Edificio implements Mantenimiento {
    @Override
    public void reparar() {
        System.out.println("Reparando el edificio...");
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando el edificio...");
  }
}   

Hasta ahora todo bien, pero imaginemos que aparece una nueva clase
(por ejemplo, RobotLimpieza) que solo realiza limpieza y no reparaciones.

   Entonces estaríamos obligados a implementar un método innecesario:

 public class RobotLimpieza implements Mantenimiento {
    @Override
    public void reparar() {
        //No aplica
        throw new UnsupportedOperationException("El robot no realiza reparaciones.");
    }

    @Override
    public void limpiar() {
        System.out.println("El robot limpia el área automáticamente.");
    }
}

 Lo viola el principio de ISP.

*/