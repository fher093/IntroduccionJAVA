/*Programa que pide un número entero y muestra si es primo o no.*/
package Refuerzo;

import java.util.Scanner;

public class Ejercicio3 {
     public static void main(String[] args) { 
         
        Scanner teclado = new Scanner (System.in);  
        
        System.out.println("Ingrese un numero: "); 
        int numero = teclado.nextInt();  
         int contador = 0;
         
        for(int i=1;i<=numero;i++){ 

         int divisor = numero%i; 
              if(divisor==0){ 
                   contador++;                   
              } 
        } 
         if(contador>2){
                  System.out.println("El numero no es primo");
              }else{
                   System.out.println("El numero es primo");
              }
        
        
        if(numero ==0){
            System.out.println("El numero "+numero+" no es primo");
        } 
     }
}
