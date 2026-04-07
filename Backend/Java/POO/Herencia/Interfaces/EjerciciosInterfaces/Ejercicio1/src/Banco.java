import java.util.ArrayList;
import java.util.Scanner;

import Cuentas.CuentaAhorro;
import Cuentas.CuentaBancaria;
import Cuentas.CuentaCorriente;
import Interfaces.*;
import Excepciones.*;

public class Banco {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

    public static void main(String[] args) {
        menuPrincipal();

    }

    public static void menuPrincipal() {
        System.out.println("=== MENÚ PRINCIPAL ===");
        System.out.println("1. Crear cuenta");
        System.out.println("2. Consultar saldo");
        System.out.println("3. Realizar retiro");
        System.out.println("4. Realizar depósito");
        System.out.println("5. Salir");
        int opcion;
        do {
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    consultarSaldo();
                    break;
                case 3:
                    realizarRetiro();                
                    break;
                case 4:
                    realizarDeposito();
                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema bancario. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción del 1 al 5.");
                    break;
            }
        } while (opcion != 5);
    }

    public static void crearCuenta() {
        System.out.println("=== CREAR CUENTA ==="); /*
    protected String numeroCuenta;
    protected String titular;
    protected double saldo;
    protected boolean activa;
*/
        System.out.println("ingrese el numero de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.println("ingrese el titular de la cuenta:");
        String titular = scanner.nextLine();
        System.out.println("ingrese el saldo inicial:");
        double saldoInicial = Double.parseDouble(scanner.nextLine());
        System.out.println("ingrese el tipo de cuenta (1. Ahorros, 2. Corriente):");
        int tipoCuenta = Integer.parseInt(scanner.nextLine());
        switch (tipoCuenta) {
            case 1:
                System.out.println("¿Desea activar las notificaciones? (s/n):");
                String respuesta = scanner.nextLine();
                boolean notificacionesActivas = respuesta.equalsIgnoreCase("s");
                System.out.println("ingrese la tasa de interes:");
                double tasaInteres = Double.parseDouble(scanner.nextLine());
                try {
                    CuentaAhorro cuentaAhorro = new CuentaAhorro(numeroCuenta, titular, saldoInicial, notificacionesActivas, tasaInteres);
                    cuentas.add(cuentaAhorro);
                } catch (Exception e) {
                    System.out.println("Error al crear la cuenta de ahorro: " + e.getMessage());
                }
                break;
            case 2:
                System.out.println("¿Desea activar las notificaciones? (s/n):");
                String respuestaCorriente = scanner.nextLine();
                boolean notificacionesActivasCorriente = respuestaCorriente.equalsIgnoreCase("s");
                System.out.println("ingrese el limite de sobregiro:");
                double limiteSobregiro = Double.parseDouble(scanner.nextLine());
                try {
                    CuentaCorriente cuentaCorriente = new CuentaCorriente(numeroCuenta, titular, saldoInicial, notificacionesActivasCorriente, limiteSobregiro);
                    cuentas.add(cuentaCorriente);
                } catch (Exception e) {
                    System.out.println("Error al crear la cuenta corriente: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
   
    }
    public static void consultarSaldo() {
        System.out.println("=== CONSULTAR SALDO ===");
        System.out.println("ingrese el numero de cuenta:");
        String numeroCuenta = scanner.nextLine();
        boolean encontrada = false;
        for (CuentaBancaria cuentaBancaria : cuentas) {
            if (cuentaBancaria.getNumeroCuenta().equals(numeroCuenta)) {
                System.out.println("El saldo de la cuenta es: " + cuentaBancaria.getSaldo());
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Cuenta no encontrada.");
        }
    }
    public static void realizarRetiro() {
        System.out.println("=== REALIZAR RETIRO ===");
        System.out.println("Ingrese el numero de cuenta:");
        String numeroCuenta = scanner.nextLine();
        for (CuentaBancaria cuentaBancaria : cuentas) {
            if (cuentaBancaria.getNumeroCuenta().equals(numeroCuenta)) {
                System.out.println("Ingrese el monto a retirar:");
                double monto = Double.parseDouble(scanner.nextLine());
                try {
                    cuentaBancaria.retirar(monto);
                    System.out.println("Retiro realizado con éxito. Nuevo saldo: " + cuentaBancaria.getSaldo());
                } catch (Exception e) {
                    System.out.println("Error al realizar el retiro: " + e.getMessage());
                }
                return;
            }
        }
    }
    public static void realizarDeposito(){
        System.out.println("=== REALIZAR DEPOSITO ===");
        System.out.println("Ingrese el numero de cuenta:");
        String numeroCuenta = scanner.nextLine();
        for (CuentaBancaria cuentaBancaria : cuentas) {
            if (cuentaBancaria.getNumeroCuenta().equals(numeroCuenta)) {
                System.out.println("Ingrese el monto a depositar:");
                double monto = Double.parseDouble(scanner.nextLine());
                try {
                    cuentaBancaria.depositar(monto);
                    System.out.println("Deposito realizado con éxito. Nuevo saldo: " + cuentaBancaria.getSaldo());
                } catch (Exception e) {
                    System.out.println("Error al realizar el deposito: " + e.getMessage());
                }
                return;
            }
        }
    }
}
