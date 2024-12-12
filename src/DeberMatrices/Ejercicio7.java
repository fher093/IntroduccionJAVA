
package DeberMatrices;

import java.util.Random;


public class Ejercicio7 {
    public static void main(String[] args) {
       
        Random random = new Random();
        int matriz [][] = new int[4][4]; 
         
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= random.nextInt(1,50);
                    System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" "); 
        }
            System.out.println("Dimension de de la matriz: "+matriz.length+"x"+matriz[0].length);
           
            int numeroMayor=matriz[0][0];
             int numeroMenor=matriz[0][0];
              int filaMayor = 0, columnaMayor = 0;
              int filaMenor = 0, columnaMenor = 0;
              
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] > numeroMayor) {
                    numeroMayor = matriz[i][j];
                    filaMayor=i;
                    columnaMayor=j;
        }
            if (matriz[i][j] < numeroMenor) {
                numeroMenor = matriz[i][j];
                filaMenor=i;
                columnaMenor=j;
        }
    }
}
            System.out.println("el numero mayor es: ["+filaMayor+"]["+columnaMayor+"]="+numeroMayor);
            System.out.println("el numero menor es: ["+filaMenor+"]["+columnaMenor+"]="+numeroMenor);
            
    }
    
}
