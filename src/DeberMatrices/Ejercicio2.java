
package DeberMatrices;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio2 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        Random random = new Random();
        int sumaDiagonal = 0;
        
        System.out.println("Ingrese el tamanio de la fila: ");
        int fila = teclado.nextInt(); 
        System.out.println("Ingrese el tamanio de la columna");
        int columna = teclado.nextInt(); 
        
        int matriz[][] = new int[fila][columna]; 
        
        System.out.println("Matriz");
         for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) { 
                matriz[i][j]= random.nextInt(1,10);
            }
         }
         
          for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) { 
                System.out.print(matriz[i][j]+" ");
            } 
              System.out.println("");
         }
        
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) { 
                if( i == j){
                   sumaDiagonal+=matriz[i][j]; 
          } 
        }
      } 
         System.out.println("Suma diagonal superior es= "+sumaDiagonal);
     }
        
}
