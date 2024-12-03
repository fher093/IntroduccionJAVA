
package TareaVectores;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[] args) {
        EncontrarValor();
    } 
    
    public static void EncontrarValor(){
            Scanner teclado = new Scanner(System.in); 
            Random random = new Random();
        
            System.out.println("Ingrese la dimension del vector");
            int dimension = teclado.nextInt();
            
            int [] vector = new int[dimension]; 
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)random.nextInt(1,20); 
            System.out.println(vector[i]);
        } 
        
        System.out.println("Ingrese un valor a buscar: ");
        int entrada = teclado.nextInt(); 
        
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if(entrada==vector[i]){
                System.out.println("el numero "+entrada+" se encuentra en la posicion "+"["+(i+1)+"]="+vector[i]);
                contador++;
            }
              
        } 
        if(contador==0){
            System.out.println("el numero "+entrada+" no esta dentro del arreglo");
        }
    }
}
