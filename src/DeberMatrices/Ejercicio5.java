
package DeberMatrices;

import java.util.Scanner;

public class Ejercicio5 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese el numero de filas: ");
        int filas = teclado.nextInt(); 
        
        System.out.println("Ingrese el numero de columnas: ");
        int columnas = teclado.nextInt(); 
        
        String matriz [][] = new String[filas][columnas]; 
        
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if((i+j)%2==0){
                    matriz[i][j]="@";
                }else{
                    matriz[i][j]="?";
                }
                System.out.print(matriz[i][j]+"  ");
            } 
            System.out.println(" ");
        }
    }

}
