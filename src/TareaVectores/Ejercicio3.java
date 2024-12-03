
package TareaVectores;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Nombres();
    } 
    public static void Nombres(){
        String [] nombres = new String[10]; 
        Scanner teclado = new Scanner(System.in); 
        
        for(int i=0;i<nombres.length;i++){
            System.out.println("Ingrese un nombre: ");
            nombres[i]= teclado.next();
        } 
        System.out.println("Longitud de los nombres");
        for(int i=0;i<nombres.length;i++){
            String nombre = nombres[i]; 
            int longitud = nombre.length();
            System.out.println(nombres[i]+" = "+longitud+" letras");
        }
        
    }
}
