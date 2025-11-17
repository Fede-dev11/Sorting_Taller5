package Util;

import java.util.Scanner;

public class SortingUtils {

    public static int[] validacion_entradadatos() {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.print("Ingrese la cantidad de elementos del arreglo debe ser mayor o igual a 0 : ");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size >= 0 ) break;
            }
            System.out.println("Error: Ingrese un número entero positivo.");
            scanner.nextLine();
        } while (true);

        array = new int[size];

        System.out.println("Ingrese los " + size + " elementos (uno por uno):");
        for (int i = 0; i < size; i++) {
            while (true) {
                System.out.print("Valor[" + i + "]: ");
                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    break;
                }
                System.out.println("Error: Ingrese un número entero válido.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
        return array;
    }

    public static void Arreglo_a_orednar(int[] array) {
        int nro_Elemento = array.length;
        System.out.println("\u001B[31mArreglo a ordenar\u001B[0m");
        for(int i=0; i< nro_Elemento;i++){
            System.out.print(array[i]+ " " );
        }
        System.out.println();
    }

    public static boolean todosIguales(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[0]) {
                return false;
            }
        }
        return true;

    }


}
