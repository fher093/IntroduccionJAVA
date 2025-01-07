
package Tarea_Lectura_Archivos;

import java.io.File;
import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        notas();
    } 
    
    public static void notas(){
        String ruta  = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\ManejoArchivos\\ejercicio3.txt";
           File archivo = new File (ruta); 
           
           try { 
               Scanner leer = new Scanner(archivo); 
                leer.nextLine(); 
                
                System.out.println("Estudiantes con promedios mayorea a 8 y que empiecen con C o E");
               while (leer.hasNextLine()) {                   
                    String cadena = leer.nextLine();  
                    String datos[] = cadena.split(";"); 
                    String nombre = datos[0];  
                    char primeraLetra = nombre.toLowerCase().charAt(0);
                    double promedio =Double.parseDouble(datos[3]); 
                   
                        if (primeraLetra=='e' && promedio>8) {
                            System.out.println("Nombre: "+nombre+" Promedio: "+promedio);    
                   }
               }      
            
        } catch (Exception e) {
               System.out.println("Error: "+e.getMessage());
        }
    }
}
