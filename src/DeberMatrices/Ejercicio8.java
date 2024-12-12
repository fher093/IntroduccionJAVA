
package DeberMatrices;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
       Random random = new Random();  
       Scanner teclado = new Scanner(System.in); 
       
       int matriz[][]= new int[6][6]; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==j) {
                    matriz[i][j]=random.nextInt(1,10);
                }else{
                matriz[i][j]=0;  
                } 
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        } 
        
        System.out.println("Ingrese un entero a multiplicar : "); 
        int entrada = teclado.nextInt(); 
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]!=0) {
                    matriz[i][j]=entrada*matriz[i][j];
                } 
                
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        
       
    }
}
