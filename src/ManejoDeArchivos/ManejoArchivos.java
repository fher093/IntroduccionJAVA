
package ManejoDeArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {
    public static void main(String[] args) {
         try {
            String ruta = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\modificado.csv";
            File archivo = new File(ruta);
            Scanner teclado = new Scanner(archivo); // lee los archivos
            while (teclado.hasNextLine()) { // hasnextline me devuelve un true mientras haya una linea que leel has lo siguiente 
                String v[] = teclado.nextLine().split(";"); //next line lee el elemento y salta el punto al siguiente elemento separa los lementos por ; y los almacena en un vector
                if (v.length>5) {
                    System.out.println(v[3] + "-" + v[5]);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
