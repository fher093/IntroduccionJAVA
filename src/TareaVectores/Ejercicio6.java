
package TareaVectores;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        ProductoPunto();
    } 
    public static void ProductoPunto(){
        Scanner teclado = new Scanner(System.in); 
        int productoPunto= 0;
        System.out.println("Ingrese la dimension de los vectores"); 
        int dimension = teclado.nextInt(); 
        
        int [] vector1 = new int[dimension];
        int [] vector2 = new int[dimension]; 
        
        System.out.println("Vector 1");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Valor "+(i+1)+" :"); 
            vector1[i]=teclado.nextInt(); 
        } 
        
        System.out.print("-Vector U=(");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i]+" ");
        }
        System.out.print(")"); 
        System.out.println(" ");
        
        System.out.println("Vector 2");
        
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Valor "+(i+1)+" :"); 
            vector2[i]=teclado.nextInt(); 
        } 
        System.out.print("-Vector V=(");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i]+" ");
        }
        System.out.print(")");
        System.out.println(" ");
         
        for (int i = 0; i < dimension; i++) {
            productoPunto += vector1[i]*vector2[i];
        } 
        System.out.println("Producto punto = "+productoPunto);
    }
}
