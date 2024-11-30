package TareaVectores;

public class Ejercicio2 {
    public static void main(String[] args) {
        Impares();
    }

    public static void Impares() {
        int vector[] = {1, 15, 9, 18, 4, 2, 3, 12, 5, 40};
        int contador=0;
        System.out.println("Vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + i + "]" + " = [" + vector[i] + "]");
        }

        System.out.println("Posiciones pares");
        for (int i = 0; i < vector.length; i++) {
            if (i % 2 == 0) {
                System.out.println("[" + i + "]" + " = [" + vector[i] + "]");
            }
        }

        System.out.println("Valores impares en posiciones pares"); 
        
        for (int i = 0; i < vector.length; i++) {
            if (i % 2 == 0) {
                if (vector[i] % 2 != 0) {
                    contador++;
                    System.out.println("[" + i + "]" + " = [" + vector[i] + "]");
                }
            }
        }
        System.out.println("Numero de valores impares: "+contador);
    }
}
