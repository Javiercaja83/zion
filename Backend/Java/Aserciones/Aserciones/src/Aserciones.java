
public class Aserciones {
    // assert, palabra clave nativa para Java
    // Se usa para comprobaciones internas durante el desarrollo/debug
    public int dividir(int a, int b) {
    //  Asercion en si  mensaje  de error opcional, la mas util
        assert b != 0 : "El divisor no puede ser cero"; // AssertionError si falla
        return a / b;
    }

}
