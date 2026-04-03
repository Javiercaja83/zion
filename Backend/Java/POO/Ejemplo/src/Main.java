import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("08945-wvb", 45, 4, 1000, true, false);
        System.out.println(motor.toString());

        ProductoSalud producto = new ProductoSalud(
            "A123",
            "Paracetamol",
            new String[]{"Paracetamol"},
            500,
            "mg",
            LocalDate.of(2025, 12, 31)
        );
        boolean cosa;
        int numeroAlas = 2;
        
        System.out.println(producto.toString());
    Animal animal = new Animal("Cuervo", "CRUAAAA", 2, 2, true);
    System.out.println(animal.esAve(animal.getNumeroAlas()));
    }

}