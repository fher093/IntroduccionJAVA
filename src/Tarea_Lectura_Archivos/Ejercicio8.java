
package Tarea_Lectura_Archivos;

import java.io.File;
import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        nombres();
    } 
    
    public static void nombres(){
         String ruta  = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\ManejoArchivos\\ejercicio6.txt";
           File archivo = new File (ruta);   
            
           try { 
               
               Scanner leer = new Scanner(archivo); 
               leer.nextLine(); 
               
               while(leer.hasNextLine()){
                   String cadena = leer.nextLine(); 
                   String vector[] = cadena.split(";"); 
                   
                   String nombres= vector[1];
                   char primeraLetra = nombres.toLowerCase().charAt(0);
                   
                   if(primeraLetra=='a' ||primeraLetra=='e'||primeraLetra=='i'||primeraLetra=='o'||primeraLetra=='u'){
                       System.out.println(cadena);
                   }
               }
            
        } catch (Exception e) {
               System.out.println("Error: "+e.getMessage());
        }
    }
}
