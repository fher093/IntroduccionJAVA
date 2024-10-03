
package If_Else;

import java.util.Scanner;

public class Ejercicio12 {
        public static void main(String[] args) { 
         Scanner teclado = new Scanner(System.in);  
            
         System.out.println("Ingrese su peso en kg: "); 
         double peso = teclado.nextDouble(); 
         
         System.out.println("Ingrese su altura en m: "); 
         double altura = teclado.nextDouble(); 
           
         double imc = peso/(altura*altura); 
         
         System.out.printf("Su IMC es: %.2f%n", imc);
          
         if(imc<18.5){
             System.out.println("Tiene Bajo Peso");
         }else if(imc>=18.5 && imc<=24.9){
             System.out.println("Tiene Peso Normal");
         }else if(imc>25  && imc<=29.9){
             System.out.println("Tiene Sobrepeso");
         }else if(imc>29.9  && imc<=34.9){
             System.out.println("Tiene Obesidad 1");
         }else if(imc>34.9  && imc<=39.9){
             System.out.println("Tiene Obesidad 2");
         }else if(imc>39.9  && imc<=49.9){
             System.out.println("Tiene Obesidad 3");
         }else if(imc>49.9){
             System.out.println("Tiene Obesidad 4");
         }
     }
}
