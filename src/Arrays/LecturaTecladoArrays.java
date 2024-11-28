
package Arrays;

import java.util.Scanner;

public class LecturaTecladoArrays {
     
    public static void main(String[] args) { 
        
    NombrePersonas();
          
    } 
    
    public static void NombrePersonas(){
            
     Scanner teclado = new Scanner(System.in); 
    
    String []Personas = new String [2]; 
    
        System.out.println("Ingrese el nombre de las personas"); 
        
       for (int i=0; i<Personas.length;i++){
           System.out.println("Ingrese el nombre de la Persona "+(i+1)+": ");
           Personas[i]=teclado.next().toUpperCase();
        }  
       
        for (int i=0; i<Personas.length;i++){
           System.out.println("Persona "+(i+1)+": "+Personas[i]);
        }  
        
        //Imprimir la cantidad de letras de los nombres
        System.out.println("-------Cantidad de Letras de los nombres------");
           for (int i=0; i<Personas.length;i++){
                 String nombre=Personas[i]; //variable temporal 
                 int cantidad = nombre.length(); 
                 System.out.println(nombre+" = "+cantidad+" letras");       
        }  
           
        //SABER NOMBRES TERMINADOS EN VOCAL  
        int numeroNombresVocal= 0; 
        
        System.out.println("----Nombres que terminan en vocal---- "); 
        for (int i =0; i<Personas.length;i++){
             int ultimaletra= Personas[i].length()-1;// Busca la ultima letra en el nombre
             char letra = Personas[i].charAt(ultimaletra); // almacena la ultima letra en la variable letra 0
             
             if(letra== 'a' || letra=='e'|| letra=='i'|| letra=='o'|| letra=='u'){
                 numeroNombresVocal++;
                 System.out.println(Personas[i]);
             }
        }
             System.out.println("Numero de Nombres con Vocal "+numeroNombresVocal);
        
             //Ordenar Nombres 
             System.out.println("Orden de nombres alfabeticamente"); 
            
             String primero = Personas[0]; 
             String ultimo = Personas[0]; 
             
             for (int i = 0; i <Personas.length; i++) {
                 
                 if(Personas[i].charAt(0) < primero.charAt(0)){
                     primero = Personas[i];
                 }
                 if(Personas[i].charAt(0) > ultimo.charAt(0)){
                     ultimo = Personas[i];
                 }
            }
             
             System.out.println("Primera Persona"+primero);
             System.out.println("Ultima Persona"+ultimo);
             
            /* for(int i =0; i<Personas.length;i++){
                 char letra = Personas[i].charAt(0); 
                 int numero = letra;
                 System.out.println("Primera letra de "+Personas[i]+"="+letra); 
                 
             }*/ 
                         
        }        
    }
    
       

