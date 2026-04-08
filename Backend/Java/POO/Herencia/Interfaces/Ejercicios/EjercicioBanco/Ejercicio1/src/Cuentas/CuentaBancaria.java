package Cuentas;
import Interfaces.*;
import Excepciones.*;

public abstract class CuentaBancaria implements Notificable, Transferible {

    protected String numeroCuenta;
    protected String titular;
    protected double saldo;
    protected boolean activa;

    // Constructor con validación
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial, boolean activa)
        throws DatosInvalidosException {
        if (numeroCuenta.isEmpty() || titular.isEmpty() || saldoInicial < 0) {
            throw new DatosInvalidosException("Número de cuenta y titular no pueden estar vacíos.");
        } else {
            this.numeroCuenta = numeroCuenta;
            this.titular = titular;
            this.saldo = saldoInicial;
            this.activa = activa;
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

        @Override
        public String toString() {
            return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo
                    + ", activa=" + activa + "]";
        }

        public String getNumeroCuenta() {
            return numeroCuenta;
        }

        public void setNumeroCuenta(String numeroCuenta) {
            this.numeroCuenta = numeroCuenta;
        }

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public boolean isActiva() {
            return activa;
        }

        public void setActiva(boolean activa) {
            this.activa = activa;
        }

} 
