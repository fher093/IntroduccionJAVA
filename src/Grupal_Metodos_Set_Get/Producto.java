
package Grupal_Metodos_Set_Get; 


public class Producto {
        private String nombre; 
        private String descripcion; 
        private double precio;
        private int cantidad;
        private String proveedor; 
        private String fecha; 

    public Producto() {
    }

    public Producto(String nombre, String descripcion, double precio, int cantidad, String proveedor, String fecha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
        
      public void imprimirInformacion(){ 
          System.out.println("Informacion del producto: "); 
          System.out.println("Nombre: "+getNombre());
          System.out.println("Descripcion: "+getDescripcion());
          System.out.println("Precio: "+getPrecio()+"$"); 
          System.out.println("Cantidad en stock: "+getCantidad()+" unidades");
          System.out.println("Proveedor: "+getProveedor());
          System.out.println("Fecha de vencimiento: "+getFecha());
      }
        
}
