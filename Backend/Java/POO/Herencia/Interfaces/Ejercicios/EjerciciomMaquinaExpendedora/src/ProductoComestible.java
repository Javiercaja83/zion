import java.time.LocalDate;

public class ProductoComestible extends Producto {
    private float kilokalorias;
    private LocalDate fechaCaducidad;
    
    public ProductoComestible(int codigo, String nombre, double precio, float kilokalorias, LocalDate fechaCaducidad ) {
        super(codigo, nombre, precio);
        this.kilokalorias = kilokalorias;
        this.fechaCaducidad = fechaCaducidad;
    }
    public float getKilokalorias() {
        return kilokalorias;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }


}