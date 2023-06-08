
package segundopar;

import java.util.Scanner;

public class Burbuja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números a ordenar: ");
        int n = scanner.nextInt();
        
        int[] arreglo = new int[n];
        
        System.out.println("Ingrese los números uno por uno:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }
        
        burbuja(arreglo);
        
        System.out.println("El arreglo ordenado es:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
    
    public static void burbuja(int[] arreglo) {
        int n = arreglo.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

    }
            }
        }
    }
}  










