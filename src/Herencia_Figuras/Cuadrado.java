
package Herencia_Figuras;


public class Cuadrado  extends Figura{
 
    private double lado;

    public Cuadrado(double lado, String color, double ejeX, double ejeY) {
        super(color, ejeX, ejeY);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    } 
    
    @Override
    public void calcularArea(){
        double area = lado *lado;
        System.out.println("Area del cuadrado: "+area);        
    }
      
    @Override 
    public void imprimirInfo(){
        System.out.println("Cuadrado");
        super.imprimirInfo(); 
        System.out.println("lado: "+getLado()); 
        calcularArea();
        
    }
    
}
