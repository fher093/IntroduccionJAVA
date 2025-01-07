
package TareaManejoArchivos;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        factura();
    } 
    public static void factura(){
        String ruta  = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\ManejoArchivos\\ejercicio4.txt";
        File archivo = new File(ruta); 
        
        try { 
            PrintWriter escribir = new PrintWriter(archivo); 
            Scanner teclado = new Scanner(System.in); 
            System.out.println("Ingrese cuantas facturas necesita "); 
            int cantidad = teclado.nextInt(); 
            teclado.nextLine(); 
            
            escribir.println("Producto"+"-"+"Cantidad"+"-"+"Precio"+"-"+"Total");
            double total = 0;
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el nombre del producto: "); 
                String producto = teclado.nextLine(); 
                
                System.out.println("Cantidad: ");
                int nCantidad= teclado.nextInt();  
                
                System.out.println("Precio: ");
                double precio = teclado.nextDouble(); 
                teclado.nextLine();
                
                total = nCantidad*precio; 
                
                escribir.println(producto+"-"+nCantidad+"-"+precio+"-"+total);
            }
            
            escribir.close();
            
        } catch (Exception e) { 
            System.out.println("Error: "+e.getMessage());
        }
    }
}
