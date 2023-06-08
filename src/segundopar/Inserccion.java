
package segundopar;

import java.util.Scanner;

public class Inserccion {
   

public class OrdenamientoInsercion {
    public static void main(String[] args) {
        Scanner entrad = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números a ordenar: ");
        int n = entrad.nextInt();
        
        int[] arreglo = new int[n];
        
        System.out.println("Ingrese los números uno por uno:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = entrad.nextInt();
        }
        
        insercion(arreglo);
        
        System.out.println("El arreglo ordenado es:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
    
    public static void insercion(int[] arreglo) {
        int n = arreglo.length;
        
        for (int i = 1; i < n; i++) {
            int valorActual = arreglo[i];
            int j = i - 1;
            
            while (j >= 0 && arreglo[j] > valorActual) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            
            arreglo[j + 1] = valorActual;
        }
    }
}

    
}
