
package TareaVectores;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String[] args) {
        MaximosyMinimos();
    } 
    
    public static void MaximosyMinimos(){
        Scanner teclado = new Scanner(System.in); 
        Random random = new Random();
        
        System.out.println("Ingrese la dimension del vector");
        int dimension = teclado.nextInt(); 
        
        int [] vector = new int[dimension]; 
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)random.nextInt(1,200); 
            System.out.println(vector[i]);
        }
        
        int maximo = vector[0];
        int minimo = vector[0]; 
        
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]>maximo){
                maximo=vector[i];
            }
            if(vector[i]<minimo){
                minimo=vector[i];
            }
                
        } 
        System.out.println("Maximo: "+maximo);
        System.out.println("Minimo: "+minimo);
    }
    
}
