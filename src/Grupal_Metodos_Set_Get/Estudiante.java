
package Grupal_Metodos_Set_Get;


public class Estudiante { 
    private String nombre; 
    private int edad;
    private char genero;
    private String matricula; 
    private double promedio; 
    private String  carrera; 

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, char genero, String matricula, double promedio, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.matricula = matricula;
        this.promedio = promedio;
        this.carrera = carrera;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
    public String getCarrera() {
        return carrera;
    } 

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    public void imprimirInformacion() {
        System.out.println("Informacion del Estudiante");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Genero: "+getGenero());
        System.out.println("Matricula: "+getMatricula()); 
        System.out.println("Promedio: "+getPromedio());  
        System.out.println("Carrera: "+getCarrera());  
    }
    
    
    
    
    
}
