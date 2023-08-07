
package Servicios;

import clasesdeserviciojava01egg.CuentaBancaria;
import java.util.Scanner;


public class CuentaBancariaServicio {
    
    private Scanner scanner = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        
        System.out.print("Ingrese el DNI del cliente: ");
        long dniCliente = scanner.nextLong();
        
        System.out.print("Ingrese el saldo actual: ");
        double saldoActual = scanner.nextDouble();
        
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresar(CuentaBancaria cuenta, double cantidad) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
        System.out.println("Se ha ingresado $" + cantidad + " a la cuenta.");
    }

    public void retirar(CuentaBancaria cuenta, double cantidad) {
        if (cuenta.getSaldoActual() >= cantidad) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
            System.out.println("Se ha retirado $" + cantidad + " de la cuenta.");
        } else {
            double maxRetiro = cuenta.getSaldoActual();
            cuenta.setSaldoActual(0);
            System.out.println("No se puede retirar la cantidad solicitada. Se ha retirado $" + maxRetiro + " de la cuenta.");
        }
    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        double maxRetiro = cuenta.getSaldoActual() * 0.2;
        cuenta.setSaldoActual(cuenta.getSaldoActual() - maxRetiro);
        System.out.println("Se ha realizado una extracción rápida de $" + maxRetiro);
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Saldo disponible: $" + cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: $" + cuenta.getSaldoActual());
    }
    
}
