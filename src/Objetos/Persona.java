
package Objetos;

public class Persona {
    //ATRIBUTOS 
    String cedula; 
    String nombre; 
    String apellido; 
    int edad; 
    double estatura;
    boolean donante; 
    //--------- 
     
    //Constructor Predeterminado
      public Persona( ){
                
      }
      //Constructor Parametrizado 

    public Persona(String cedula, String nombre, String apellido, int edad, double estatura, boolean donante) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
        this.donante = donante;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public boolean getDonante() {
        return donante;
    }

    public void setDonante(boolean donante) {
        this.donante = donante;
    }
    
   public void saludo(){ 
       System.out.println("Mi cedula es: "+getCedula());
       System.out.println("Mi nombre es: "+getNombre());
       System.out.println("Mi apellido es: "+getApellido());
       System.out.println("Mi edad es: "+getEdad());
       System.out.println("Mi estatura es: "+getEstatura());
       System.out.println("Donante: "+getDonante());

       
   } 
   
   public void contarLetras(){
       System.out.println("Mi nombre es: "+getNombre());
       System.out.println("Mi nombre tiene: "+getNombre().length()+" letras");
   }
    
  public void obtenerProvincia(){
      String p = " ";
      int codigo = Integer.parseInt(cedula.substring(0, 2)); 
      
      switch(codigo){
           case 01: p = "Azuay"; break;
          case 02: p = "Bolivar"; break;
          case 03: p = "Canar"; break;
          case 04: p = "Carchi"; break;
          case 05: p = "Chimborazo"; break;
          case 06: p = "Cotopaxi"; break;
          case 07: p = "El Oro"; break;
          case 8: p = "Esmeraldas"; break;
          case 20: p = "Galapagos"; break;
          case 9: p = "Guayas"; break;
          case 10: p = "Imbabura"; break;
          case 11: p = "Loja"; break;
          case 12: p = "Los Ríos"; break;
          case 13: p = "Manabí"; break;
          case 14: p = "Morona Santiago"; break;
          case 15: p = "Napo"; break;
          case 22: p = "Orellana"; break; 
          case 16: p = "Pastaza"; break;
          case 17: p = "Pichincha"; break;
          case 24: p = "Santa Elena"; break;
          case 23: p = "Santo Domingo"; break;
          case 21: p = "Sucumbios"; break;
          case 18: p = "Tungurahua"; break;
          case 19: p = "Zamora-Chinchipe"; break; 
            default: p=" Cedula Incorrecta";
      }
              System.out.println(p);         
  }
}
