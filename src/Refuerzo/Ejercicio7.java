
package Refuerzo;

import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) { 
        
        Scanner teclado = new Scanner(System.in); 
        
        double suma= 0;
        
        for(int i=1; i<=10;i++){ 
            System.out.println("Ingrese un numero "+i);  
            double num = teclado.nextInt(); 
            
            suma=suma+num;  
            
        } 
        double promedio = suma/10;
        System.out.println("El promedio de los numeros ingresados es: "+promedio);
    }
}
