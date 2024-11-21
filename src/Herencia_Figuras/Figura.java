
package Herencia_Figuras;

public abstract class Figura {
    private String color; 
    private double ejeX,ejeY; 


    public Figura(String color, double ejeX, double ejeY) {
        this.color = color;
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEjeX() {
        return ejeX;
    }

    public void setEjeX(double ejeX) {
        this.ejeX = ejeX;
    }

    public double getEjeY() {
        return ejeY;
    }

    public void setEjeY(double ejeY) {
        this.ejeY = ejeY;
    } 
    
    public abstract void calcularArea();
     
    public void imprimirInfo(){ 
        System.out.println("Color de la figura: "+getColor());
        System.out.println("Eje X: "+getEjeX());
        System.out.println("Eje Y: "+getEjeY());
    }
    
}
