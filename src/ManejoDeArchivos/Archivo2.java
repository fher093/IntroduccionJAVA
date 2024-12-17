
package ManejoDeArchivos;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Archivo2 {
    public static void main(String[] args) {
        //CARGAR EL ARCHIVO E IMPRIMIR TODOS LOS POKEMON
        //GUARDAR EN UNA LISTA DE CADENA LOS POKEMON LEGENDARIOS
        try{
            String ruta = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\pokemon.csv";  
            File archivo = new File(ruta); 
            Scanner leer = new Scanner(archivo); 
            ArrayList <String> legendarios = new ArrayList<>();
            int contador = 0; 
            //  MUEVE EL PUNTERO A LA SIGUIENTE POSICION EVITANDO LA CABECERA 
            leer.hasNextLine();
            
            while (leer.hasNextLine()) {      
                String cadena = leer.nextLine();  
                String v[]= cadena.split(","); 
                boolean b = Boolean.parseBoolean(v[12]); 
                if( b==true){
                    legendarios.add(cadena);
                }
                   
            } 
            System.out.println("Pokemon legendarios: "+legendarios.size()); 
            for (String legendario : legendarios) {
                System.out.println(legendario);
            }
            

        }catch( Exception e){
            System.out.println("Error : "+e.getMessage());
        }
        
        
        
    } 
    // añadir en una lista los pokemon con nombre terminado en vocal
    // añadir en una lsita los pokemon con total >300
    // añadir en una lista los pokeon de tipo fuego 
    //añadir en una lista los pokemones no legendarios de generacion 3
}
