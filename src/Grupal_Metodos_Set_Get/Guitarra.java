
package Grupal_Metodos_Set_Get;

public class Guitarra {
    private String marca; 
    private String modelo; 
    private int anio;
    private String pastillas;
    private String precio; 
    private boolean relic;

    public Guitarra() {
    }

    public Guitarra(String marca, String modelo, int anio, String pastillas, String precio, boolean relic) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.pastillas = pastillas;
        this.precio = precio;
        this.relic = relic;
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

    public String getPastillas() {
        return pastillas;
    }

    public void setPastillas(String pastillas) {
        this.pastillas = pastillas;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public boolean getRelic() {
        return relic;
    }

    public void setRelic(boolean relic) {
        this.relic = relic;
    }

    public void imprimirInformacion(){
        System.out.println("Informacion de la guitarra"); 
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Anio de fabricacion: "+getAnio());
        System.out.println("Tipo de pastilas: "+getPastillas());
        System.out.println("Precio: "+getPrecio()+"$");
        System.out.println("Relic: "+getRelic());
    }
    
    
    
}
