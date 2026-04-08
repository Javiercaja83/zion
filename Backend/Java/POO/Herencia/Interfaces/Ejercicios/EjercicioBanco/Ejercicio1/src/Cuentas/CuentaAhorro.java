package Cuentas;
import Excepciones.*;
import Interfaces.*;

public class CuentaAhorro extends CuentaBancaria implements Interfaces.Transferible, Interfaces.Notificable {
    private double tasaInteres;

    public CuentaAhorro(String numeroCuenta, String titular, double saldoInicial, boolean activa, double tasaInteres) throws DatosInvalidosException {
        super(numeroCuenta, titular, saldoInicial, activa);
        if (tasaInteres < 0) {
            throw new DatosInvalidosException("La tasa de interés no puede ser negativa.");
        }
        this.tasaInteres = tasaInteres;
    }

    void aplicarInteres() {
        if (activa) {
            double interes = saldo * tasaInteres;
            saldo += interes;
        }
    }

    @Override
    public void depositar(double monto) throws OperacionInvalidaException, DatosInvalidosException{
        realizarDeposito(monto);
    }

    public void realizarDeposito(double monto) throws OperacionInvalidaException, DatosInvalidosException {
        if (monto <= 0) {
            throw new DatosInvalidosException("El monto a depositar debe ser mayor a cero.");
        } else if (!activa) {
            throw new OperacionInvalidaException("La cuenta esta inactiva");
        } else {
            saldo += monto;
            if (notificacionesActivas()) {
                enviarNotificacion("Depósito realizado por: " + monto + ". Nuevo saldo: " + saldo);
            }
        }
    }

    public void retirar(double monto) throws OperacionInvalidaException, SaldoInsuficienteException {
        if(monto <=0){
            throw new OperacionInvalidaException("El monto a retirar debe ser mayor a cero.");
        } else if (!activa) {
            throw new OperacionInvalidaException("La cuenta esta inactiva");
        } else if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar el retiro.");
        } else {
            saldo -= monto;
            if (notificacionesActivas()){
                enviarNotificacion("Retiro realizado por: " + monto + ". Nuevo saldo: "  + saldo);
            }
        }
    }

    public void transferir(CuentaBancaria destino, double monto) throws SaldoInsuficienteException, OperacionInvalidaException, DatosInvalidosException {
        if(monto <=0){
            throw new DatosInvalidosException("El monto a transferir debe ser mayor a cero.");
        } else if (!activa) {
            throw new OperacionInvalidaException("La cuenta esta inactiva");
        } else if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar la transferencia.");
        } else {
            this.retirar(monto);
            destino.depositar(monto);
            if (notificacionesActivas()){
                enviarNotificacion("Transferencia realizada por: " + monto + ". Nuevo saldo: " + saldo);
            }
        }
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificación: " + mensaje);
    }

    @Override
    public boolean notificacionesActivas() {
        return true;
    }
}
