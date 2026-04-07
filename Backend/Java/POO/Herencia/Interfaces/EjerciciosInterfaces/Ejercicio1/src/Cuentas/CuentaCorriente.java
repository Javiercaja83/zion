package Cuentas;
import Excepciones.*;
import Interfaces.*;

public class CuentaCorriente extends CuentaBancaria implements Transferible, Notificable {
    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta, String titular, double saldo, boolean activa, double limiteSobregiro) throws DatosInvalidosException {
        super(numeroCuenta, titular, saldo, activa);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void transferir(CuentaBancaria cuentaDestino, double monto) throws SaldoInsuficienteException, OperacionInvalidaException, DatosInvalidosException{
        if (monto <= 0){
            throw new DatosInvalidosException("El monto no puede ser menor o igual a 0");
        }
        if (saldo - monto < -limiteSobregiro){
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar la transferencia");
        }else{ 
        saldo -= monto;
        cuentaDestino.depositar(monto);
        }
        }

    @Override
  
    public void depositar(double monto) throws OperacionInvalidaException, DatosInvalidosException {
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
        } else if (saldo - monto < -limiteSobregiro) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar el retiro.");
        } else {
            saldo -= monto;
            if (notificacionesActivas()){
                enviarNotificacion("Retiro realizado por: " + monto + ". Nuevo saldo: "  + saldo);
            }
        }
    }

    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificación para " + titular + ": " + mensaje);
    }

    public boolean notificacionesActivas() {
        return true; // Suponemos que las notificaciones están activas para esta cuenta
    }
}