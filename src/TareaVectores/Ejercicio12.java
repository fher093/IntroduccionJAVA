
package TareaVectores;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        MayorMenor(); 
    } 
    public static void MayorMenor(){
          Scanner teclado = new Scanner(System.in); 
            Random random = new Random();
            
            System.out.println("Ingrese la dimension del vector");
            int dimension = teclado.nextInt();
            
            int [] vector = new int[dimension]; 
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)random.nextInt(1,20); 
            System.out.println(vector[i]);
        }  
        //metodo burbuja 
        int auxiliar;
        for (int i = 0; i < vector.length-1; i++) {
            for (int j = 0; j < vector.length-1; j++) {
                if(vector[j] < vector[j+1]){
                    auxiliar = vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=auxiliar;
                }
            }
        }
        
        System.out.println("Arreglo ordenado");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        
    }
}
