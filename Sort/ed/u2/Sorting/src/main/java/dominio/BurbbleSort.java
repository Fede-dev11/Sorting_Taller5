package dominio;

public class BurbbleSort {
    /**
     * @param array El arreglo a ordenar.
     */

    public static void burbbleSort(int[] array){
        burbblesort(array,false);
    }
    public static void burbblesort(int[] array, boolean trace) {
        boolean swapped;
        int aux ;
        int nroElementos = array.length;

            for (int i = 0; i < nroElementos - 1; i++) {
                swapped = false;
                for (int j = 0; j < nroElementos - 1 - i; j++) {

                    if (array[j] > array[j + 1]) {
                        aux = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = aux;
                        swapped = true;
                    }
                }
                System.out.print("Pasada " + (i + 1) + ": ");
                for (int k = 0; k < nroElementos; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println();

                if (!swapped) {
                    System.out.println("No hay mas cambios que realizar");
                    break;
                }
            }
        }
    }