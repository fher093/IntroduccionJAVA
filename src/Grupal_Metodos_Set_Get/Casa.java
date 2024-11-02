
package Grupal_Metodos_Set_Get;

public class Casa { 
    private String direccion; 
    private int habitaciones; 
    private int banios; 
    private double tamanio; 
    private int pisos; 
    private int antiguedad;
    private double precio;

    public Casa() {
    }

    public Casa(String direccion, int habitaciones, int banios, double tamanio, int pisos, int antiguedad, double precio) {
        this.direccion = direccion;
        this.habitaciones = habitaciones;
        this.banios = banios;
        this.tamanio = tamanio;
        this.pisos = pisos;
        this.antiguedad = antiguedad;
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void imprimirInformacion(){
        System.out.println("Informacion Terreno");
        System.out.println("Direccion: "+getDireccion()); 
        System.out.println("Numero de habitaciones: "+getHabitaciones()); 
        System.out.println("Tamanio: "+getTamanio()+"m2");
        System.out.println("Numero de banios: "+getBanios()); 
        System.out.println("Numero de pisos "+getPisos()+" pisos"); 
        System.out.println("Antiguedad: "+getAntiguedad()+" anios"); 
        System.out.println("Precio: "+getPrecio()+"$");
    }

    
    
}
