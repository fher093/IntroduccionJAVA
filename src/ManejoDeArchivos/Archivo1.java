package ManejoDeArchivos;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Archivo1 {
    public static void main(String[] args) {
        try{ //verifica si existe el archivo
            String ruta = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\modificado.csv"; 
            File archivo = new File(ruta);
            Scanner leer = new Scanner(archivo); // lee el arcivo 
            //listas para almacenar valores
            ArrayList<String> combustible = new ArrayList<>();
            ArrayList<String> marcas = new ArrayList<>();
            while(leer.hasNextLine()){
                //obtengo la cadena (linea) y hace el salto de linea
                String cadena = leer.nextLine(); //leo una linea y la almaceno en la variable cadena
                //transformo a vector, guardando los elementos cadena
                String v[] = cadena.split(";"); // almacena en un vector los elementos separados 
                //obtengo la marca
                marcas.add(v[1]);
            }
            System.out.println("Marcas almacenadas: "+marcas.size());
            System.out.println("=========================");
            System.out.println("ELIMINAR MARCAS CORTAS"); 
            int contador=0;
            for (int i = 0; i<marcas.size();i++) {
                if (marcas.get(i).length()<=3) { //obtengo el elemento y verifico si es de tamaño menor a 3
                    marcas.remove(i);
                    contador++;
                    i--;
                }
            }
            System.out.println("Marcas eliminadas: "+contador);
            System.out.println("Marcas almacenadas: "+marcas.size());
            System.out.println("=========================");
            
            for (String marca : marcas) {//imprimir los elementos de la fila 1
                System.out.println(marca);
            }
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage()); //mensaje de error 
        }
    }
}
