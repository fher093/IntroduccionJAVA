
package TareaManejoArchivos;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) { 
        notas();
        
    } 
    public static void notas(){
            String ruta  = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\ManejoArchivos\\ejercicio3.txt";
            File archivo = new File(ruta);  
        
        try { 
            PrintWriter escribir = new PrintWriter(archivo); 
                Scanner teclado = new Scanner(System.in); 
                    System.out.println("Ingrese la cantidad de estudiantes: ");
                        int catidad = teclado.nextInt();  
                        teclado.nextLine(); 
                        double promedio = 0;

                        escribir.println("Nombre"+";"+"Primer Parcial"+";"+"Segundo Parcial"+";"+"Promedio"); 
                        
                        for (int i = 0; i < catidad; i++) {
                           
                            System.out.println("Ingrese el nombre"); 
                            String nombre = teclado.nextLine(); 
                            
                            System.out.println("Ingrese la nota del primer parcial"); 
                            double primero = teclado.nextDouble();
                            
                            System.out.println("Ingrese la nota del segundo parcial"); 
                            double segundo = teclado.nextDouble(); 
                            teclado.nextLine();
                           
                            promedio = (primero+segundo)/2;
                           
                           escribir.println(nombre+";"+primero+";"+segundo+";"+promedio);
            }
             escribir.close();
                    
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }       
    }
    
}
