package controldatos;

import java.util.Scanner;

public class ControlDatos {

    public static void main(String[] args) {
           int valor = lecturaEnteros("Ingrese una edad: ");
           System.out.println("La edad ingresada es "+valor+" anios");
    }  
    
    //lectura enteros 
        public static int lecturaEnteros(){
    
            boolean correcto = true;
            int valor = 0;
            
                do {
                    Scanner teclado = new Scanner(System.in);
                    try {
                    System.out.println("Ingrese un entero"); // ejemplo de codigo quemado 
                    valor = teclado.nextInt();
                    correcto=false; 
                    } catch (Exception e) {
                      System.out.println("Error:  Ingrese solo enteros");
                  } 
                } while (correcto == true);
        return valor;
    }   
        
        //lectura enteros con modificacion de mensaje para evitar codigo quemado
        public static int lecturaEnteros(String texto){
    
            boolean correcto = true;
            int valor = 0;
            
                do {
                    Scanner teclado = new Scanner(System.in);
                    try {
                    System.out.println(texto);
                    valor = teclado.nextInt();
                    correcto=false; 
                    } catch (Exception e) {
                      System.out.println("Error:  Ingrese solo enteros");
                  }
                } while (correcto == true);
        return valor;
    }  
     
        //lectura double
        
        public static double lecturaDouble(String texto){ 
  
        boolean correcto = true;
        double valor = 0;
        
        do {
                Scanner teclado = new Scanner(System.in);
                try {
                    System.out.print(texto);
                    valor = teclado.nextDouble();
                    correcto=false;
                } catch (Exception e) {
                    System.out.println("Error:  Ingrese solo double");
                }
        } while (correcto == true);
        return valor;
    }    
        
        //lectura de un float
        
         public static float lecturaFloat(String texto){
    
        boolean correcto = true;
        float valor = 0;
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.println(texto);
                valor = teclado.nextFloat();
                correcto=false;
            } catch (Exception e) {
                System.out.println("Error:  Ingrese solo decimales");
            }
        } while (correcto == true);
        return valor;
    }   
         //lectura de un Boolean
        public static boolean lecturaBooelan(String texto){
    
        boolean correcto = true;
        boolean valor = false;
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.println(texto);
                valor = teclado.nextBoolean();
                correcto=false;
            } catch (Exception e) {
                System.out.println("Error:  Ingrese solo valores booleanos");
            }
        } while (correcto == true);
        return valor;
    }    
        
        //lectura de un Char
        
        public static char lecturaChar(String texto) {
        Scanner teclado = new Scanner(System.in);
        char valor;

        while (true) {
            System.out.println(texto);
            String entrada = teclado.nextLine(); 


            if (entrada.length() != 1) {
                System.out.println("Error: debe ingresar solo un caracter.");

            }else{
                valor = entrada.charAt(0); 
                break; 
            }  
        }
        return valor;
    }    
}  


