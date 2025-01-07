
package Tarea_Lectura_Archivos;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        nombresConB();
    } 
    
    public static void nombresConB(){
        
        String ruta  = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\ManejoArchivos\\ejercicio2.csv";
        File archivo = new File (ruta); 
        
        try { 
            Scanner leer = new Scanner(archivo); 
            
            ArrayList <String> nombres = new  ArrayList<>();
            while (leer.hasNextLine()) {            
                
                String palabra = leer.nextLine();  
                nombres.add(palabra); 
                            
            } 
            
            System.out.println("==Nombres del archivo==");
            for (String nombre : nombres) {
                    System.out.println(nombre);
                }
               
            System.out.println("==Nombres empezados con B con longitud mayor a 3==");
                
                
                for (int i = 0; i < nombres.size(); i++) {
                  
                    String p = nombres.get(i); 
                    
                    char primeraLetra = p.toLowerCase().charAt(0); 
                    
                    if (p.length()>3 &&  primeraLetra == 'b') {
                        System.out.println(p);
                    }
                }
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        
    }
}
