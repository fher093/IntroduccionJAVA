
package TareaVectores;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Capicula();
    } 
    public static void Capicula(){
        Scanner teclado = new Scanner(System.in); 
        String [] palabras = new String[6]; 
        int posicioninicial= 0;
        int posicionfinal = palabras.length - 1;
        
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Ingrese una palabra");
            palabras[i]=teclado.next();
        }  
        
        System.out.print("[");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(" "+palabras[i]+"");
        }
        System.out.print("]"); 
        System.out.println(" ");
        while (posicioninicial<posicionfinal){
             if (!palabras[posicioninicial].equals(palabras[posicionfinal])) {
                System.out.println("no es capicula.");
                return;
            }
            posicioninicial++;  
            posicionfinal--;
        }
        System.out.println("es capicula");
    } 
    
    
}
