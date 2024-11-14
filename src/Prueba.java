
import java.util.Random;
import java.util.Scanner;


public class Prueba {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un valor minimo"); 
        int minimo = teclado.nextInt(); 
        System.out.println("Ingrese un valor maximo"); 
        int maximo = teclado.nextInt();  
        
        System.out.println("El promedio es = "+promedio(minimo, maximo));
        
    } 
    
    public static double promedio (int minimo, int maximo){ 
        Random random = new Random(); 
             
        int numero = 0; 
        double sumatoria = 0;
        System.out.println("Numeros generados : "); 
        for(int i =1 ;i<=20; i ++){ 
             numero = random.nextInt(minimo, maximo);  
             
             System.out.print(numero+",");
            sumatoria+=numero; 
           
        }  
        System.out.println("");
        double promedio = sumatoria/20; 
        
        return promedio;
    }
}
