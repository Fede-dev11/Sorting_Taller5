package dominio;

import Util.Metrics;
import dominio.Registro;
import java.util.Comparator;

public class Selectionsort {

    public static void sort(Registro[] arr, Comparator<Registro> cmp, Metrics m) {

        long start = System.nanoTime();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                m.comparisons++;
                if (cmp.compare(arr[j], arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Registro temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                m.swaps++;
            }
        }

        m.timeNs = System.nanoTime() - start;
    }
}
