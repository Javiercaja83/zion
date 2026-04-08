public class ProductoUtilidad extends Producto {
    private String descripcion;          // característica adicional específica de utilidades

    public ProductoUtilidad(int codigo, String nombre, double precio, String descripcion) {
        super(codigo, nombre, precio);      // inicializa los tres campos
        this.descripcion = descripcion;     // guarda la descripción extra
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
