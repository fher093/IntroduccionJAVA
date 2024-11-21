
package Arrays;

import java.util.Scanner;


public class Notas_Estudiantes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        
        //Pedir al usuario el tamaño del arreglo 
        System.out.println("Cuantos estudiantes desea registar ");
        int numeroEstudiantes = teclado.nextInt(); 
        teclado.nextLine();
    
    
    //Creamos el arreglo con la dimension ingresada por el usuario 
    String [][] estudiantes = new String[numeroEstudiantes][2];
    
    //asignar valores en el arreglo 
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("Estudiante "+(i+1) );
            System.out.print("Nombre: ");
            estudiantes[i][0]= teclado.nextLine(); 
            System.out.print("Nota: ");
            estudiantes[i][1]= teclado.nextLine();
            
        } 
        
        System.out.println("Datos "); 
        System.out.println("___Nombre____|___Nota____");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i][0]+"           "+estudiantes[i][1]);
            System.out.println("hola");
            }
        
    
    
    }
}
