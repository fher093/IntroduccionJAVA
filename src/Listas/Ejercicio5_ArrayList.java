
package Listas;

import java.util.ArrayList;

public class Ejercicio5_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>(); 
        palabras.add("Antena");
        palabras.add("Celular");
        palabras.add("Pedazo");
        palabras.add("Enero");
        palabras.add("Cortar"); 
        palabras.add("Nieve"); 
        palabras.add("Sal"); 
        
        imprimirLista(palabras); 
        ultimaR(palabras);
     }  
    public static void ultimaR(ArrayList<String> Lista){
        System.out.println("==Palabras sin r al final==");
        ArrayList <String> sinR = new ArrayList<>(Lista);
        for (int i = 0; i < sinR.size(); i++) {
            String palabra = sinR.get(i); 
            char ultimaLetra = palabra.charAt(palabra.length()-1); 
            if (ultimaLetra == 'r') {
                
                sinR.remove(i);
            }
        }
        imprimirLista(sinR);
    }
    
    public static void imprimirLista (ArrayList<String> Lista){
        for (String palabra : Lista) {
                System.out.println(palabra);
        }
    }
}
