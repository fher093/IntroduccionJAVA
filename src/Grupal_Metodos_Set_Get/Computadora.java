
package Grupal_Metodos_Set_Get;

public class Computadora {
    private String marca; 
    private String modelo; 
    private String sistema; 
    private String procesador;
    private int memoria;
    private int almacenamiento;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, String sistema, 
            String procesador, int memoria, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistema = sistema;
        this.procesador = procesador;
        this.memoria = memoria;
        this.almacenamiento = almacenamiento;
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

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    public void imprimirInformacion(){
        System.out.println("Informacion Computadora"); 
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Sistema Operativo: "+getSistema()); 
        System.out.println("Procesador: "+getProcesador());
        System.out.println("Memoria: "+getMemoria()+"gb");
        System.out.println("Almacenamiento: "+getAlmacenamiento()+"gb");
    }
    
    
    
    
    
    
    
}
