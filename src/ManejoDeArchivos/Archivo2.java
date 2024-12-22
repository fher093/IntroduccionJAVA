package ManejoDeArchivos;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo2 {

    public static void main(String[] args) {
       //generacionLegendarios(); 
       terminadoVocal();
    } 
//añadir en una lista los pokemones no legendarios de generacion 3
    public static void generacionLegendarios(){
        try{
             
           //enlace de lectura 
            File archivo = new File("C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\pokemon.csv");
            File salida = new File("C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\generacionNolegendaria.csv");
            Scanner teclado = new Scanner(archivo); 
            
            PrintWriter escribir = new  PrintWriter(salida);
            
            ArrayList <String> lista = new ArrayList<>();
            teclado.nextLine();
           //enlace de escritura
            
            while(teclado.hasNextLine()){
                String cadena = teclado.nextLine(); 
                String v[] = cadena.split(",");
                int gen = Integer.parseInt(v[v.length-2]);//toma la penultima 
                boolean legendary = Boolean.parseBoolean(v[v.length-1]); //toma la ultima
                if(!legendary && gen==3){
                    lista.add(cadena);
                    System.out.println(v[1]+"-"+gen+"-"+legendary); 
                    escribir.println(v[1]+"-"+gen+"- "+legendary);
                }
            }
            
            escribir.close();
            
        }catch(Exception e ){
            e.printStackTrace();
        } 
        
        
    } 
    
    public static void terminadoVocal(){
        try {
            File archivo = new File("C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\generacionNolegendaria.csv"); 
            File salida = new File("C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\generacionNolegendariaTerminadosenVocal.csv"); 
            PrintWriter escribir = new PrintWriter(salida);
            Scanner leer = new Scanner(archivo);
             
           ArrayList <String> vocal = new ArrayList<>(); 
           
            while (leer.hasNextLine()) {                
                String cadena = leer.nextLine(); 
                String v[] = cadena.split("-"); 
                String nombre = v[0];
                char ultimaLetra = nombre.charAt(nombre.length()-1); 
                
                if (ultimaLetra=='a'||ultimaLetra=='e'||ultimaLetra=='i'||ultimaLetra=='o'||ultimaLetra=='u') {
                    
                    vocal.add(cadena);
                    System.out.println(cadena); 
                    escribir.println(v[0]);
                }
            } 
            escribir.close();
        
        
        } catch (Exception e) { 
            System.out.println("Error "+e);
        }
    }
    
}
