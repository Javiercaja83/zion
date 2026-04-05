package Excepciones;

public class OperacionInvalidaException extends Exception {
    private String message;
    public OperacionInvalidaException(String message) {
        this.message = message;
    }
    
}
