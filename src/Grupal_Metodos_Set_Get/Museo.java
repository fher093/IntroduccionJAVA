
package Grupal_Metodos_Set_Get;

public class Museo {
    private String nombre; 
    private String direccion; 
    private int salas; 
    private int colecciones; 
    private String horarioApertura;
    private double precio; 
    private int antiguedad; 

    public Museo() {
    }

    public Museo(String nombre, String direccion, int salas, int colecciones, String horarioApertura, double precio, int antiguedad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salas = salas;
        this.colecciones = colecciones;
        this.horarioApertura = horarioApertura;
        this.precio = precio;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSalas() {
        return salas;
    }

    public void setSalas(int salas) {
        this.salas = salas;
    }

    public int getColecciones() {
        return colecciones;
    }

    public void setColecciones(int colecciones) {
        this.colecciones = colecciones;
    }

    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public void impirmirInformacion(){ 
        System.out.println("Informacion Museo"); 
        System.out.println("Nombre: "+getNombre());
        System.out.println("Direccion: "+getDireccion());
        System.out.println("Numero de salas: "+getSalas()+" salas");
        System.out.println("Colecciones: "+getColecciones());
        System.out.println("Horario de apertura: "+getHorarioApertura()); 
        System.out.println("Precio de entrada: "+getPrecio()+"$");
        System.out.println("Antiguedad: "+getAntiguedad() + " anios"); 
    }
    
    
}
