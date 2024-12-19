
package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7_ArrayList {
    public static void main(String[] args) {
        
       // menu();
        funcionalidades(); 
        
    } 
    
    public static void menu (){
        System.out.println("Menu");
        System.out.println("1.Agregar");
        System.out.println("2.Intercambiar");
        System.out.println("3.Eliminar");
        System.out.println("4.Buscar");
        System.out.println("5.Imprimir");
        System.out.println("6.Salir");
    }  
    
  
    
    public static void funcionalidades(){
        ArrayList<String> menu = new ArrayList<>(); 
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        do {            
            menu();
         System.out.println("Ingrese una opcion"); 
         opcion = teclado.nextInt(); 
            
            switch (opcion) {
                    case 1:
                        System.out.println("Escriba la palabra que desea Agregar");
                        String palabra = teclado.next(); 
                        menu.add(palabra); 
                    break;
                    
                    case 2: 
                        System.out.println("Ingrese el indice que quiere cambiar");
                        int indice1 = teclado.nextInt(); 
                        System.out.println("Ingrese el indice por el cual quiere cambiar");
                        int indice2 = teclado.nextInt(); 
                        
                        String posicion1 = menu.get(indice1-1);
                        String posicion2 = menu.get(indice2-1); 
                        
                        posicion1=posicion2;
                        posicion2=posicion1;
                        
                        /*menu.add(posicion2);
                        menu.add(posicion1);*/
                    break;
                    
                    case 3: 
                        System.out.println("Que numero de palabra desea eliminar"); 
                        int indice = teclado.nextInt(); 
                        menu.remove(indice-1);
                    break; 
                     
                    case 4: 
                        System.out.println("Escriba la palabra que desea buscar"); 
                        String entrada = teclado.next(); 
                        boolean existe = false;

                        for (int i = 0; i < menu.size(); i++) {
                            if (menu.get(i).equals(entrada)) {
                                System.out.println("La palabra existe en posición " + (i + 1));
                                existe = true;
                                break; 
                            }
                        }

                        if (!existe) {
                            System.out.println("La palabra no existe");
                        }
                    break;
                     
                    case 5: 
                        imprimirLista(menu);
                    break;  
                     
                    case 6: 
                          System.out.println("Saliendo del programa.....");
                    break; 
           
                    default:
                        System.out.println("opcion no valida");;
            }
            
        } while (opcion <6); 
        
        
    } 
    
      public static void imprimirLista(ArrayList<String> Lista) {
       /* if (Lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {*/
            System.out.println("Contenido de la lista:");
            for (int i = 0; i < Lista.size(); i++) {
                System.out.println((i+1)+".-"+Lista.get(i));
          }
        }
      
}
