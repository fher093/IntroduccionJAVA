package If_Else;

import java.util.Scanner;

public class Ejercicio8 {
     public static void main(String[] args) { 
         Scanner teclado = new Scanner(System.in);  
         
         boolean entrada = true;
         
         System.out.println("Ingrese cuanto dinero tiene: "); 
         int dinero = teclado.nextInt();    
         
         System.out.println("Tiene entrada "); 
         entrada = teclado.nextBoolean();
          
         if(dinero>10 || entrada){
             System.out.println("Puede entrar al concierto");
         }else{ 
             System.out.println("No puede entrar al concierto");
         }
         
     }
}
