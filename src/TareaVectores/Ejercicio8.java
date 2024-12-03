
package TareaVectores;

import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        Palabra();
    } 
    public static void Palabra(){
        Scanner teclado = new Scanner(System.in); 
        
        
        String [] vector = new String[6]; 
        for (int i = 0; i < vector.length; i++) {
              System.out.print("Ingrese una palabra: "); 
                String palabra = teclado.next(); 
                
                vector[i]=palabra;
        } 
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("["+vector[i]+"]");
        } 
        
        //validacion tamaño
        System.out.println("Ingrese un numero: ");
        int ingreso = teclado.nextInt();
        
        System.out.println("--Palabras con mas de "+ingreso+" letras--");
        for (int i = 0; i < vector.length; i++) {
            String frase  = vector[i];
            int longitud = frase.length(); 
            if(longitud>ingreso){
                System.out.println("["+vector[i]+"]");
            }
        }
        
        //validacion mas de 3 vocales
        System.out.println("--Palabras con mas de 3 vocales--");
        for (int i = 0; i < vector.length; i++) {
            String recorrido = vector[i]; 
            int contador=0; 
            
            for (int j = 0; j<recorrido.length(); j++) {
                char letra = recorrido.charAt(j); 
                if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                   letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')  {
                    contador++;
                }
            }  
            
            if(contador>3){
                    System.out.println("["+recorrido+"]" +" tiene "+contador+" vocales");                   
                }
        } 
        
    }
}
