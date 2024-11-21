

package Arrays;


public class Arreglos {
    public static void main(String[] args) {
        
        //ARREGLO UNIDIMENSIONAL
        
        int [] arreglo1; //declaracion de un vector 
        
        arreglo1 = new int[5]; //inicializacion de un vector 
        
        //Primera forma de asignar valores en un vector
       arreglo1[0]=1;
       arreglo1[1]=2;
       arreglo1[2]=3;
       arreglo1[3]=4;
       arreglo1[4]=5; 
       
       //Segunda forma de asignar valores en un vector       
       //int []arreglo1 ={6,7,8,9,10}; 
       
       //bucle para imprimir todos los elementos de los vectores 
        System.out.println("ARREGLO UNIDIMENSIONAL");
       for (int i=0; i< arreglo1.length;i++){
           System.out.println(arreglo1[i]);
       }
        
       //ARREGLO BIDIMENSIONAL 
        String[][] arreglo2D; 
        
        arreglo2D = new String[3][3]; //matriz de 2x3 dos filas 3 columnas  
        
        arreglo2D[0][0]="NOMBRE" ;  
        arreglo2D[0][1]="APELLIDO";
        arreglo2D[0][2]="EDAD";  
        
        arreglo2D[1][0]="Fernando" ;  
        arreglo2D[1][1]="Llerena";
        arreglo2D[1][2]="23"; 
         
        
        //blucle para imprimir un arreglo 2d  
        System.out.println("ARREGLO BIDIMENSIONAL");
        for (int i = 0; i < arreglo2D.length; i++) {
            for (int j = 0; j < arreglo2D[i].length; j++) {
                System.out.print(arreglo2D[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }
}
