
package Listas;

import java.util.ArrayList;

public class Ejercicio6_ArrayList {
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
        conR(palabras);
     }  
    public static void conR(ArrayList<String> Lista){
        System.out.println("==Palabras con r al final=="); 
        ArrayList<String> conR = new ArrayList<>(); 
        for (int i = 0; i < Lista.size(); i++) {
            String palabra = Lista.get(i);
            char ultimaLetra = palabra.charAt(palabra.length()-1); 
            if (ultimaLetra=='r') {
                conR.add(palabra);
            }
        }
        imprimirLista(conR);
    }
    public static void imprimirLista (ArrayList<String> Lista){
        for (String palabra : Lista) {
                System.out.println(palabra);
        }
    }
}
