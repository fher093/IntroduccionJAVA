
package Listas;

import java.util.ArrayList;

public class Ejercicio4_ArrayList {
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
        vocalesAbiertas(palabras);
     }  
    public static void vocalesAbiertas(ArrayList<String> Lista){
        ArrayList<String> abiertas = new ArrayList<>(); 
        for (int i = 0; i < Lista.size(); i++) {
        String palabra = Lista.get(i); 
        char ultimaLetra = palabra.charAt(palabra.length()-1);
            if(ultimaLetra == 'a' || ultimaLetra == 'e' || ultimaLetra == 'o'){
                abiertas.add(palabra);
            }
        } 
        System.out.println("--Palabras terminadas en vocales abiertas--");
        imprimirLista(abiertas);
        
    }
    
    public static void imprimirLista (ArrayList<String> Lista){
        for (String palabra : Lista) {
                System.out.println(palabra);
        }
    }
}
