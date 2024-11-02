
package Grupal_Metodos_Set_Get;


public class Telefono {
    private String marca; 
    private String modelo; 
    private double pantalla; 
    private int almacenamiento;
    private String sistema; 
    private String camara; 
    private double precio; 

    public Telefono() {
    }

    public Telefono(String marca, String modelo, double pantalla, int almacenamiento, 
            String sistema, String camara, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.almacenamiento = almacenamiento;
        this.sistema = sistema;
        this.camara = camara;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
     
    public void imprimirInformacion(){ 
        System.out.println("Informacion telefono movil"); 
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo()); 
        System.out.println("Tamanio de pantalla: "+getPantalla()+" pul"); 
        System.out.println("Capacidad: "+getAlmacenamiento()+" gb");
        System.out.println("Sistema Operativo: "+getSistema());
        System.out.println("Camara: "+getCamara());
        System.out.println("Precio: "+getPrecio()+"$");
    }
    
    
    
}
