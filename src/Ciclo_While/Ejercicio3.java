
package Ciclo_While;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
         
        int num =0;
        float numero = 0; 
        int contadorPositivo= 0; 
        int contadorNegativo =0; 
         
        Scanner teclado = new Scanner (System.in);
        
        
        while (num <10){
        num++;  
        System.out.println("Ingrese un numero "+num); 
        numero = teclado.nextFloat(); 
            
         if (numero >=0){
             contadorPositivo++;
         }else{
             contadorNegativo++;
         } 
         
        } 
        System.out.println("Numeros Positivos = "+contadorPositivo);
        System.out.println("Numeros Negativos = "+contadorNegativo);
    }    
}
