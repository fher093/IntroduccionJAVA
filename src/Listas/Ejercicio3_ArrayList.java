
package Listas;

import java.util.ArrayList;

public class Ejercicio3_ArrayList {
    public static void main(String[] args) {
        ArrayList <String> palabras = new ArrayList<>(); 
        palabras.add("amarillo");
        palabras.add("tomate");
        palabras.add("amar");
        palabras.add("computadora"); 
        palabras.add("amigos"); 
        
        imprimirLista(palabras); 
        filtroPalabras(palabras);
    } 
    
    public static void filtroPalabras(ArrayList<String> Lista){ 
        ArrayList <String> filtradas = new ArrayList<>();
        for (int i = 0; i < Lista.size(); i++) {
            String palabra = Lista.get(i);
            if(palabra.charAt(1)=='m' &&palabra.length()>5){
                filtradas.add(palabra);
            }
        }
        System.out.println("--Palabras Filtradas --");
        imprimirLista(filtradas);
    } 
    
    public static void imprimirLista(ArrayList <String> Lista){
        for (String palabra : Lista) {
                System.out.println(palabra);
        }
    }
}
