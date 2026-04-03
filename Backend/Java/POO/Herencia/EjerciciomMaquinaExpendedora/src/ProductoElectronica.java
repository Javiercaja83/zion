public class ProductoElectronica extends Producto {
    private String caracteristicasTecnicas;

    public ProductoElectronica(int codigo, String nombre, double precio, String caracteristicasTecnicas) {
        super(codigo, nombre, precio);
        this.caracteristicasTecnicas = caracteristicasTecnicas;
    }

    public String getCaracteristicasTecnicas() {
        return caracteristicasTecnicas;
    }

    public void setCaracteristicasTecnicas(String caracteristicasTecnicas) {
        this.caracteristicasTecnicas = caracteristicasTecnicas;
    }

}
