
package DeberListas;

import java.util.LinkedList;


public class Ejercicio1 {
    public static void main(String[] args) {
        LinkedList <String> cadena = new LinkedList<>(); 
        cadena.add("Hello");
        cadena.add("world");
        cadena.add("mi");
        cadena.add("primer");
        cadena.add("LinkedList");
        cadena.add("programado");
        cadena.add("en");
        cadena.add("Java");
        
         
        imprimirLista(cadena); 
        System.out.println("Valores Extremos: ");
        llenarVector(cadena);
    }  
    
    public static void llenarVector(LinkedList<String> Lista){
        String extremos[] = new String[2]; 
        
        extremos[0] = Lista.getFirst();
        extremos[1] = Lista.getLast(); 
        
       System.out.println("0.-"+extremos[0]);
       System.out.println((Lista.size()-1)+".-"+extremos[1]);
    }
    
    public static void imprimirLista(LinkedList<String> Lista){
        for (String string : Lista) {
            System.out.println(string);
        }
    }
}
