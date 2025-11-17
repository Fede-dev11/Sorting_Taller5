package dominio;


public class Selectionsort {
    /**
     * @param array El arreglo a ordenar.
     */

    public static void selectionSort(int[] array){
        selectionsort(array,false);
    }
    public static void selectionsort(int[] array, boolean trace) {

        int n = array.length;

        boolean huboIntercambioGlobal = false;

        for (int i = 0; i < n - 1; i++) {

            int minimo = i;

            if (trace) {
                System.out.print("--- PASADA " + (i+1) + " ---");
                System.out.println("Comparaciones");
                System.out.println("\u001B[32mMinimo inicial posicion[" + i + "] = \u001B[0m" + array[i]);
            }

            // Buscar el mínimo en el resto del arreglo
            for (int j = i + 1; j < n; j++) {
                if (trace) {
                    System.out.println("Posicion[" + j + "] = " + array[j] +
                            " es < valor posicion[" + minimo + "] = " + array[minimo]);
                }

                if (array[j] < array[minimo]) {
                    minimo = j;

                    if (trace) {
                        System.out.print(" SI");
                        System.out.println("\u001B[33mMínimo encontrado posición \u001B[0m" + minimo +  "\u001B[31m valor =\u001B[0m" + array[minimo]);
                    }
                }
            }
            int aux = array[i];
            array[i] = array[minimo];
            array[minimo] = aux;

            if (trace) {
                System.out.print("Arreglo después del intercambio: ");
                for (int k = 0; k < n; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println();

                System.out.println();
            }
        }
    }
}