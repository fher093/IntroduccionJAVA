
package Grupal_Metodos_Set_Get;


public class Pruebas { 
    public static void main(String[] args) {
        
        // Constructor Predeterminado
            Guitarra guitarra1 = new Guitarra();
            guitarra1.setMarca("Fender");
            guitarra1.setModelo("Stratocaster");
            guitarra1.setAnio(1965);
            guitarra1.setPastillas("Single Coil");
            guitarra1.setPrecio("2500");
            guitarra1.setRelic(true);
            guitarra1.imprimirInformacion();
            System.out.println("");

            // Constructor Parametrizado
            Guitarra guitarra2 = new Guitarra("Gibson", "Les Paul", 1959, "Humbucker", "12000", false);
            guitarra2.imprimirInformacion();


        
    }
    
}
