
package TareaManejoArchivos;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        ingresoNombres();
    } 
    
    public static void ingresoNombres(){
        
        PrintWriter escribir = null;
        try {
            String ruta = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\ManejoArchivos\\ejercicio2.csv";
            File archivo = new File(ruta); 
            escribir = new PrintWriter(archivo);  
            
            ArrayList <String> nombres = new ArrayList<>();
            Boolean respuesta = true;
            
            do {                 
                Scanner teclado  = new Scanner(System.in);
                     System.out.println("Ingrese un nombre: "); 
                        String nombre = teclado.nextLine(); 
                             nombres.add(nombre);
                             
                System.out.println("Desea ingresar otro nombre (Si/No)");
                String resp = teclado.nextLine(); 
                
                if(resp.equalsIgnoreCase("no")){
                    respuesta = false;
                }
                
                
            } while (respuesta);
            
            for (String nombre : nombres) {
                escribir.println(nombre);
            }
            
            
        } catch (Exception e) {
            System.out.println("Error:  "+e.getMessage());
        }        
            escribir.close();
    }
}
