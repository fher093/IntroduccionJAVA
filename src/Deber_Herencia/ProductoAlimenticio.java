
package Deber_Herencia;

public class ProductoAlimenticio {
    private String nombre;
    private double precio; 

    public ProductoAlimenticio() {
    }

    public ProductoAlimenticio(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Precio: "+getPrecio()+"$");
    }
}
