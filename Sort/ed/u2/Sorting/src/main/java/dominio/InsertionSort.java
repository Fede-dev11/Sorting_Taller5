package dominio;



import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    /**
     * @param array El arreglo a ordenar.
     */

    public static void sort(int[] array, boolean trace) {
        int n = array.length;
        if (n <= 1) return;

        List<String> parcial= new ArrayList<>();

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
                System.out.println("\u001B[33mPaso " + i + " - Insertar: \u001B[0m" + key);

                while (j >= 0 && array[j] > key) {
                    if (array[j] > key) {
                        System.out.println("  " + key + " < " + array[j] + " Izquierda " + array[j]);
                        array[j + 1] = array[j];
                        j--;
                    }
                }
                array[j + 1] = key;

                if (trace) {
                    for (int num : array) System.out.print(num + " ");
                    System.out.println();
                }
            StringBuilder parciales = new StringBuilder("Parcial: ");
            for (int k = 0; k <= i; k++) {
                parciales.append(array[k]).append(" ");
            }
            parcial.add(parciales.toString());
        }
        System.out.println("=== Parciales generados ===");
        for (String p : parcial) {
            System.out.println(p);
        }

    }
    public static void sort(int[] array) {
        sort(array, false);
    }


}
