/*Realice un programa que llene un vector con 10 valores aleatorios y cuente las apariciones de un
valor dado por teclado en el vector. */
package TareaVectores;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        vectorRandom();
    } 
    
    public static void vectorRandom(){
        Scanner teclado = new Scanner(System.in);
        int vectorRandom[] =new int[10]; 
        Random random = new Random();
        System.out.println("Vector con valores aleatorios del 1 al 10"); 
        
        for (int i = 0; i < vectorRandom.length; i++) {
            vectorRandom[i]= (int) random.nextInt(1,9); 
            System.out.println("["+vectorRandom[i]+"]");
        } 
        System.out.println("Ingrese un  numero para ver cuantas veces se repite: "); 
        int entrada = teclado.nextInt(); 
        
         while (entrada < 1 || entrada > 10) {
            System.out.println("Numero fuera de rango.");
            System.out.println("Ingresa un numero entre 1 y 10: ");
            entrada = teclado.nextInt();
        } 
         
        int contador = 0;
        for (int i = 0; i <vectorRandom.length; i++) {
            if(entrada == vectorRandom[i]){
                contador++;
            }
        } 
        System.out.println("El numero "+entrada+" se repite: "+contador+" veces");
    } 
    
   
    
}
