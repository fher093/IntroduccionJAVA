
package Objetos;

public class Motocicleta extends Vehiculo{
    private String tipoManillar; 
    private String tipoSuspencion;
    private boolean maletaCarga;  

    public Motocicleta(String tipoManillar, String tipoSuspencion, boolean maletaCarga, String marca, int anio, int kilometraje, String tipoMotor, boolean matriculado, String tipoFrenos) {
        super(marca, anio, kilometraje, tipoMotor, matriculado, tipoFrenos);
        this.tipoManillar = tipoManillar;
        this.tipoSuspencion = tipoSuspencion;
        this.maletaCarga = maletaCarga;
    }

    public String getTipoManillar() {
        return tipoManillar;
    }

    public void setTipoManillar(String tipoManillar) {
        this.tipoManillar = tipoManillar;
    }

    public String getTipoSuspencion() {
        return tipoSuspencion;
    }

    public void setTipoSuspencion(String tipoSuspencion) {
        this.tipoSuspencion = tipoSuspencion;
    }

    public boolean getMaletaCarga() {
        return maletaCarga;
    }

    public void setMaletaCarga(boolean maletaCarga) {
        this.maletaCarga = maletaCarga;
    }
    
    @Override 
    
    public void imprimirInformacion(){
        System.out.println("Motocicleta");
        super.imprimirInformacion(); 
        System.out.println("Tipo de manillar: "+getTipoManillar());
        System.out.println("Tipo de Suspencion: "+getTipoSuspencion());
        System.out.println("Tiene maleta de carga: "+getMaletaCarga());
    }
    
}
