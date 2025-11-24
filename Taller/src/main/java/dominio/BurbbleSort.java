package dominio;

import Util.Metrics;
import dominio.Registro;
import java.util.Comparator;

public class BurbbleSort {

    public static void sort(Registro[] arr, Comparator<Registro> cmp, Metrics m) {

        long start = System.nanoTime();
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                m.comparisons++;

                if (cmp.compare(arr[j], arr[j + 1]) > 0) {

                    Registro temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    m.swaps++;
                    swapped = true;
                }
            }

            if (!swapped) break; // corte temprano
        }

        m.timeNs = System.nanoTime() - start;
    }
}
