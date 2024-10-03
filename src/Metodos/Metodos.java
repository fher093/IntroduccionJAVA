
package Metodos;

import java.time.LocalDate;

public class Metodos {
    public static void main(String[] args) {
        //METODOS SIN RETORNO Y SIN PARAMETROS
        System.out.println("METODOS SIN RETORNO Y SIN PARAMETROS");
        saludo();  
        //------------------------------------------------------------------ 
        //METODOS SIN RETORNO Y CON PARAMETROS
        //Atraves de variable  
        System.out.println("METODOS CON RETORNO Y CON PARAMETROS");
        String name = "Juan Perez"; 
        saludo(name); 
        // de forma directa 
        saludo("Juan Perez directo");  
        //------------------------------------------------------------------ 
        //METODOS CON RETORNO Y SIN PARAMETROS 
        System.out.println("METODOS CON RETORNO Y SIN PARAMETROS");
        //Recibir a traves de una variable y usarla
        String cadena = retornaSaludo();
        System.out.println(cadena);  
        //usarla directamente 
        System.out.println(retornaSaludo()+" llamado directo"); 
        System.out.println(retornaFecha()); 
         
        //METODOS CON RETORNO Y SIN PARAMETROS 
        System.out.println(retornaSaludo("Fernando")); 
         
        int numero = controldatos.ControlDatos.lecturaEnteros();
        System.out.println("Factorial "+calculoFactorial(numero));
    }
    
    //METODOS SIN RETORNO Y SIN PARAMETROS
    public static void saludo(){
        System.out.println("Hola mundo");
    }
    //METODOS SIN RETORNO Y CON PARAMETROS
    public static void saludo(String nombre){
        System.out.println("Hola "+nombre); 
    }  
    
    //METODOS CON RETORNO Y SIN PARAMETROS
    public static String retornaSaludo(){ 
        return "Hola Mundo retorno";//en metodos con retorno siempre se los acompaña con un return
    } 
    public static String retornaFecha (){ //imprimir fecha 
        return LocalDate.now().toString();
    }
    //METODOS CON RETORNO Y CON PARAMETROS
    public static String retornaSaludo(String nombre){
        return "Saludos "+nombre;
    } 
    
    public static int calculoFactorial (int num){ 
        int factorial = 1; 
        int i =1; 
        while (i<=num){
            factorial *=i; 
            i++;
        }
        return factorial;
    }
}
