
package TareaManejoArchivos;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {     
        numerosAleatorios();    
    } 
    
    public static void numerosAleatorios(){ 
          Random random = new Random();
          PrintWriter escribir = null;
        try {
            String ruta = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\ManejoArchivos\\ejercicio1.csv";
            File archivo = new File(ruta);
            escribir = new PrintWriter(archivo);
            ArrayList<Integer> lista = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                lista.add(random.nextInt(5,501));
            }   
            for (Object numeros : lista) {
                
                escribir.println(numeros);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } 
            escribir.close();
        
    }
}
