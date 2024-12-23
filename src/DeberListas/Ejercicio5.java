
package DeberListas;

import java.util.LinkedList;
import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        funcionalidad();
    } 
    
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1.-Agregar Primero");
        System.out.println("2.-Agregar Ultimo");
        System.out.println("3.Intercambiar");
        System.out.println("4.-Eliminar");
        System.out.println("5.-Obtener Primero");
        System.out.println("6.-Obtener Ultimo");
        System.out.println("7.-Imprimir");
        System.out.println("8.-Salir");
    }
    
    public static void funcionalidad(){
        LinkedList <String> cadena = new LinkedList<>();
         Scanner teclado = new Scanner(System.in); 
        int opcion;
        
        do{
        menu();
        System.out.println("Ingrese una opcion"); 
        opcion = teclado.nextInt();
        
            switch (opcion) {
                    case 1:
                        System.out.println("Ingrese una palabra");
                        String primero = teclado.next(); 
                        cadena.addFirst(primero);
                    break;
                    
                    case 2:
                        System.out.println("Ingrese una palabra");
                        String utlimo = teclado.next(); 
                        cadena.addLast(utlimo);
                    break;
                    
                    case 3:
                         
                        System.out.println("Ingrese el indice del primer elemento que quiere cambiar");
                        int indice1 = teclado.nextInt();
                        System.out.println("Ingrese el indice del segundo elemento por el cual quiere cambiar");
                        int indice2 = teclado.nextInt();

                        
                        if (indice1 > 0 && indice1 <= cadena.size() && indice2 > 0 && indice2 <= cadena.size()) {
                       
                            String auxiliar = cadena.get(indice1 - 1);
                            cadena.set(indice1 - 1, cadena.get(indice2 - 1));
                            cadena.set(indice2 - 1, auxiliar);
                            System.out.println("Lista Modificada: ");
                            imprimirLista(cadena); 
                        } else {
                            System.out.println("indices fuera de rango. Intente de nuevo.");
                        }
                    
                    
                    break; 
                    
                    case 4:
                        System.out.println("Ingrese la palabra a eliminar"); 
                        String nombre = teclado.next(); 
                        
                        for (int i = 0; i < cadena.size(); i++) {
                            String palabra = cadena.get(i); 
                            
                            if (palabra.equals(nombre)) {
                                cadena.remove(palabra);
                            }
                            
                        } 
                            imprimirLista(cadena);
                                               
                    break;
                    
                    case 5:
                    //cadena.getFirst(); 
                        System.out.println("Primer elemento "+cadena.getFirst());
                    break;
                    
                    case 6:
                        System.out.println("Ultimo elemento "+cadena.getLast());
                    break; 
                    
                    case 7:
                        imprimirLista(cadena);
                    break; 
                    
                    case 8:
                        System.out.println("Saliendo.....");
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
            }
        
        
        
        }while (opcion <=8);            
            
        
        
       
    } 
    
    public static void imprimirLista(LinkedList <String> LIsta){
        System.out.println("================");
        System.out.println("LISTA :");
        for (String string : LIsta) {
            System.out.println(string);
        }
        System.out.println("================");
    }
}
