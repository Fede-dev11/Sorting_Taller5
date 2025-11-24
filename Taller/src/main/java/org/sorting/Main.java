package org.sorting;

import Util.Resultado;
import controlador.Sort_methods;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int opcion;

        do {
            menu();
            opcion = leerOpcion();

            switch (opcion) {

                case 1:
                    System.out.println("\n=== Ejecutando BURBUJA en todas las listas ===");
                    ArrayList<Resultado> r1 = new ArrayList<>();

                    Sort_methods.burbuja_Citas();
                    r1.add(Sort_methods.obtenerResultado("Burbuja - Citas"));

                    Sort_methods.burbuja_Pacientes();
                    r1.add(Sort_methods.obtenerResultado("Burbuja - Pacientes"));

                    Sort_methods.burbuja_Inventario();
                    r1.add(Sort_methods.obtenerResultado("Burbuja - Inventario"));

                    Sort_methods.burbuja_Citas_Casi();
                    r1.add(Sort_methods.obtenerResultado("Burbuja - Citas Casi"));

                    Sort_methods.reporteAlgoritmo("Burbuja", r1);
                    break;

                case 2:
                    System.out.println("\n=== Ejecutando INSERTION SORT en todas las listas ===");
                    ArrayList<Resultado> r2 = new ArrayList<>();

                    Sort_methods.insertion_Citas();
                    r2.add(Sort_methods.obtenerResultado("Insertion - Citas"));

                    Sort_methods.insertion_Pacientes();
                    r2.add(Sort_methods.obtenerResultado("Insertion - Pacientes"));

                    Sort_methods.insertion_Inventario();
                    r2.add(Sort_methods.obtenerResultado("Insertion - Inventario"));

                    Sort_methods.insertion_Citas_Casi();
                    r2.add(Sort_methods.obtenerResultado("Insertion - Citas Casi"));

                    Sort_methods.reporteAlgoritmo("Insertion", r2);
                    break;

                case 3:
                    System.out.println("\n=== Ejecutando SELECTION SORT en todas las listas ===");
                    ArrayList<Resultado> r3 = new ArrayList<>();

                    Sort_methods.selection_Citas();
                    r3.add(Sort_methods.obtenerResultado("Selection - Citas"));

                    Sort_methods.selection_Pacientes();
                    r3.add(Sort_methods.obtenerResultado("Selection - Pacientes"));

                    Sort_methods.selection_Inventario();
                    r3.add(Sort_methods.obtenerResultado("Selection - Inventario"));

                    Sort_methods.selection_Citas_Casi();
                    r3.add(Sort_methods.obtenerResultado("Selection - Citas Casi"));

                    Sort_methods.reporteAlgoritmo("Selection", r3);
                    break;

                case 4:
                    System.out.println("Gracias por usar el sistema");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 4);
    }

    public static void menu() {
        System.out.println("\n--------- MENÚ ---------");
        System.out.println("1. Burbuja en todas las listas");
        System.out.println("2. Insertion Sort en todas las listas");
        System.out.println("3. Selection Sort en todas las listas");
        System.out.println("4. Salir");
        System.out.print("Ingrese opción: ");
    }

    private static int leerOpcion() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            return -1;
        }
    }
}
