package Excepciones;

public class DatosInvalidosException extends Exception {
    private String message;
    public DatosInvalidosException(String message) {
        this.message = message;
    }
}
