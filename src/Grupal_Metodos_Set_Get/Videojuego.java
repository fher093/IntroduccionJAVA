
package Grupal_Metodos_Set_Get;

public class Videojuego {
    private String titulo; 
    private String fecha; 
    private String plataforma;
    private int  peso; 
    private boolean multijugador; 
    private double precio; 

    public Videojuego() {
    }

    public Videojuego(String titulo, String fecha, String plataforma, int peso, boolean multijugador, 
            double precio) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.plataforma = plataforma;
        this.peso = peso;
        this.multijugador = multijugador;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean getMultijugador() {
        return multijugador;
    }

    public void setMultijugador(boolean multijugador) {
        this.multijugador = multijugador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
     
    public void imprimirInformacion(){
        System.out.println("Informacion del videojuego: ");
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Fecha de lanzamiento: "+getFecha()); 
        System.out.println("Plataforma: "+getPlataforma()); 
        System.out.println("Peso: "+getPeso()+" gb");
        System.out.println("Multijugador: "+getMultijugador());
        System.out.println("Precio: "+getPrecio()+"$");
}
    
}
