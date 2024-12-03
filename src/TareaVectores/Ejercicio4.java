
package TareaVectores;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Promedio();
    } 
    
    public static void Promedio(){
        Scanner teclado = new Scanner(System.in); 
        Random random = new Random(); 
        double promedio=0; 
        double sumatoria=0; 
        
        System.out.println("Ingrese la dimension del vector");
        int dimension = teclado.nextInt(); 
        
        int vector[] = new int[dimension]; 
        
        for(int i = 0; i<vector.length; i++){
            vector[i]=(int)random.nextInt(1,9); 
            System.out.println("["+vector[i]+"]");
            sumatoria +=vector[i];  
            promedio = sumatoria/dimension;
           
        } 
        System.out.println("La sumatoria es = "+sumatoria);
        System.out.printf("La media artimetica es = %.2f%n",promedio);
    }
}
