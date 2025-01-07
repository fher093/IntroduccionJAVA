
package TareaManejoArchivos;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) { 
        triangulos();
    } 
    public static void triangulos(){
        String ruta  = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\ManejoArchivos\\ejercicio5.txt";
        File archivo = new File(ruta); 
        
        try { 
            Scanner teclado = new Scanner(System.in); 
            PrintWriter escribir = new PrintWriter(archivo); 
            boolean respuesta = true;
            double area = 0; 
            
            escribir.println("base"+"|"+"altura"+"|"+"area");
            
            do {          
                System.out.println("Ingrese la base del triangulo: ");
                double base = teclado.nextDouble(); 
                
                System.out.println("Ingrese la altura del triangulo: ");
                double altura = teclado.nextDouble(); 
                teclado.nextLine();
                
                area= (base*altura)/2;
              
                escribir.println(String.format("%.2f|%.2f|%.2f", base, altura, area));
                
                System.out.println("Desea ingresar otro triangulo (SI/NO)"); 
                String resp = teclado.nextLine(); 
                                
                if(resp.equalsIgnoreCase("no")){
                    respuesta=false;
                }
                
            } while (respuesta);
            
            escribir.close();
            
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
