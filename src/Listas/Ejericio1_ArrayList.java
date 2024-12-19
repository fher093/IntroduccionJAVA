
package Listas;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejericio1_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList(); 
        alumnos.add("Alex");
        alumnos.add("Maria");
        alumnos.add("Juan");
        alumnos.add("Susana");
        alumnos.add("Andres");  
        alumnos.add("Pedro");  
        alumnos.add("Rosa");  
        
        imprimirLista(alumnos);
        encontrarNombre(alumnos);
    }  
    
    public static void encontrarNombre(ArrayList<String> Lista){
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Ingrese el nombre a buscar"); 
        String entrada = teclado.nextLine(); 
        boolean bandera = false;
        
        for (int i = 0; i < Lista.size(); i++) {
                if (Lista.get(i).equals(entrada)){
                bandera = true;
            }
        }
        
        if(bandera){
            System.out.println("El nombre " +entrada +" si existe");
        }else{
            System.out.println("El nombre "+entrada+" no existe");
        }
        
    }
    
    public static void imprimirLista(ArrayList<String> Lista){
        System.out.println("Lista de alumnos"); 
        for (String nombre : Lista) {
            System.out.println(nombre);
        }
    }
}
