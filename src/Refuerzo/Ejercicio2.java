// programa que pide un numero y muestra su tabla de multiplicar del 1 al 10 
package Refuerzo;
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) { 
         
        Scanner teclado = new Scanner (System.in);  
        
        System.out.println("Ingrese un numero: "); 
        int numero = teclado.nextInt(); 
        
        for (int i=1;i<=10;i++){ 
             int multiplicacion =  i *numero; 
            System.out.println(i+"*"+numero+ "="+multiplicacion);
        }
        
    }
}
