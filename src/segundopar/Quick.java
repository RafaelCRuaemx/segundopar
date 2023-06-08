package segundopar;

import java.util.Scanner;

public class Quick {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a ordenar: ");
        int n = lec.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingrese los números uno por uno:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = lec.nextInt();
        }

        quickSort(arreglo, 0, n - 1);

        System.out.println("El arreglo ordenado es:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particion(arreglo, inicio, fin);

            quickSort(arreglo, inicio, indiceParticion - 1);
            quickSort(arreglo, indiceParticion + 1, fin);
        }
    }

    public static int particion(int[] arreglo, int inicio, int fin) {
        int pivote = arreglo[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (arreglo[j] <= pivote) {
                i++;

                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;

        return i + 1;
    }
}
