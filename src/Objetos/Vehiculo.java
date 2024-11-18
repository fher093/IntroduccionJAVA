
package Objetos;

public class Vehiculo {
    private String  marca;  
    private int anio; 
    private int kilometraje; 
    private String tipoMotor;
    private boolean matriculado; 
    private String tipoFrenos;

    public Vehiculo() {
    }

    public Vehiculo(String marca, int anio, int kilometraje, String tipoMotor, boolean matriculado, String tipoFrenos) {
        this.marca = marca;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.tipoMotor = tipoMotor;
        this.matriculado = matriculado;
        this.tipoFrenos = tipoFrenos;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public boolean getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
     
        public String getTipoFrenos() {
        return tipoFrenos;
    }

    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }

    public void imprimirInformacion(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Anio: "+getAnio());
        System.out.println("Kilometraje: "+getKilometraje());
        System.out.println("Tipo de Motor: "+getTipoMotor()); 
        System.out.println("Tipo de Frenos: "+getTipoFrenos());
        System.out.println("Matricula al dia: "+getMatriculado());
        
    }
}
