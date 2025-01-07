
package Tarea_Lectura_Archivos;

import java.io.File;
import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        precio();
        
    } 
    
    public static void precio(){
        String ruta  = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\ManejoArchivos\\ejercicio4.txt";
           File archivo = new File (ruta);  
           
           System.out.println("Nombre y total de productos\ncon precios entre 10 y 20$");
          System.out.println(" ");
           
           try { 
               Scanner leer = new Scanner(archivo); 
               leer.nextLine(); 
               
               while (leer.hasNextLine()) {                   
                   String cadena = leer.nextLine(); 
                   String vector[] = cadena.split("-"); 
                   
                   double precio = Double.parseDouble(vector[2]); 
                   
                   if (precio >=10 && precio <=20){
                       System.out.println("Nombre: "+vector[0]+" Precio: "+vector[2]+" Total:"+vector[3]+"$");
                   }
                   
               }
            
        } catch (Exception e) {
               System.out.println("Error: "+e.getMessage());
        }
    }
}
