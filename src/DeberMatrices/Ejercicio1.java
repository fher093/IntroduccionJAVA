
package DeberMatrices;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese el tamanio de la fila: ");
        int fila = teclado.nextInt(); 
        System.out.println("Ingrese el tamanio de la columna");
        int columna = teclado.nextInt(); 
        
        int matriz[][] = new int[fila][columna]; 
        
        System.out.println("Matriz identidad");
        
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) { 
                if( i == j){
                   matriz[i][j]=1; 
                   
                }else{
                 matriz[i][j]=0; 
            }
                  System.out.print(matriz[i][j]+" ");
        }
            System.out.println(" ");
        }
    }
}
