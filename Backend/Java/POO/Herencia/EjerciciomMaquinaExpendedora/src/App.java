import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // Usa literales decimales en lugar de octales; los ceros a la izquierda causan errores
        ProductoComestible pc1 = new ProductoComestible(1, "Manzana", 1.5, 10, LocalDate.of(2024, 12, 31));
        ProductoComestible pc2 = new ProductoComestible(2, "Galletas", 2.0, 200, LocalDate.of(2025, 1, 15));
        ProductoComestible pc3 = new ProductoComestible(3, "Chocolate", 3.0, 250, LocalDate.of(2024, 11, 30));

        Producto pe1 = new ProductoElectronica(4, "Auriculares", 50.0, "Bluetooth, Cancelación de ruido");
        Producto pe2 = new ProductoElectronica(5, "Altavoz", 30.0, "Bluetooth, Resistente al agua");
        Producto pe3 = new ProductoElectronica(6, "Cargador", 20.0, "USB-C, Carga rápida");

        ProductoUtilidad pu1 = new ProductoUtilidad(7, "Batería Externa", 25.0, "5000mAh, USB-C");
        ProductoUtilidad pu2 = new ProductoUtilidad(8, "Lámpara de escritorio", 40.0, "LED, Regulable");
        ProductoUtilidad pu3 = new ProductoUtilidad(9, "Soporte para laptop", 35.0, "Ajustable, Ventilado");

        // mostrar algunos valores para comprobar que las instancias se crean correctamente
        System.out.println(pc1.getNombre() + " - precio: " + pc1.getPrecio());
        System.out.println(pe1.getNombre() + " (" + ((ProductoElectronica)pe1).getCaracteristicasTecnicas() + ")");
        System.out.println(pu1.getNombre() + " - " + pu1.getDescripcion());

        Dinero dinero = new Dinero()
    }
}
