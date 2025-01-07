
package Tarea_Lectura_Archivos;

import java.io.File;
import java.util.ArrayList;

import java.util.Scanner;



public class Ejercicio1 {
    public static void main(String[] args) {
        multiplos();
    } 
    
    public static void multiplos(){
        String ruta = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\ManejoArchivos\\ejercicio1.csv";  
        File archivo = new File(ruta); 
        try {
            Scanner leer = new Scanner(archivo); 
           ArrayList <Integer> num = new ArrayList<>();
            while (leer.hasNextLine()) {
               
               String linea = leer.nextLine().trim();
                int numero = Integer.parseInt(linea);
                
                if(!num.contains(numero)){
                    num.add(numero);
                }
               
            } 
           
            
           ArrayList <Integer> multiplosVeinteyUno = new ArrayList<>();
           int contadorUno =0;
           ArrayList <Integer> multiplosTreintayDos = new ArrayList<>();
           int contadorDos =0;
           ArrayList <Integer> multiplosCuarentayUno = new ArrayList<>();
           int contadorTres =0;
           ArrayList <Integer> multiplosCincuentayDos = new ArrayList<>();
           int contadorCuatro =0;
            for (int i = 0; i < num.size(); i++) {
                        
                int numero = num.get(i);
                if (numero % 21==0) {
                    multiplosVeinteyUno.add(numero);
                    contadorUno++;
                }
                if (numero % 32==0) {
                    multiplosTreintayDos.add(numero);
                    contadorDos++;
                }
                if (numero % 41==0) {
                    multiplosCuarentayUno.add(numero);
                    contadorTres++;
                }
                if (numero % 52==0) {
                    multiplosCincuentayDos.add(numero);
                    contadorCuatro++;
                }
               
            } 
            System.out.println("Numeros multiplos de 21: "+contadorUno);
            for (Integer integer : multiplosVeinteyUno) {
                System.out.println(integer);
            } 
            
            System.out.println("Numeros multiplos de 32: "+contadorDos);
            for (Integer integer : multiplosTreintayDos) {
                System.out.println(integer);
            } 
            
            System.out.println("Numeros multiplos de 41: "+contadorTres);
            for (Integer integer : multiplosCuarentayUno) {
                System.out.println(integer);
            } 
            
            System.out.println("Numeros multiplos de 52: "+contadorCuatro);
            for (Integer integer : multiplosCincuentayDos) {
                System.out.println(integer);
            }
            
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        
        
    }
}
