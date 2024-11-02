
package Grupal_Metodos_Set_Get;

public class Aeropuerto {
    private String nombre; 
    private String ubicacion; 
    private int pistas; 
    private int companias; 
    private int capacidad; 
    private int horas; 

    public Aeropuerto() {
    }

    public Aeropuerto(String nombre, String ubicacion, int pistas, int companias, int capacidad, int horas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.pistas = pistas;
        this.companias = companias;
        this.capacidad = capacidad;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPistas() {
        return pistas;
    }

    public void setPistas(int pistas) {
        this.pistas = pistas;
    }

    public int getCompanias() {
        return companias;
    }

    public void setCompanias(int companias) {
        this.companias = companias;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public void imprimirInformacion(){
        System.out.println("Informacion Aeropuerto");
        System.out.println("nombre: "+getNombre()); 
        System.out.println("Ubicacion: "+getUbicacion());
        System.out.println("Numero de pistas: "+getPistas()+" pistas"); 
        System.out.println("Companias que operan: "+getCompanias() + " companias"); 
        System.out.println("Capacidad: "+getCapacidad()); 
        System.out.println("Hora de operacion : "+getHoras());
    }
    
    
    
}
