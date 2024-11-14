
package Metodos;

import java.util.Scanner;

public class tutoriaMetodos {
    public static void main(String[] args) { 
        Scanner teclado = new Scanner (System.in); 
        System.out.println("Ingrese una base");
        int base = teclado.nextInt();
        System.out.println("Ingrese una potencia");
        int potencia = teclado.nextInt();
        System.out.println(base+" elevado a  "+potencia+" es igual = "+potencia(base, potencia));
    
    } 
    
    public static int potencia (int base, int potencia ){ 
         int operacion = 1;
         
        for(int i=1; i<=potencia; i++){
            int a=base;  
           operacion *=a;
            
        }  
        return operacion;
    }

}
