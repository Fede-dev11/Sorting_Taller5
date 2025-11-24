package controlador;

import Util.Metrics;
import dominio.Registro;

public class Control_sort {
    public static Registro[] citas;
    public static Registro[] citas_casi_ordenadas;
    public static Registro[] inventario;
    public static Registro[] pacientes;
    public static Metrics m;

    public static int metricas(){
        System.out.println("\n--- Métricas ---");
        System.out.println("Comparaciones: " + m.comparisons);
        System.out.println("Swaps: " + m.swaps);
        System.out.println("Tiempo (ns): " + m.timeNs);
        return 0;
    }
}
