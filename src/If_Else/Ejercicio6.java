
package If_Else;

import java.util.Scanner;

public class Ejercicio6 {
     public static void main(String[] args) { 
         Scanner teclado = new Scanner(System.in);  
         
         System.out.println("Ingrese su edad: "); 
         int edad = teclado.nextInt();    
         
         System.out.println("Ingrese su estatura en centimetros: "); 
         int estatura = teclado.nextInt();    
          
         if(edad==21 || estatura>150){
             System.out.println("Puede Ingresar");
         }else{ 
             System.out.println("No puede ingresar");
         }
         
     }
}
