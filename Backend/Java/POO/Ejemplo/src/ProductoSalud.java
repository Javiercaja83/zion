import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;

public class ProductoSalud {
    /*
     * Ejercicio 2:
     * Un producto de salud tiene un código identificador (alfanumérico),
     * un nombre (comercial: Dercutane, Perspirex, etc.),
     * una lista de principios activos (las sustancias que contiene: isotretinoína,
     * ibuprofeno, etc.),
     * una cantidad (puede tener decimales), la unidad de medida de la cantidad
     * (tabletas, cápsulas, mililitros, gramos, etc.)
     * y la fecha de caducidad (clase LocalDate). Algunos productos requieren de
     * receta médica y otros no.
     */
    public String codigoIdentificador;
    public String nombreComercial;
    public String[] principiosActivos;
    public float cantidad;
    public String unidadMedida;
    public LocalDate fechaCaducidad;

    public ProductoSalud() {
    }

    public ProductoSalud(String codigoIdentificador, String nombreComercial, String[] principiosActivos, float cantidad,
            String unidadMedida, LocalDate fechaCaducidad) {
        this.codigoIdentificador = codigoIdentificador;
        this.nombreComercial = nombreComercial;
        this.principiosActivos = principiosActivos;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String[] getPrincipiosActivos() {
        return principiosActivos;
    }

    public void setPrincipiosActivos(String[] principiosActivos) {
        this.principiosActivos = principiosActivos;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "ProductoSalud [codigoIdentificador=" + codigoIdentificador + ", nombreComercial=" + nombreComercial
                + ", principiosActivos=" + Arrays.toString(principiosActivos) + ", cantidad=" + cantidad
                + ", unidadMedida=" + unidadMedida + ", fechaCaducidad=" + fechaCaducidad + "]";
    }

}