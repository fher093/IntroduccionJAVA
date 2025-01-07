
package Tarea_Lectura_Archivos;

import java.io.File;
import java.util.Scanner;



public class Ejercicio7 {
    public static void main(String[] args) {
        evaluacionTriangulo();
    } 
    
    public static void evaluacionTriangulo(){
           String ruta  = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\ManejoArchivos\\ejercicio5.txt";
           File archivo = new File (ruta);   
           
           try { 
               
              Scanner leer = new Scanner(archivo); 
              leer.nextLine(); 
               
               while (leer.hasNextLine()) {                   
                   String cadena = leer.nextLine(); 
                   String vector[] = cadena.split("\\|");  
                   
                   double base= Double.parseDouble(vector[0]); 
                   double altura= Double.parseDouble(vector[1]); 
                   double area= Double.parseDouble(vector[2]); 
                   
                   if(base>altura || area <altura){
                       System.out.println("base: "+base+" altura: "+altura+" area: "+area);
                   }
               }
            
        } catch (Exception e) {
               System.out.println("Error: "+e.getMessage());
        }
    }
    
}
