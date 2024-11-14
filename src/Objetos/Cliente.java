
package Objetos;

public class Cliente extends Persona{
    private String tipoCliente; 

    public Cliente() {
    }

    
    
    public Cliente(String tipoCliente, String cedula, String nombre, String apellido, int edad, double estatura, boolean donante) {
        super(cedula, nombre, apellido, edad, estatura, donante);
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    } 
    
    @Override
    public void saludo(){
        super.saludo();
        System.out.println("tipo de cliente: "+getTipoCliente());
    }
   
}
