 //contar los numeros enteros positivos ingresados por teclado 
//detenerse cuando se ingrese un numero negativo 
//considere al numero cero como positivo 
package Ciclo_While;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        int contador =0; 
        int numero =0;  
        boolean semaforo = true; 
         
        Scanner teclado = new Scanner (System.in); 
        numero = teclado.nextInt(); 
        
        while (semaforo ){ 
            if (numero >= 0){ 
                contador++; 
                System.out.println("Ingrese un nuemro"); 
                numero = teclado.nextInt();
            }else{
                semaforo = false;
            }
        }
    }
}
