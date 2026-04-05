package Interfaces;
import Excepciones.*;
import Cuentas.CuentaBancaria;

public interface Transferible {
    void transferir(CuentaBancaria destino, double monto)
        throws SaldoInsuficienteException, OperacionInvalidaException, DatosInvalidosException;
}
