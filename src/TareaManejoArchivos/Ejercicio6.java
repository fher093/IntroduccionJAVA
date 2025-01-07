
package TareaManejoArchivos;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        informacion();
    } 
    
    public static void informacion(){
        String ruta  = "C:\\Users\\usuario\\Desktop\\Primero 24-25\\PROGRAMACION\\ManejoArchivos\\ejercicio6.txt";
        File archivo = new File(ruta);  
        
        try {
            
            Scanner teclado = new Scanner(System.in);
            PrintWriter escribir = new PrintWriter(archivo); 
              escribir.println("cedula"+";"+"nombre"+";"+"apellido"+";"+"estado"+";"+"telefono"+";"+"genero"+";"+"sangre"+";"+"fecha"+";"+"edad");
                
            
            System.out.println("Cuantos registros de personas desa ingresar: ");
            int cantidad = teclado.nextInt(); 
            teclado.nextLine();
            
            for (int i = 0; i <cantidad; i++) {
                System.out.println("Datos persona: "+(i+1));
                System.out.println("Ingrese la cedula: ");
                String cedula = teclado.nextLine();

                System.out.println("Ingrese el nombre: ");
                String nombre = teclado.nextLine();
                nombre = nombre.toUpperCase();

                System.out.println("Ingrese el apellido: ");
                String apellido = teclado.nextLine();
                apellido = apellido.toUpperCase();

                System.out.println("Estado Civil: ");
                String estado = teclado.nextLine();
                estado = estado.toUpperCase();

                System.out.println("Ingrese el telefono: ");
                String telefono = teclado.nextLine();

                System.out.println("Ingrese el genero: ");
                String genero = teclado.nextLine();
                genero = genero.toUpperCase();

                System.out.println("Ingrese el tipo de sangre: ");
                String sangre = teclado.nextLine();
                sangre = sangre.toUpperCase();

                System.out.println("Ingrese la fecha de nacimiento: ");
                String fecha = teclado.nextLine();
                fecha = fecha.toUpperCase();

                System.out.println("Ingrese la edad: ");
                int edad = teclado.nextInt();
                teclado.nextLine();
                
                escribir.println(cedula+";"+nombre+";"+apellido+";"+estado+";"+telefono+";"+genero+";"+sangre+";"+fecha+";"+edad);
                
            } 
            
         escribir.close();
            
            
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
