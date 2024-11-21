
package Herencia_Figuras;

public class Pruebas {
    public static void main(String[] args) {
         
        Cuadrado cuadrado1 = new Cuadrado(5, "Azul", 6, 5); 
        cuadrado1.imprimirInfo(); 
        
        System.out.println(""); 
        
        Circulo circulo1 = new Circulo(5.2, "Rojo", 8, 4);
        circulo1.imprimirInfo(); 
        
        System.out.println("");
        TrianguloRectangulo triangulo1 = new  TrianguloRectangulo(5, 3, "Verde", 9, 7); 
        triangulo1.imprimirInfo();
        
    }
}
