
package segundopar;

import java.util.Random;
import java.util.Scanner;



public class ArregloRan {
    public static void main(String[] args) {
        int tam; 
        Scanner entras = new Scanner(System.in);
        
        Random random = new Random();
        System.out.println("ingrese el tamano del arreglo ");
        tam = entras.nextInt();
        int []Arreglo = new int[tam];
        System.out.println("el arreglo random es");
         for(int i=0; i<tam; i++){
        Arreglo[i]=random.nextInt(100);
    }
         System.out.println("los numeros aleatorios son ");
         for(int j=0; j<Arreglo.length;j++){
             System.out.println(Arreglo[j]);
         }
         
       
       
       
    }
    
}
