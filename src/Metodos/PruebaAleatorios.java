
package Metodos;

public class PruebaAleatorios {
    public static void main(String[] args) { 
        boolean bandera = true;
        do{ 
            System.out.println("1-Lanzamiento de 1 dado");
            System.out.println("2-Lanzamiento de 2 dados");
            System.out.println("3-Genereacion Placa Vehicular"); 
            System.out.println("4-Genereacion de contrasenia de 8 caracteres"); 
            System.out.println("5-salir"); 
            
            int opcion = controldatos.ControlDatos.lecturaEnteros("Escoja una opcion");  
        
            switch (opcion) {
                case 1:
                    System.out.println("Lanzamiento de 1 dado"); 
                    int valor= DatosAleatorios.aleatorio(1, 7); 
                    System.out.println("Cara del dado: "+valor);
                    break;
                case 2:
                    System.out.println("Lanzamiento de 2 dados"); 
                    int dado1= DatosAleatorios.aleatorio(1, 7);  
                    int dado2= DatosAleatorios.aleatorio(1, 7); 
                    System.out.println("Cara del dado 1: "+dado1+" Cara del dado 2: "+dado2);
                    break;
                case 3:
                    System.out.println("Generacion de placa vehicular");   
                    //primera forma
                    char letra1 = DatosAleatorios.letraAleatoria();
                    char letra2 = DatosAleatorios.letraAleatoria();
                    char letra3 = DatosAleatorios.letraAleatoria();
                    int placa = DatosAleatorios.aleatorio(999,10000);  
                    System.out.println("Placa vehicular: "+letra1+letra2+letra3+"-"+placa);
                    //segunda forma  
                    String placas = ""; 
                    for (int i = 0; i < 3; i++) {
                        placas += DatosAleatorios.letraAleatoria();                         
                    } 
                    placas += "-"; 
                    for (int i = 0; i < 4; i++) {
                        placas+= DatosAleatorios.aleatorio(0, 10);
                    } 
                    System.out.println("Placa: "+placas);
                    break;
                case 4:
                    System.out.println("Generacion de contraseña de 8 caracteres");
                    break;
                case 5: 
                    break;
            }
            
        }while(bandera);
    }
}
