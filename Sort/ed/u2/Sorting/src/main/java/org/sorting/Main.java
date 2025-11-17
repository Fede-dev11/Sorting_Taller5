package org.sorting;

import controlador.Control_Sorting;

import java.util.Scanner;


public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         
        int opcion;
        do {
            menu();
            opcion = leerOpcin();
            switch (opcion) {
                case 1:
                    Control_Sorting.burbblesort();
                    break;
                case 2:
                    Control_Sorting.selectionsort();
                    break;

                case 3:
                    Control_Sorting.insertionsort();
                    break;

                case 4:
                    System.out.println("Gracias por usar el sistema");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion!=4);
    }

        public  static void menu(){
            System.out.println("\n---------MENU---------");
            System.out.println("1. Burbuja");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion valida");
        }


private static  int leerOpcin(){
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
}
    }