
package Grupal_Metodos_Set_Get;

public class Animal {
        private String especie; 
        private String nombre;
        private int edad; 
        private double peso; 
        private float tamanio; 
        private String color; 

    public Animal() {
    }

    public Animal(String especie, String nombre, int edad, double peso, float tamanio, String color) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tamanio = tamanio;
        this.color = color;
    } 

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void imprimirInformacion() {
        System.out.println("Informacion del animal: ");
        System.out.println("Especie: "+getEspecie());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad()+" anios");  
        System.out.println("Peso: "+getPeso()+"kg");
        System.out.println("Tamanio: "+getTamanio()+"cm");
        System.out.println("Color: "+getColor());
        
        
    }
        
        
        
}
