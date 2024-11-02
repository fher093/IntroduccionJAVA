
package Grupal_Metodos_Set_Get;


public class Libro {
    private String titulo; 
    private String autor;
    private String genero;
    private String fecha;
    private String editorial;
    private int paginas; 

    public Libro() {
    }

    public Libro(String titulo, String autor, String genero, String fecha, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.fecha = fecha;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
     public void imprimirInformacion() {
        System.out.println("Infromacion del libro:");
        System.out.println("Titulo: "+getTitulo() );
        System.out.println("Autor: "+getAutor());
        System.out.println("Genero: "+getGenero());
        System.out.println("Fecha de Publicacion: "+getFecha());
        System.out.println("Editoria: "+getEditorial());
        System.out.println("Numero de Paginas: "+getPaginas());
        
     }    
    
}
