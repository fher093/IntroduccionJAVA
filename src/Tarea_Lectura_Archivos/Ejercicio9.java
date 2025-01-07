
package Tarea_Lectura_Archivos;

import java.io.File;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        evaluacionPalabra();
    } 
    public static void evaluacionPalabra(){
        String ruta  = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\ManejoArchivos\\listado-general.txt";
           File archivo = new File (ruta); 
           
           try {
      
               Scanner leer = new Scanner(archivo); 
               Scanner teclado = new Scanner(System.in); 
               int contadorA=0;
               int contadorB=0;
               int contadorC=0;
               int contadorD=0;  
               int contadorE=0;  
               
               
               System.out.println("Ingrese una letra para la primera posicion"); 
               String ingreso = teclado.next(); 
               char letraIngresada = ingreso.toLowerCase().charAt(0);
               
               System.out.println("Ingrese una posicion para la letra M"); 
               int posicion = teclado.nextInt();
               
               while (leer.hasNextLine()) {                   
                   String cadena = leer.nextLine(); 
                   
                   if(cadena.length()>4){
                   
                   char cuartaPosicion = cadena.toLowerCase().charAt(3); 
                   if (cuartaPosicion=='a' ||cuartaPosicion=='e'||cuartaPosicion=='i'||cuartaPosicion=='o'||
                       cuartaPosicion=='u') {
                       contadorA++;
                                 }          
                         } 
                   
                   if (cadena.length()>5) {
                       char quitaPosicion = cadena.charAt(4); 
                       if (quitaPosicion =='M') {
                           contadorB++;
                       }
                   }
                   
                   if(cadena.length()>4){
                   
                   char primeraPosicion =cadena.toLowerCase().charAt(0);
                   char cuartaPosicion = cadena.toLowerCase().charAt(3); 
                   if (primeraPosicion=='a' && cuartaPosicion=='f') {
                       contadorC++;
                                 }          
                         } 
                   
                   if (cadena.length()>6) {
                       char primeraPosicion =cadena.toLowerCase().charAt(0);
                       char terceraPosicion = cadena.toLowerCase().charAt(2); 
                       char sextaPosicion = cadena.toLowerCase().charAt(5); 
                       
                       if (primeraPosicion=='g' && terceraPosicion=='s' && sextaPosicion=='o') {
                           contadorD++;
                       }
                   } 
                   
                   if (cadena.length()>posicion) {
                       char primeraLetra = cadena.charAt(0);
                       char posicionM = cadena.charAt(posicion-1); 
                       
                       if (primeraLetra == letraIngresada && posicionM == 'm') {
                           contadorE++;
                       }
                   }
                
         }
               
               System.out.println("A-palabras con vocal en cuarta posicion: "+contadorA);
               System.out.println("B-palabras con letra M en quinta posicion: "+contadorB);
               System.out.println("C-palabras con 'a' en la primera posicion y 'f' en cuarta posicion: "+contadorC);
               System.out.println("D-palabra con 'g' en la primera posicion, 's' en la tercera posicion y 'o' en la sexta posicion: "+contadorD);
               System.out.println("E-letra ingresada por teclado en la primera posicion y letra 'm' en la posicion ingresada por teclado: "+contadorE);

               
        } catch (Exception e) {
               System.out.println("Error: "+e.getMessage());
        }
    }
}
