package controlador;

import Util.CSVReader;
import Util.Metrics;
import Util.Resultado;
import dominio.BurbbleSort;
import dominio.InsertionSort;
import dominio.Registro;
import dominio.Selectionsort;

import java.util.ArrayList;
import java.util.Comparator;

import static controlador.Control_sort.*;

public class Sort_methods {

    // ===============================
    // BURBUJA
    // ===============================

    public static void burbuja_Citas() throws Exception {
        citas = CSVReader.leerCitas("citas_100.csv");

        Comparator<Registro> comp = Metrics.comparaciones.porFecha();
        m = new Metrics();

        BurbbleSort.sort(citas, comp, m);

        System.out.println("\n--- BURBUJA - Citas (por fecha) ---");
        System.out.printf("%-10s | %-12s | %-20s\n", "ID", "APELLIDO", "FECHA");
        System.out.println("-----------------------------------------------");

        for (Registro r : citas) System.out.println(r.toStringCitas());

        System.out.println(metricas());
    }


    public static void burbuja_Pacientes() throws Exception {
        pacientes = CSVReader.leerPacientes("pacientes_500.csv");

        Comparator<Registro> comp = Metrics.comparaciones.porApellido();
        m = new Metrics();

        BurbbleSort.sort(pacientes, comp, m);

        System.out.println("\n--- BURBUJA - Pacientes (por apellido) ---");
        System.out.printf("%-10s | %-12s | %-10s\n", "ID", "APELLIDO", "PRIORIDAD");
        System.out.println("-----------------------------------------------");

        for (Registro r : pacientes) System.out.println(r.toStringPacientes());

        System.out.println(metricas());
    }


    public static void burbuja_Inventario() throws Exception {
        inventario = CSVReader.leerInventario("inventario_500_inverso.csv");

        Comparator<Registro> comp = Metrics.comparaciones.porStock();
        m = new Metrics();

        BurbbleSort.sort(inventario, comp, m);

        System.out.println("\n--- BURBUJA - Inventario (por stock) ---");
        System.out.printf("%-10s | %-20s | %-8s\n", "ID", "PRODUCTO", "STOCK");
        System.out.println("----------------------------------------------");

        for (Registro r : inventario) System.out.println(r.toStringInventario());

        System.out.println(metricas());
    }


    public static void burbuja_Citas_Casi() throws Exception {
        citas_casi_ordenadas =
                CSVReader.leerCitasCasiOrd("citas_100_casi_ordenadas.csv");

        Comparator<Registro> comp = Metrics.comparaciones.porFecha();
        m = new Metrics();

        BurbbleSort.sort(citas_casi_ordenadas, comp, m);

        System.out.println("\n--- BURBUJA - Citas CASI ORDENADAS ---");
        System.out.printf("%-10s | %-12s | %-20s\n", "ID", "APELLIDO", "FECHA");
        System.out.println("-----------------------------------------------");

        for (Registro r : citas_casi_ordenadas) System.out.println(r.toStringCitas());

        System.out.println(metricas());
    }


    // ===============================
    // INSERTION SORT
    // ===============================

    public static void insertion_Citas() throws Exception {
        citas = CSVReader.leerCitas("citas_100.csv");

        Comparator<Registro> comp = Metrics.comparaciones.porFecha();
        m = new Metrics();

        InsertionSort.sort(citas, comp, m);

        System.out.println("\n--- INSERTION - Citas ---");
        System.out.printf("%-10s | %-12s | %-20s\n", "ID", "APELLIDO", "FECHA");
        System.out.println("-----------------------------------------------");

        for (Registro r : citas) System.out.println(r.toStringCitas());

        System.out.println(metricas());
    }


    public static void insertion_Pacientes() throws Exception {
        pacientes = CSVReader.leerPacientes("pacientes_500.csv");

        Comparator<Registro> comp = Metrics.comparaciones.porApellido();
        m = new Metrics();

        InsertionSort.sort(pacientes, comp, m);

        System.out.println("\n--- INSERTION - Pacientes ---");
        System.out.printf("%-10s | %-12s | %-10s\n", "ID", "APELLIDO", "PRIORIDAD");
        System.out.println("-----------------------------------------------");

        for (Registro r : pacientes) System.out.println(r.toStringPacientes());

        System.out.println(metricas());
    }


