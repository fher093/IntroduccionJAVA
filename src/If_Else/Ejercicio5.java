
package If_Else;

import java.util.Scanner;

public class Ejercicio5 {
     public static void main(String[] args) { 
         Scanner teclado = new Scanner(System.in);  
         
         System.out.println("Ingrese su edad: "); 
         int edad = teclado.nextInt();    
         
         System.out.println("Ingrese su estatura en metros: "); 
         double estatura = teclado.nextDouble();    
          
         if(edad>=18 && estatura>1.70){
             System.out.println("Puede Ingresar");
         }else{ 
             System.out.println("No puede ingresar");
         }
         
     }
}
