
package Tarea_Lectura_Archivos;
 
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        evaluacionPalabra();
    } 
    
    public static void evaluacionPalabra(){
        
           String ruta  = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\ManejoArchivos\\ejercicio2.csv";
           File archivo = new File (ruta); 
           
           try { 
               Scanner leer = new Scanner(archivo); 
               ArrayList <String> nombres = new ArrayList<>(); 
               
               while (leer.hasNextLine()) {                   
                   String valor = leer.nextLine(); 
                   nombres.add(valor);
               } 
               System.out.println("==Nombres del archivo==");
               for (String nombre : nombres) {
                   System.out.println(nombre);
               } 
               
               System.out.println("==Nombres con longitud impar o empiecen con A==");
               
               for (int i = 0; i < nombres.size(); i++) {
                   String palabra = nombres.get(i); 
                   char posicion = palabra.toLowerCase().charAt(0);
                   
                   if(palabra.length() % 2!=0 || posicion=='a') {
                        System.out.println(palabra);
                   }
                   
               }
          
        } catch (Exception e) {
               System.out.println("Error: "+e.getMessage());
        }
        
    }
}
