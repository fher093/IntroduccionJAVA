
package Metodos;

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
        //Recibir a traves de una variable y usarla
        String cadena = retornaSaludo();
        System.out.println(cadena);  
        //usarla directamente
        
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
    //METODOS CON RETORNO Y CON PARAMETROS
    public static String retornaSaludo(String nombre){
        return "";
    }
}
