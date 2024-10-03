package If_Else;

import java.util.Scanner;

public class Ejercicio7 {
     public static void main(String[] args) { 
         Scanner teclado = new Scanner(System.in);  
         
        boolean licencia = true;
         
         System.out.println("Ingrese su edad: "); 
         int edad = teclado.nextInt();    
         
         System.out.println("Tiene licencia de conducir: "); 
          licencia = teclado.nextBoolean();
          
         if(edad>18 && licencia){
             System.out.println("Puede conducir");
         }else{ 
             System.out.println("No puede conducir");
         }
         
     }
}
