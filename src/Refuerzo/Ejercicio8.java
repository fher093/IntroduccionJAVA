
package Refuerzo;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in); 
        
        double num=0;
        double suma= 0; 
        double promedio=0;
        
        for ( int i =1; i<=3;i++){ 
            System.out.println("Ingrese un numero "+i); 
            num = teclado.nextDouble(); 
            suma+=num; 
        }    
         promedio = suma/3; 
            
            if(num>promedio){
                System.out.println(num+","); 
            }
        System.out.println(promedio); 
        
        
    }
}
