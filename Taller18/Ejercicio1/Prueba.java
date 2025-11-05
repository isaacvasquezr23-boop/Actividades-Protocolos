package Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        Limpieza robot = new RobotLimpieza();
        Reparable maquina = new Maquina();
        Limpieza edificio = new Edificio();

        maquina.reparar();
        edificio.limpiar();
        robot.limpiar();
    }
}

