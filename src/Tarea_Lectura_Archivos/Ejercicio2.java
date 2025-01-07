
package Tarea_Lectura_Archivos;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        multiploCuatro();
    } 
    public static void multiploCuatro(){
         String ruta = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\ManejoArchivos\\ejercicio1.csv";  
         File archivo = new File(ruta); 
         
         try { 
             
             Scanner leer = new Scanner(archivo);  
             ArrayList <Integer> numeros = new ArrayList<>();
             ArrayList <Integer> posicionPar = new ArrayList<>(); 
             int sumatoria = 0;
                     
             while (leer.hasNextLine()) {                 
                 String linea = leer.nextLine().trim(); 
                 int numero = Integer.parseInt(linea); 
                 
                 if(!numeros.contains(numero)){
                     numeros.add(numero);
                 } 
                        
            } 
             
             for (int i = 0; i < numeros.size(); i++) {
                     if (i%2==0) {
                         posicionPar.add(numeros.get(i));
                     } 
             }  
             
             for (int i = 0; i < posicionPar.size(); i++) {
                 if(posicionPar.get(i)%4==0){
                     sumatoria+=posicionPar.get(i);
                 }
             }
                       
             for (int i = 0; i < posicionPar.size(); i++) {
                 System.out.println("["+i*2+"] "+posicionPar.get(i)); 
             } 
             
             System.out.println("Sumatoria Total: "+sumatoria);
             
        } catch (Exception e) {
             System.out.println("Error: "+e.getMessage());
        }
    }
}
