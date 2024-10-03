
package Ciclo_While;

import java.util.Scanner;


public class Ejercicio4 {
     
    public static void main(String[] args) { 
        
        Scanner teclado = new Scanner (System.in);
        
         
        int numero= 0;
        int suma= 0; 
    
        while(suma<=20){  
            System.out.println("Ingrese un numero"); 
            numero = teclado.nextInt();
            suma = suma + numero;  
            
            if(suma>20){
                System.out.println("La suma es igual a "+suma+", es mayor a 20");
            }
        } 
        
    }
}
