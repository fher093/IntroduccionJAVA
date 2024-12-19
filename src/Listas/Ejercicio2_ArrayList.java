
package Listas;

import java.util.ArrayList;
import java.util.Random;


public class Ejercicio2_ArrayList {
    public static void main(String[] args) {
     
        ArrayList<Integer> numerosRandom = new ArrayList<>();
        ListaAleatoria(numerosRandom);
        imprimirLista(numerosRandom);
        
    } 
    
    public static void ListaAleatoria(ArrayList<Integer> Lista){
        Random random = new Random(); 
        
        for (int i = 1; i < 100; i++) { 
            int numeros = random.nextInt(7,701);
            if(numeros %7==0) {
                Lista.add(numeros);               
            }
        }
    } 
    
        public static void imprimirLista(ArrayList<Integer> Lista){
            System.out.println("Numeros aleatorios multiplos de 7");
                for (int numero : Lista) {
                     System.out.println(numero);
                }
        }
}
