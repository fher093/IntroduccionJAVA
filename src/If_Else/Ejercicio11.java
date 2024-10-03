package If_Else;

import java.util.Scanner;

public class Ejercicio11 {
     public static void main(String[] args) { 
         Scanner teclado = new Scanner(System.in);  
            
         System.out.println("Ingrese la temperatura en grados Farenheit: "); 
         double temperatura = teclado.nextDouble(); 
           
         double conversion = (temperatura-32)*5/9; 
         
         System.out.printf("Temperatura en grados centigrados: %.2f%n", conversion);
          
         
         if(conversion>=20 && conversion<=30){
              
             
             System.out.println("Temperatura Normal");
             
             
         }else{ 
             System.out.println("ALERTA , temperatura inadecuada");             
         }
     }
}
