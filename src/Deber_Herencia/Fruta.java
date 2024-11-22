
package Deber_Herencia;

public class Fruta extends  ProductoAlimenticio{
          private String tipo; 
          private String color; 

    public Fruta() {
    } 

    public Fruta(String tipo, String color, String nombre, double precio) {
        super(nombre, precio);
        this.tipo = tipo;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override 
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo: "+getTipo());
        System.out.println("Color: "+getColor());
    }
          
          
}
