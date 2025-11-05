package Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Conducible auto = new Automovil();
        Conducible camion = new Camion();
        Transportable camionCarga = new Camion();

        auto.conducir();
        camion.conducir();
        camionCarga.cargarMercancia();
    }
}
