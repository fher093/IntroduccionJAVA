
package Grupal_Metodos_Set_Get;


public class Coche { 
     
    private String marca; 
    private String modelo; 
    private int anio; 
    private String numeroSerie; 
    private String color;
    private int precio;

    public Coche() {
    }

    public Coche(String marca, String modelo, int anio, String numeroSerie, String color, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroSerie = numeroSerie;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
      
    public void imprimirInformacion() {
        System.out.println("INFORMACION:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Anio: " + getAnio());
        System.out.println("Numero de Serie: " + getNumeroSerie());
        System.out.println("Color: " + getColor());
        System.out.println("Precio: " + getPrecio());
        
        
    }
}
