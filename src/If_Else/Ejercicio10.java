package If_Else;

import java.util.Scanner;

public class Ejercicio10 {
     public static void main(String[] args) { 
         Scanner teclado = new Scanner(System.in);  
         
         boolean tieneIva = true; 
         
         double iva = 0.15;
         
         System.out.println("Ingrese el precio del producto: "); 
         int precio = teclado.nextInt(); 
         
         System.out.println("Graba IVA: "); 
         tieneIva = teclado.nextBoolean(); 
         
         
          
         if(tieneIva){
             double precioFinal = precio*(1+iva); 
             
             System.out.println("El precio final del producto es: "+precioFinal+"$");
             
             
         }else{ 
             System.out.println("El precio final del producto es: "+precio+"$");             
         }
     }
}
