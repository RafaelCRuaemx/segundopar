
package segundopar;

import java.util.Scanner;


public class Arregloveint {

    
    public static void main(String[] args) {
        Scanner entr = new Scanner(System.in);
         int[] arreglo = new int[20];
         int i =0;
         System.out.println("ingrese los 20 numeros");
         while(i<20){
             System.out.println("numero" + (i+1)+ ":" );
             arreglo[i] =entr.nextInt();
             i++;
             
         }
         System.out.println("los numeros ingresados son:");
         for(int j=0;j<arreglo.length;j++){
             System.out.println(arreglo[j]+"" );
         }
                 
        



    }
    
}
