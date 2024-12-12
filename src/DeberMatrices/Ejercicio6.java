
package DeberMatrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        Random rd = new Random(); 
        int numero;
        System.out.println("Ingrese el numero de filas: ");
        int filas = teclado.nextInt(); 
        
        System.out.println("Ingrese el numero de columnas: ");
        int columnas = teclado.nextInt(); 
        
        int matriz [][] = new int[filas][columnas]; 
        
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do{
                    numero =  rd.nextInt(1,10); 
                    matriz[i][j]=numero;
                }while(numero %2==0);
                System.out.print(matriz[i][j]+" ");
            } 
            System.out.println(" ");
        }
    }
}
