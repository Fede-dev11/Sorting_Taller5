package Util;

public class Resultado {
    public String nombre;
    public long comparaciones;
    public long swaps;
    public long tiempo;

    public Resultado(String nombre, long comparaciones, long swaps, long tiempo) {
        this.nombre = nombre;
        this.comparaciones = comparaciones;
        this.swaps = swaps;
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return String.format(
                "%-25s | Comparaciones: %-8d | Swaps: %-8d | Tiempo(ns): %-12d",
                nombre, comparaciones, swaps, tiempo
        );
    }
}
