
package DeberListas;

import java.util.LinkedList;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        LinkedList <Integer> listaAleatoria = listaAleatoria(); 
        imprimirInfo(listaAleatoria); 
        System.out.println("Nueva Lista con Numeros 2");
        vector(listaAleatoria);
        System.out.println("Listra con numeros 2 Eliminados");
        imprimirInfo(listaAleatoria); 
    } 
    
    public static LinkedList<Integer> listaAleatoria(){
        LinkedList <Integer> listaAleatoria = new LinkedList<>(); 
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            listaAleatoria.add(random.nextInt(1,5));
        } 
        return listaAleatoria;            
    } 
    
    public static void vector(LinkedList<Integer> Lista){
        LinkedList <Integer> igualesaDos = new LinkedList<>(); 
        
        //correcccion recorrer la lista hacia atras 
        for (int i = Lista.size()-1; i >=0; i--) {
            int numero = Lista.get(i); 
            
            if(numero == 2){
                igualesaDos.add(numero); 
                Lista.remove(i);
            }
            
        }
        
        for (Integer igualesaDo : igualesaDos) {
            System.out.println(igualesaDo);
        }
    }
    
    public static void imprimirInfo(LinkedList<Integer> Lista){
          for (Integer integer : Lista) {
            System.out.println(integer);
        }
    }

}
