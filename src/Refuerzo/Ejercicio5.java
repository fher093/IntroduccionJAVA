
package Refuerzo;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
         
        Scanner teclado = new Scanner (System.in); 
        
        System.out.println("Ingrese un numero: "); 
        int n = teclado.nextInt(); 
        int numero1 = 0; 
        int numero2 = 1; 
        
        
  
        for(int i=0;i<=n;i++){ 
            
            System.out.print(numero1 + ","); 
             int siguienteTermino = numero1+numero2; 
             numero1 = numero2; 
             numero2 = siguienteTermino; 
            
        }
         
    }
}
