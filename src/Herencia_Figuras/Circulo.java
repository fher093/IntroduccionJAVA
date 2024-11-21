
package Herencia_Figuras;

public class Circulo extends Figura{
    private double radio; 

    public Circulo(double radio, String color, double ejeX, double ejeY) {
        super(color, ejeX, ejeY);
        this.radio = radio;
    } 
    
    public double getRadio(){
        return radio;
    } 
    
    public void setRadio(double radio){
        this.radio= radio; 
    }  
    
    @Override
        public void calcularArea(){
        double area = Math.PI * Math.pow(radio, 2); 
        System.out.printf("El area del triangulo es: %.2f%n", area);

    }
     
    @Override 
    public void imprimirInfo(){ 
        System.out.println("Circulo");
        super.imprimirInfo();  
        System.out.println("Radio: "+getRadio());
        calcularArea();
        
    }
  
}
