
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

                            
                            if (indice1 > 0 && indice1 <= menu.size() && indice2 > 0 && indice2 <= menu.size()) {
                               
                                String auxiliar = menu.get(indice1 - 1);
                                menu.set(indice1 - 1, menu.get(indice2 - 1));
                                menu.set(indice2 - 1, auxiliar);

                            } else {
                                System.out.println("Índices fuera de rango. Intente de nuevo.");
                            }
                            System.out.println("Lista Modificada: ");
                            imprimirLista(menu);
                            break;
                            
                    
                    case 3: 
                        System.out.println("Que posicion desea eliminar"); 
                        int indice = teclado.nextInt();  
                        if(indice >0 && indice <=menu.size() ){
                            
                        menu.remove(indice-1);
                        System.out.println("Nombre eliminado");
                        }else{
                            System.out.println("Indice incorrecto");
                        }
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
                System.out.println("=======================");
            System.out.println("Contenido de la lista:");
            for (int i = 0; i < Lista.size(); i++) {
                System.out.println((i+1)+".-"+Lista.get(i));
          }
                System.out.println("=======================");
        }
      
}
