package Cuentas;
import Interfaces.*;
import Excepciones.*;

public abstract class CuentaBancaria implements Notificable, Transferible {

    protected String numeroCuenta;
    protected String titular;
    protected double saldo;
    protected boolean activa;

    // Constructor con validación
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial)
        throws DatosInvalidosException {
                if (numeroCuenta.isEmpty() || titular.isEmpty() || saldoInicial < 0) {
                    throw new DatosInvalidosException("Numero de cuenta y titular no pueden estar vacios.");

                }else {
                    this.numeroCuenta = numeroCuenta;
                    this.titular = titular;
                    this.saldo = saldoInicial;
                    this.activa = true;
                }
        }

        public abstract void depositar(double monto) throws OperacionInvalidaException, DatosInvalidosException;
        public abstract void retirar(double monto) throws SaldoInsuficienteException, OperacionInvalidaException;

        public double consultarSaldo() {
         if (activa) {
            if (notificacionesActivas() == true) {
                enviarNotificacion("Consulta de saldo realizada. Saldo actual: " + saldo);
            }
         }
            return saldo;
        }

} 
