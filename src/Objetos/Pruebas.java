
package Objetos;

public class Pruebas {
    public static void main(String[] args) {
        //instancias es definri la variable y llamar al constructor 
       
            Persona fernando = new Persona("1850864198", "Fernando", "Llerena", 23, 1.70, true);
            fernando.saludo();//llamda del metodo
           System.out.println(" ");
            //fernando.contarLetras();
            //fernando.obtenerProvincia(); 
            
            Cliente jorge = new Cliente("Regular", "1555611", "Jorge", "Perez", 25, 1.80, true);
            jorge.saludo();
            
            
            
            
            
    }   
}
