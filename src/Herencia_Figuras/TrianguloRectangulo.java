
package Herencia_Figuras;

public class TrianguloRectangulo extends Figura {
    private double base,altura; 

    public TrianguloRectangulo(double base, double altura, String color, double ejeX, double ejeY) {
        super(color, ejeX, ejeY);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    } 
    
    @Override
    public void calcularArea(){
        double area = (base*altura)/2; 
        System.out.println("El area del triangulo es: "+area);
    }

 @Override 
  
    public void imprimirInfo(){
        System.out.println("Triangulo");
        super.imprimirInfo(); 
        System.out.println("Base: "+getBase()); 
        System.out.println("Altura: "+getAltura());
        calcularArea();
    }
    
    
}
