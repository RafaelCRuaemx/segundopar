package segundopar;


import java.util.Scanner;



public class Shell {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a ordenar: ");
        int n = tecla.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingrese los números uno por uno:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = tecla.nextInt();
        }

        shellSort(arreglo);

        System.out.println("El arreglo ordenado es:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }

    public static void shellSort(int[] arreglo) {
        int n = arreglo.length;
        int intervalo = n / 2;

        while (intervalo > 0) {
            for (int i = intervalo; i < n; i++) {
                int temp = arreglo[i];
                int j = i;

                while (j >= intervalo && arreglo[j - intervalo] > temp) {
                    arreglo[j] = arreglo[j - intervalo];
                    j -= intervalo;
                }

                arreglo[j] = temp;
            }

            intervalo /= 2;
        }
    }
}
