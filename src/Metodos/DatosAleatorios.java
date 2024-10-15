package Metodos;

import java.util.Random;

public class DatosAleatorios {
    
    static Random aleatorio = new Random(); //instancia de una clase  con una variable global.
    public static void main(String[] args) {
        int valor = aleatorioAlto(); 
        System.out.println("Numero aleatorio alto: "+valor); 
        //ingresar un valor por teclado usando metodos de control de dato.
        int dato = controldatos.ControlDatos.lecturaEnteros();
        int valor2 = aleatorio(dato); //numero aleatorio con rango 
        System.out.println("Numero aleatorio con rango: "+valor2); 
        
        //aleatorio con rango
        int minimo = controldatos.ControlDatos.lecturaEnteros("Ingrese el valor minimo: ");
        int maximo = controldatos.ControlDatos.lecturaEnteros("Ingrese el valor maximo: "); 
        
        int aleatorioRango = aleatorio(minimo, maximo); 
        System.out.println("Numero aleatorio entre "+minimo+" y "+maximo+" = "+aleatorioRango);
         
        //aleatorio con caracteres 
        
        System.out.println("Letra aleatoria: "+letraAleatoria());
    }
    
    //NUMERO ALEATORIO ALTO 
    public static int aleatorioAlto(){ 
        int valor = aleatorio.nextInt(); 
        return valor;
    }
    //NUMERO ALEATORIO ENTRE 0 Y UN VALOR
    public static int aleatorio(int rango){ // recibe un parametro para el rango
        int valor = aleatorio.nextInt(rango); 
        return valor;
    }
    //NUMERO ALEATORIO ENTRE UN RANGO DE VALORES 
    public static int aleatorio(int min, int max){ // parametros ejemplo valores de 5 al 15  
        return aleatorio.nextInt(min,max); 
    }
    //CARACTER ALEATORIO
    public static char letraAleatoria (){
        int valor = aleatorio.nextInt(65,91); // rango en el codigo ascii 
        char letra = (char) valor; // (char) convierte el int valor a char 
        return letra;
    }
    
}