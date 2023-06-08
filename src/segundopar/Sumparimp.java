
package segundopar;


public class Sumparimp {
    public static void main(String[] args) {
     int par=0;
    int t=0;
    for(int i=1;i<=6;i++){
       
        if(i%2==0){
        par +=i;
        
        }else{
        t+=i;        
        }   
    }
    System.out.println("La suma de los 3 primeros numeros pares es: "+par);
    System.out.println("La suma de los 3 primeros numeros impares es: "+t);
    }
    }
    

