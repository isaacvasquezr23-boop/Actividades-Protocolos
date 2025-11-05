package Ejercicio1;

public class DescuentoFijo extends Descuento {
    private double montoFijo;

    public DescuentoFijo(double montoFijo) {
        super(0); // no usamos porcentaje aquí, pero respetamos el constructor base
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(double precio) {
        double precioFinal = precio - montoFijo;
        return (precioFinal < 0) ? 0 : precioFinal; // con esto evitamos precios negativos
    }
}

