package TareaVectores;

import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        NuevoVector();
    } 
    
    public static void NuevoVector(){
        Random random = new Random(); 
        int contador = 0;
        int[] vector1 = new int[20]; 
        
        
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = 150 + random.nextInt(151);  
            System.out.println(vector1[i]);
            if (vector1[i] > 225) {
                contador++; 
            }
        }
        
        System.out.println("Numeros mayores a 225 = " + contador); 
        
        // segundo vector
        int[] vector2 = new int[contador]; 
        
        for (int i = 0, j = 0; i < vector1.length; i++) {
            if (vector1[i] > 225) {
                vector2[j] = vector1[i];  
                j++;  
            }
        }
        
        System.out.println("Nuevo vector con numeros mayores a 225:"); 
        for (int i = 0; i < vector2.length; i++) {
            System.out.println(vector2[i]);
        }
    }
}
