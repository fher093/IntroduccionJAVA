//programa que pide un numero y muestra si es par o impar 
package Refuerzo;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) { 
         
        Scanner teclado = new Scanner (System.in);  
        
        System.out.println("Ingrese un numero: "); 
        int numero = teclado.nextInt(); 
        
        if( numero % 2 ==0){ 
            System.out.println("El numero es par");
        }else { 
            System.out.println("El numero es impar");
        }
    }
}
