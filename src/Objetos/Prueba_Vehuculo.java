
package Objetos;

public class Prueba_Vehuculo {
    public static void main(String[] args) {
         
        Automovil carro1 = new Automovil(5, "Automatica", 3.5, "Chevrolet", 2012, 12000, "gasolina", true, "ABS");
        carro1.imprimirInformacion(); 
        System.out.println(" ");
        Motocicleta moto1 = new Motocicleta("Recto", "Trasera", false, "Yamaha", 2020, 2000, "electrico", true, "Disco"); 
        moto1.imprimirInformacion();
        
    }
}
