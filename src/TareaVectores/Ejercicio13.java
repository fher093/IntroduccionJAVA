
package TareaVectores;

import java.util.Scanner;


public class Ejercicio13 {
    public static void main(String[] args) {
        Notas(); 
    } 
    public static void Notas(){
       Scanner teclado = new Scanner(System.in); 
       double []notas = new double[10];
       
        System.out.println("Notas estudiantiles");
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota del estudiante "+(i+1));
            notas[i]=teclado.nextDouble();
        } 
        System.out.println("--Estudiantes Aprobados");
        int aporbados=0;
         for (int i = 0; i < notas.length; i++) {
            if(notas[i]>=7){
                System.out.println("Estudiante "+(i+1));
                aporbados++;
            }
        } 
         System.out.println("Total aprobados = "+aporbados);
        
       System.out.println("--Estudiantes Reprobados");
        int reporbados=0;
         for (int i = 0; i < notas.length; i++) {
            if(notas[i]<6.99){
                System.out.println("Estudiante "+(i+1));
                reporbados++;
            }
        } 
         System.out.println("Total reprobados = "+reporbados); 
         
         double promedio=0;
         double sumatoria=0;
                 
         for (int i = 0; i < notas.length; i++) {
            sumatoria += notas[i]; 
            promedio = sumatoria/10;
        } 
         System.out.printf("Promedio del curso: %.2f%n",promedio);
    }
    
    
}
