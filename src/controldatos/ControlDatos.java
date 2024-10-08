package controldatos;

import java.util.Scanner;

public class ControlDatos {

    public static void main(String[] args) {
             //lecturaEnteros(); 
            // lecturaDouble();
            //ecturaFloat(); 
            //lecturaBooelan();
            //lecturaChar();
    } 
        public static int lecturaEnteros(){
    
            boolean correcto = true;
            int valor = 0;
            
                do {
                    Scanner teclado = new Scanner(System.in);
                    try {
                    System.out.println("Ingrese un entero");
                    valor = teclado.nextInt();
                    correcto=false; 
                    } catch (Exception e) {
                      System.out.println("Error:  Ingrese solo enteros");
                  }
                } while (correcto == true);
        return valor;
    }  
    
        public static double lecturaDouble(){
  
        boolean correcto = true;
        double valor = 0;
        
        do {
                Scanner teclado = new Scanner(System.in);
                try {
                    System.out.println("Ingrese un Double");
                    valor = teclado.nextDouble();
                    correcto=false;
                } catch (Exception e) {
                    System.out.println("Error:  Ingrese solo double");
                }
        } while (correcto == true);
        return valor;
    }   
        
         public static float lecturaFloat(){
    
        boolean correcto = true;
        float valor = 0;
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.println("Ingrese un Decimal");
                valor = teclado.nextFloat();
                correcto=false;
            } catch (Exception e) {
                System.out.println("Error:  Ingrese solo decimales");
            }
        } while (correcto == true);
        return valor;
    }   
         
        public static boolean lecturaBooelan(){
    
        boolean correcto = true;
        boolean valor = false;
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.println("Ingrese un Boolean");
                valor = teclado.nextBoolean();
                correcto=false;
            } catch (Exception e) {
                System.out.println("Error:  Ingrese solo valores booleanos");
            }
        } while (correcto == true);
        return valor;
    }   
        


        public static char lecturaChar() {
        Scanner teclado = new Scanner(System.in);
        char valor;

        while (true) {
            System.out.println("Ingrese un caracter:");
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


