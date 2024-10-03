
package If_Else;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) { 
         Scanner teclado = new Scanner(System.in);  
         
         System.out.println("Ingrese su salario anual: "); 
         int salario = teclado.nextInt(); 
         
         if(salario >11212){ 
             System.out.println("Debe pagar impuestos");
         }else{ 
             System.out.println("Exento de impuestos");
         } 
         
    }
}
