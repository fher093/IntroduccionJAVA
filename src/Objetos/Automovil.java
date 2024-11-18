
package Objetos;

public class Automovil extends Vehiculo{
    private int numeroPuertas; 
    private String tipoTransmision; 
    private double cilindraje;  

    public Automovil(int numeroPuertas, String tipoTransmision, double cilindraje, String marca, int anio, int kilometraje, String tipoMotor, boolean matriculado, String tipoFrenos) {
        super(marca, anio, kilometraje, tipoMotor, matriculado, tipoFrenos);
        this.numeroPuertas = numeroPuertas;
        this.tipoTransmision = tipoTransmision;
        this.cilindraje = cilindraje;
    }



    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    @Override
    public void imprimirInformacion(){
        System.out.println("Automovil");
        super.imprimirInformacion(); 
        System.out.println("Numero de Puertas: "+getNumeroPuertas());
        System.out.println("Tipo de transmision: "+getTipoTransmision());
        System.out.println("Cilindraje: "+getCilindraje());
    }
    
    
}
