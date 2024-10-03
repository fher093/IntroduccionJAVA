package If_Else;

import java.util.Scanner;

public class Ejercicio9 {
     public static void main(String[] args) { 
         Scanner teclado = new Scanner(System.in);  
         
         System.out.println("Ingrese una letra: "); 
         char letra = teclado.next().charAt(0);    
          
         if (letra >= 'A' && letra <= 'Z') {
            System.out.println("La letra "+letra +" es mayuscula");
        }
        else if (letra >= 'a' && letra <= 'z') {
            System.out.println("La letra "+letra +" es minuscula");
        }         
     }
}
