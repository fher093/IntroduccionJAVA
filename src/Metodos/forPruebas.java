
package Metodos;

import java.util.Random;
import java.util.Scanner;

public class forPruebas {
   public static void main(String[] args) {  
       Scanner teclado = new Scanner(System.in);
       System.out.println("Cuantas placas  desea generar");
       int numeroPlacas = teclado.nextInt();
       System.out.println(Placas(numeroPlacas));
   } 
   
   public static void generarPlacas(int numeroPlacas){
        
       int contador = 1; 
       
       
       do{
            Random random = new Random();
        for(int i =1 ; i<=3; i++){  
            char letra = (char)(random.nextInt(65, 91)); 
            System.out.print(letra);
        } 
        System.out.print("-");
        for (int i = 0; i < 4; i++) {
           int numero = random.nextInt(0, 9); 
            System.out.print(numero);
            
       } 
        System.out.println(" ");
        contador++;
       }while(contador<=numeroPlacas);
       
       
    }  
   
   //metodo con retorno 

   // Método con retorno de tipo String
   public static String Placas(int numeroPlacas) {
       String resultado = "";  // Para acumular la cadena final
       Random random = new Random();
       
       for (int contador = 1; contador <= numeroPlacas; contador++) {
           // Generar 3 letras aleatorias
           for (int i = 1; i <= 3; i++) {  
               char letra = (char) (random.nextInt(65, 91)); // Letras mayúsculas
               resultado += letra;  // Concatenar la letra a la cadena
           }
           
           resultado += "-";  // Añadir el guion después de las letras
           
           // Generar 4 dígitos aleatorios
           for (int i = 0; i < 4; i++) {
               int numero = random.nextInt(10);  // Generar número entre 0 y 9
               resultado += numero;  // Concatenar el número a la cadena
           }
           
           resultado += "\n";  // Añadir un salto de línea después de cada placa
       }
       
       // Devolver la cadena completa con las placas generadas
       return resultado;
   }
}

   
   
   

