package dominio;

import Util.Metrics;
import dominio.Registro;
import java.util.Comparator;

public class InsertionSort {

    public static void sort(Registro[] arr, Comparator<Registro> cmp, Metrics m) {

        long start = System.nanoTime();
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Registro key = arr[i];
            int j = i - 1;
            while (j >= 0) {
                m.comparisons++;
                if (cmp.compare(arr[j], key) > 0) {

                    arr[j + 1] = arr[j];
                    j--;
                    m.swaps++;

                } else break;
            }

            arr[j + 1] = key;
        }

        m.timeNs = System.nanoTime() - start;
    }
}
