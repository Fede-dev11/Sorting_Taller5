package controlador;

import Util.SortingUtils;
import dominio.BurbbleSort;
import dominio.InsertionSort;
import dominio.Selectionsort;

import java.util.Scanner;
import static Util.SortingUtils.validacion_entradadatos;

public class Control_Sorting {
    private static Scanner sc = new Scanner(System.in);

    public static void burbblesort(){

        int[] array = validacion_entradadatos();
        int nro_Elemento = array.length;

        SortingUtils.Arreglo_a_orednar(array);

        if (SortingUtils.todosIguales(array)) {
            System.out.println("El arreglo ya está ordenado (Burbuja)");
            return;
        }

        BurbbleSort.burbblesort(array, false);

        System.out.println("--- RESULTADO FINAL ---");
        System.out.println("\u001B[32mArreglo ordenado (Burbble)\u001B[0m");

        for (int i=0; i< nro_Elemento;i++){
            System.out.print(array[i]+ " ");
        }

        System.out.println();
    }

    public static void selectionsort(){

        int[] array = validacion_entradadatos();
        int nro_Elemento = array.length;

        SortingUtils.Arreglo_a_orednar(array);

        if (SortingUtils.todosIguales(array)) {
            System.out.println("El arreglo ya está ordenado (selection)");
            return;
        }

        Selectionsort.selectionsort(array, true);

        System.out.println("--- RESULTADO FINAL ---");
        System.out.println("\u001B[32mArreglo ordenado (selection)\u001B[0m");

        for (int i=0; i< nro_Elemento;i++){
            System.out.print(array[i]+ " ");
        }

        System.out.println();

    }

    public static void insertionsort() {

        int[] array = validacion_entradadatos();
        int nro_Elemento = array.length;

        SortingUtils.Arreglo_a_orednar(array);

        if (SortingUtils.todosIguales(array)) {
            System.out.println("El arreglo ya está ordenado (insertion)");
            return;
        }

        InsertionSort.sort(array, true); // no necesitas crear objeto

        System.out.println("--- RESULTADO FINAL ---");
        System.out.println("\u001B[32mArreglo ordenado (insertion)\u001B[0m");
        for (int i = 0; i < nro_Elemento; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}
