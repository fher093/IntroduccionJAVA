
package Grupal_Metodos_Set_Get;

public class Pelicula {
 
    private String titulo; 
    private String director; 
    private String genero;
    private String fecha;
    private int duracion;
    private char clasificacion; 

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, String genero, String fecha, int duracion, char clasificacion) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.fecha = fecha;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public char getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(char clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    public void imprimirInformacion(){
        System.out.println("Informacion de la Pelicula"); 
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Director: "+getDirector());
        System.out.println("Genero: "+getGenero());
        System.out.println("Fecha de lanzamiento: "+getFecha());
        System.out.println("Duracion: "+getDuracion()+"min");
        System.out.println("Clasificacion: "+getClasificacion());
    }
    
    
}