    public static void insertion_Inventario() throws Exception {
        inventario = CSVReader.leerInventario("inventario_500_inverso.csv");

        Comparator<Registro> comp = Metrics.comparaciones.porStock();
        m = new Metrics();

        InsertionSort.sort(inventario, comp, m);

        System.out.println("\n--- INSERTION - Inventario ---");
        System.out.printf("%-10s | %-20s | %-8s\n", "ID", "PRODUCTO", "STOCK");
        System.out.println("----------------------------------------------");

        for (Registro r : inventario) System.out.println(r.toStringInventario());

        System.out.println(metricas());
    }


    public static void insertion_Citas_Casi() throws Exception {
        citas_casi_ordenadas =
                CSVReader.leerCitasCasiOrd("citas_100_casi_ordenadas.csv");

        Comparator<Registro> comp = Metrics.comparaciones.porFecha();
        m = new Metrics();

        InsertionSort.sort(citas_casi_ordenadas, comp, m);

        System.out.println("\n--- INSERTION - Citas CASI ORDENADAS ---");
        System.out.printf("%-10s | %-12s | %-20s\n", "ID", "APELLIDO", "FECHA");
        System.out.println("-----------------------------------------------");

        for (Registro r : citas_casi_ordenadas) System.out.println(r.toStringCitas());

        System.out.println(metricas());
    }


    // ===============================
    // SELECTION SORT
    // ===============================

    public static void selection_Citas() throws Exception {
        citas = CSVReader.leerCitas("citas_100.csv");

        Comparator<Registro> comp = Metrics.comparaciones.porFecha();
        m = new Metrics();

        Selectionsort.sort(citas, comp, m);

        System.out.println("\n--- SELECTION - Citas ---");
        System.out.printf("%-10s | %-12s | %-20s\n", "ID", "APELLIDO", "FECHA");
        System.out.println("-----------------------------------------------");

        for (Registro r : citas) System.out.println(r.toStringCitas());

        System.out.println(metricas());
    }


    public static void selection_Pacientes() throws Exception {
        pacientes = CSVReader.leerPacientes("pacientes_500.csv");

        Comparator<Registro> comp = Metrics.comparaciones.porApellido();
        m = new Metrics();

        Selectionsort.sort(pacientes, comp, m);

        System.out.println("\n--- SELECTION - Pacientes ---");
        System.out.printf("%-10s | %-12s | %-10s\n", "ID", "APELLIDO", "PRIORIDAD");
        System.out.println("-----------------------------------------------");

        for (Registro r : pacientes) System.out.println(r.toStringPacientes());

        System.out.println(metricas());
    }


    public static void selection_Inventario() throws Exception {
        inventario = CSVReader.leerInventario("inventario_500_inverso.csv");

        Comparator<Registro> comp = Metrics.comparaciones.porStock();
        m = new Metrics();

        Selectionsort.sort(inventario, comp, m);

        System.out.println("\n--- SELECTION - Inventario ---");
        System.out.printf("%-10s | %-20s | %-8s\n", "ID", "PRODUCTO", "STOCK");
        System.out.println("----------------------------------------------");

        for (Registro r : inventario) System.out.println(r.toStringInventario());

        System.out.println(metricas());
    }


    public static void selection_Citas_Casi() throws Exception {
        citas_casi_ordenadas =
                CSVReader.leerCitasCasiOrd("citas_100_casi_ordenadas.csv");

        Comparator<Registro> comp = Metrics.comparaciones.porFecha();
        m = new Metrics();

        Selectionsort.sort(citas_casi_ordenadas, comp, m);

        System.out.println("\n--- SELECTION - Citas CASI ORDENADAS ---");
        System.out.printf("%-10s | %-12s | %-20s\n", "ID", "APELLIDO", "FECHA");
        System.out.println("-----------------------------------------------");

        for (Registro r : citas_casi_ordenadas) System.out.println(r.toStringCitas());

        System.out.println(metricas());
    }

    public static void reporteAlgoritmo(String nombreAlgoritmo, ArrayList<Resultado> resultados) {

        System.out.println("\n==== RESULTADOS " + nombreAlgoritmo.toUpperCase() + " ====");
        for (Resultado r : resultados) {
            System.out.println(r);
        }

        Resultado minSwaps = resultados.stream()
                .min(Comparator.comparingLong(r -> r.swaps)).get();


        System.out.println("\n→ Menor número de swaps:");
        System.out.println(minSwaps);

    }
    public static Resultado obtenerResultado(String nombre) {
        return new Resultado(nombre, m.comparisons, m.swaps, m.timeNs);
    }

}
