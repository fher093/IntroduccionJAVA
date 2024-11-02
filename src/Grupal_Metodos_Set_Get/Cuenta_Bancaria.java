
package Grupal_Metodos_Set_Get;

public class Cuenta_Bancaria { 
    
    private String numeroCuenta;
    private String tipoCuenta;
    private int saldo;
    private String fecha;
    private String titular;
    private int tazaInteres; 

    public Cuenta_Bancaria() {
    }

    public Cuenta_Bancaria(String numeroCuenta, String tipoCuenta, int saldo, String fecha, String titular, int tazaInteres) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.fecha = fecha;
        this.titular = titular;
        this.tazaInteres = tazaInteres;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getTazaInteres() {
        return tazaInteres;
    }

    public void setTazaInteres(int tazaInteres) {
        this.tazaInteres = tazaInteres;
    }
    
    public void imprimirInformacion() {
        System.out.println("Cuenta Bancaria:");
        System.out.println("Numero de Cuenta: " + getNumeroCuenta());
        System.out.println("Tipo de Cuenta: " + getTipoCuenta()); 
        System.out.println("Saldo: " + getSaldo()); 
        System.out.println("Fecha de Apertura: " + getFecha()); 
        System.out.println("Titular de la cuenta: " + getTitular()); 
        System.out.println("Taza de interes: " + getTazaInteres()+"%"); 
       
    
    }
    
}
