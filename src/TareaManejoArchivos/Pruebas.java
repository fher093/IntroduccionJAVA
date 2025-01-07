
package TareaManejoArchivos;

import java.util.Scanner;



public class Pruebas {
    public static void main(String[] args) {
        
        String v[] = new String[4]; 
        
        v[0]="Andres";
        v[1]="Juan";
        v[2]="Alex";
        v[3]="Andres";
         
        for (int i = 0; i < v.length; i++) {
            
            String palabra = v[i];
            char posicion = palabra.charAt(0);
            
            
            if (posicion == 'A') {
                System.out.println(palabra);
            }
            
        }
        
    }
}
