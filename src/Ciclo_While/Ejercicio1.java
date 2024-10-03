
package Ciclo_While;

import java.util.Scanner;

public class Ejercicio1 {
     public static void main(String[] args) {
         
         //contar los numeros enteros positivos ingresados por teclado 
         //detenerse cuando se ingrese un numero negativo 
         //considere al numero cero como positivo 
         
         
         float numero = 0; 
         int contador = 0;
         
         Scanner teclado = new Scanner(System.in); 
         System.out.println("Ingrese un numero positivo: ");
         numero = teclado.nextFloat(); 
         while(numero >=0){  
             contador ++; 
         System.out.println("Ingrese un numero positivo: ");
         numero = teclado.nextFloat(); 
         
         } 
          System.out.println("Se ingresaron: "+contador+" numeros positivos");
             
         
    }
}
