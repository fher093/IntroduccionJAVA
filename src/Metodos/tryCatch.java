
package Metodos;

import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {  
        ingresoNumero("ingrese un numero");
    }
    
    public static int ingresoNumero(String texto){
        boolean bandera = true; 
        int numero = 0;
        do{ 
            Scanner teclado = new Scanner (System.in);
            try{
                System.out.println(texto);
                 numero = teclado.nextInt(); 
                bandera = false;
            }catch(Exception e){
                System.out.println("INGRESE SOLO NUMEROS");
            }
        }while(bandera); 
        
        System.out.println("El numero "+numero+" se ingreso correctamente"); 
        return numero;
    }  
    
    }

