
package TareaVectores;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Temperatura();
    } 
    
    public static void Temperatura(){
        Scanner teclado = new Scanner(System.in); 
        Random random = new Random(); 
        double sumatoria= 0;
        double promedio= 0;
        System.out.println("Ingrese la dimendion del vector Temperatura"); 
        int dimension = teclado.nextInt(); 
        
        double [] temp = new double[dimension];
        
        for (int i = 0; i < temp.length; i++) {
            temp[i] = Math.round(( random.nextDouble(1,99)) * 10) / 10.0;
            System.out.println(temp[i]+" C"); 
            sumatoria += temp[i]; 
            promedio= sumatoria/dimension; 
            
           
        } 
        System.out.printf("Promedio: %.2f%n",promedio);
        
        System.out.println("Temperaturas mayores al promedio o iguales al promedio");
        for (int i = 0; i < temp.length; i++) {
             if(temp[i]>promedio || temp[i]==promedio){
                System.out.println(temp[i]+" C");
            }                       
        }        
    }
}
