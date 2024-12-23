
package DeberListas;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        LinkedList <String> cadena = new LinkedList<>(); 
        leerEntrada(cadena);
        imprimirInfo(cadena);
    } 
    
    public static void leerEntrada(LinkedList <String> Lista){
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese una entrada"); 
        String entrada = teclado.nextLine(); 
        
        String vector[] = entrada.split(" "); 
        
        for (int i = 0; i < vector.length; i++) { 
            String palabra = vector[i];
            int longitud = palabra.length(); 
            
            if(longitud >=5 && longitud <=7){
                Lista.addFirst(palabra);
            } else if(longitud >=2 && longitud <=4){
                Lista.addLast(palabra);
            } 
            
        }
    } 
    
    public static void imprimirInfo(LinkedList <String> Lista){
        System.out.println("Lista modificada");
        for (String string : Lista) {
            System.out.println(string);
        }
    }
}
