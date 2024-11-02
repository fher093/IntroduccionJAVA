
package Grupal_Metodos_Set_Get;


public class Persona {
        
    private String cedula; 
    private String nombre; 
    private int edad; 
    private char genero; 
    private String direccion; 
    private String correo;
    private String telefono;

    public Persona() {
    }

    public Persona(String cedula, String nombre, int edad, char genero, String direccion, String correo, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    } 

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
   
    public String getTelefono() {
        return telefono;
    } 

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    } 
    
    public void imprimirInformacion() {
        System.out.println("INFORMACION:");
        System.out.println("Cedula: " + getCedula());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Genero: " + getGenero());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Telefono: " + getTelefono());
    }
   
}
