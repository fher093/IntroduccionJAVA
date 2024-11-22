
package Deber_Herencia;


public class Cereal extends ProductoAlimenticio{
    private String marca; 
    private int contenidoNutricional; 

    public Cereal() {
    } 

    public Cereal(String marca, int contenidoNutricional, String nombre, double precio) {
        super(nombre, precio);
        this.marca = marca;
        this.contenidoNutricional = contenidoNutricional;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getContenidoNutricional() {
        return contenidoNutricional;
    }

    public void setContenidoNutricional(int contenidoNutricional) {
        this.contenidoNutricional = contenidoNutricional;
    }
     
     @Override 
    public void imprimir(){
        super.imprimir();
        System.out.println("Marca: "+getMarca());
        System.out.println("Contenido Nutricional: "+getContenidoNutricional()+" kilocalorias");
    }
    
    
    
}
