
package Matrices;

import java.util.Random;


public class Matrices {
    public static void main(String[] args) {
        int matriz [][] = definicionMatriz();
        imprimir(matriz);
    } 
    
    public static int [][] definicionMatriz(){
        //primero las filas luego las columnas 
        int [][] m = new int [3][3]; 
        //asignar valores 
        //m[6][5]=100;
        //tomar un valor 
        //int a = m[3][4]; 
        
        Random random = new Random(); 
        
        for (int i = 0; i < m.length; i++) {//me da el numero de filas 
            for (int j = 0; j < m[i].length; j++) { // me da el numero de columnas
                m[i][j] = random.nextInt(1);
            }
        } 
        
        return m;
    } 
    
    public static void imprimir(int matriz[][]){
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
