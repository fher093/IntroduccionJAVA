
package cicloIva;

import java.util.Scanner;

public class Iva {
    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);  
         double total, subtotalConIva,subtotalSInIva,iva; 
         total = subtotalConIva =subtotalSInIva = iva= 0; 
         
         System.out.println("Ingrese la cantidad de articulos comprados");
         int num = teclado.nextInt(); 
         
         for(int i = 0; i <num ; i++){
             System.out.println("Ingrese el valor");
             double valor = teclado.nextDouble(); 
             System.out.println("Grabar IVA"); 
             boolean ivaR = teclado.nextBoolean(); 
             
             
             
         
         
         
    } 
    }
}

