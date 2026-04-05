package Excepciones;

public class SaldoInsuficienteException extends Exception {
    private String message;
    public SaldoInsuficienteException(String message) {
        this.message = message;
    }
    
}
