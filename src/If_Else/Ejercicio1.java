package If_Else; 

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) { 
         Scanner teclado = new Scanner(System.in);  
         
         System.out.println("Ingrese un numero entero"); 
         int num1 = teclado.nextInt();  
         
         System.out.println("Ingrese un numero entero"); 
         int num2 = teclado.nextInt(); 
         
         if (num1 == num2 ){ 
             System.out.println("Los dos numeros son iguales"); 
             
         }else{ 
             System.out.println("Los dos numeros no son iguales");
         }
         
         
    }
}
