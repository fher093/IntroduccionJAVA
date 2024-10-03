
package If_Else;

import java.util.Scanner;

public class Ejercicio3 {
      public static void main(String[] args) { 
         Scanner teclado = new Scanner(System.in);  
         
         System.out.println("Ingrese un numero entero"); 
         int num1 = teclado.nextInt();  
         
         System.out.println("Ingrese un numero entero"); 
         int num2 = teclado.nextInt(); 
         
         if(num1>num2){
             System.out.println("El numero "+num1+" es mayor que "+num2);
         } else if(num1 == num2){
             System.out.println("Los numeros son iguales");
         }else{ 
             System.out.println("El numero "+num2+"  es mayor que "+num1);
         } 
         
         
    } 
}
