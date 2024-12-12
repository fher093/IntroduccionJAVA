
package DeberMatrices;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese el numero de filas: ");
        int filas = teclado.nextInt(); 
        
        System.out.println("Ingrese el numero de columnas: ");
        int columnas = teclado.nextInt(); 
        
        int matriz [][] = new int[filas][columnas]; 
        
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=1;
                if(i<j){
                    matriz[i][j]=0;
                }
                System.out.print(matriz[i][j]+" ");
            } 
            System.out.println(" ");
        }
    }
}
